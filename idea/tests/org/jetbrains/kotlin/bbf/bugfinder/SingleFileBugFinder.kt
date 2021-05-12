package org.jetbrains.kotlin.bbf.bugfinder

import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.CompilerArgs
import org.jetbrains.kotlin.bbf.bugfinder.executor.checkers.MutationChecker
import org.jetbrains.kotlin.bbf.bugfinder.executor.checkers.TracesChecker
import org.jetbrains.kotlin.bbf.bugfinder.executor.compilers.JVMCompiler
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.*
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Transformation
import org.jetbrains.kotlin.bbf.bugfinder.tracer.Tracer
import org.jetbrains.kotlin.bbf.bugfinder.util.BBFProperties
import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfTwoTypes
import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtClassOrObject
import org.jetbrains.kotlin.psi.KtEnumEntry
import org.jetbrains.kotlin.psi.KtNamedFunction
import java.io.File
import kotlin.system.exitProcess

class SingleFileBugFinder(dir: String) : BugFinder(dir) {

    fun findIntentionsBugs(psiFile: PsiFile) {
        val code = psiFile.text
        val configuration = Header.createHeader(getCommentSection(code))
        val fileName = "${CompilerArgs.pathToTmpDir}/${psiFile.name}"
        val bbfFile = BBFFile(fileName, psiFile)
        val project = Project(configuration, listOf(bbfFile))
        mutate(project, bbfFile)
        println("FINISH")
        return
    }

    fun findBugsInFile() {
        try {
            println("Let's go")
            ++counter
            log.debug("Name = $dir")
            val project = Project.createFromCode(File(dir).readText())
            if (project.language != LANGUAGE.KOTLIN) return
            if (project.files.isEmpty() || project.files.size != 1) {
                log.debug("Cant create project")
                return
            }
            if (project.files.first().psiFile.getAllPSIChildrenOfType<KtNamedFunction> { it.isTopLevel }.size < 2) {
                if (project.files.first().psiFile.getAllPSIChildrenOfTwoTypes<KtClassOrObject, KtEnumEntry>().isEmpty()) {
                    log.debug("Uninteresting test")
                    return
                }
            }
            val compilersConf = BBFProperties.getStringGroupWithoutQuotes("BACKENDS")
            val filterBackends = compilersConf.map { it.key }
            if (filterBackends.any { project.isBackendIgnores(it) }) {
                //TODO disable?
                log.debug("Ignore some of backends")
            }
            if (compilers.any { !it.checkCompiling(project) }) {
                log.debug("Can not compile $dir")
                return
            }
            log.debug("Start to mutate")
            log.debug("BEFORE = ${project.files.first().text}")
            //ProjectPreprocessor.preprocess(project, null)
            val checker = MutationChecker(listOf(JVMCompiler(""), JVMCompiler("-Xuse-ir")), project, project.files.first())
            if (!checker.checkCompiling()) {
                log.debug("=(")
                exitProcess(0)
            }
            mutate(project, project.files.first(), listOf(/*::noBoxFunModifying*/))
//            //Save mutated file
//            if (CompilerArgs.shouldSaveMutatedFiles) {
//                val pathToNewTests = CompilerArgs.dirForNewTests
//                File(pathToNewTests).mkdirs()
//                val pathToSave = "$pathToNewTests/${Random().getRandomVariableName(10)}.kt"
//                File(pathToSave).writeText(resultingMutant.text)
//            }
            log.debug("Mutated = $project")
            if (!CompilerArgs.isMiscompilationMode) {
                Tracer(compilers.first(), project).trace()
                log.debug("Traced = $project")
                TracesChecker(compilers).checkBehavior(project)
            }
            return
        } catch (e: Error) {
            log.debug("ERROR: ${e.localizedMessage}\n${e.stackTrace.map { it.toString() + "\n" }}")
            return
            //System.exit(0)
        }
    }

    var counter = 0
}