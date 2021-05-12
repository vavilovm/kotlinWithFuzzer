package org.jetbrains.kotlin.bbf.bugfinder.executor

import com.intellij.psi.PsiErrorElement
import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.checkers.CompilationChecker
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.BBFFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.LANGUAGE
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Project
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory
import org.jetbrains.kotlin.bbf.bugfinder.util.StatisticCollector
import org.jetbrains.kotlin.bbf.reduktor.parser.PSICreator
import org.jetbrains.kotlin.bbf.reduktor.util.getAllPSIChildrenOfType
import org.apache.log4j.Logger
import org.jetbrains.kotlin.bbf.bugfinder.executor.checkers.IntentionsChecker
import org.jetbrains.kotlin.bbf.bugfinder.manager.BugManager
import org.jetbrains.kotlin.bbf.reduktor.util.getAllChildren
import kotlin.system.exitProcess

//Project adaptation
open class Checker(compilers: List<CommonCompiler>, private val withTracesCheck: Boolean = true) :
    CompilationChecker(compilers) {

    constructor(compiler: CommonCompiler) : this(listOf(compiler))

    //Back compatibility
    fun checkTextCompiling(text: String): Boolean = checkCompilingWithBugSaving(Project.createFromCode(text), null)
    fun checkCompilingWithBugSaving(file: PsiFile): Boolean = checkTextCompiling(file.text)


    private fun createPsiAndCheckOnErrors(text: String, language: LANGUAGE): Boolean =
        when (language) {
            LANGUAGE.JAVA -> PSICreator("").getPsiForJava(text, Factory.file.project)
            else -> Factory.psiFactory.createFile(text)
        }.let { tree ->
            tree.getAllPSIChildrenOfType<PsiErrorElement>().isEmpty() && additionalConditions.all { it.invoke(tree) }
        }

    //FALSE IF ERROR
    private fun checkSyntaxCorrectnessAndAddCond(project: Project, curFile: BBFFile?) =
        curFile?.let {
            createPsiAndCheckOnErrors(curFile.text, curFile.getLanguage())
        } ?: project.files.any { createPsiAndCheckOnErrors(it.text, it.getLanguage()) }


    fun checkCompiling(project: Project): Boolean {
        val allTexts = project.files.map { it.psiFile.text }.joinToString()
        checkedConfigurations[allTexts]?.let { log.debug("Already checked"); return it }
        //Checking syntax correction
        if (!checkSyntaxCorrectnessAndAddCond(project, null)) {
            log.debug("Wrong syntax or breaks conditions")
            checkedConfigurations[allTexts] = false
            return false
        }
        val statuses = compileAndGetStatuses(project)
        return if (statuses.all { it == COMPILE_STATUS.OK }) {
            checkedConfigurations[allTexts] = true
            true
        } else {
            checkedConfigurations[allTexts] = false
            false
        }
    }

    fun checkCompilingWithBugSaving(project: Project, curFile: BBFFile? = null): Boolean {
        log.debug("Compilation checking started")
        val allTexts = project.files.map { it.psiFile.text }.joinToString()
        checkedConfigurations[allTexts]?.let { log.debug("Already checked"); return it }
        //Checking syntax correction
        if (!checkSyntaxCorrectnessAndAddCond(project, curFile)) {
            log.debug("Wrong syntax or breaks conditions")
            StatisticCollector.incField("Incorrect programs")
            checkedConfigurations[allTexts] = false
            return false
        }
        val status = compileAndGetStatuses(project)[0]
        return if (status == COMPILE_STATUS.OK) {
            checkIntentions(project, allTexts)
            true
        } else false
    }

    private fun checkIntentions(project: Project, text: String) {
        val length = text.length
        for (intention in IntentionsChecker.intentions) {
            var posExecuted = -1;
            for (pos in 0 until length) {
                try {
                    val newCode = IntentionsChecker.runIntentionInPos(text, intention, pos)
                    if (newCode != null && !checkedConfigurations.containsKey(newCode)) {
                        log.debug("After applying of ${intention.familyName}:\n$newCode")
                        val psiForNewCode = Factory.psiFactory.createFile(newCode)
                        if (psiForNewCode.getAllChildren().any { it is PsiErrorElement }) {
                            BugManager.saveIntentionBug(text, newCode, intention.familyName)
                            checkedConfigurations[newCode] = false
                            continue
                        }
                        val oldPsiFile = project.files.first().psiFile
                        project.files.first().unsafeReplacingOfPsiFile(psiForNewCode)
                        println("CHECKING COMPILATION OF\n ${project}")
                        //Check correctness
                        if (compileAndGetStatuses(project).first() != COMPILE_STATUS.OK) {
                            println("RES = NO")
                            BugManager.saveIntentionBug(text, newCode, intention.familyName)
                            checkedConfigurations[newCode] = false
                        } else {
                            println("RES = YES")
                            val createFromCode = Project.createFromCode(newCode)
                            println("created")

                            checkTracesOnTmpProject(createFromCode)
//                            println("checked")
                            checkedConfigurations[newCode] = true
                        }
                        project.files.first().unsafeReplacingOfPsiFile(oldPsiFile)
                        println("REPLACED BACK")
                        posExecuted = pos
                    } //else println("NO")
                } catch (e: Exception) {
                    continue
                } catch (e: Error) {
                    continue
                }
            }
        }
        return
    }

    val additionalConditions: MutableList<(PsiFile) -> Boolean> = mutableListOf()

    private val checkedConfigurations = hashMapOf<String, Boolean>()
    private val log = Logger.getLogger("mutatorLogger")
}