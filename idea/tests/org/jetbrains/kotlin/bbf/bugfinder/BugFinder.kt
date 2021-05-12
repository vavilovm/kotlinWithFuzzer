package org.jetbrains.kotlin.bbf.bugfinder

import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.CompilerArgs
import org.jetbrains.kotlin.bbf.bugfinder.executor.checkers.MutationChecker
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.BBFFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Project
import org.jetbrains.kotlin.bbf.bugfinder.mutator.Mutator
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Transformation
import org.apache.log4j.Logger
import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtClass

open class BugFinder(protected val dir: String) {

    protected val compilers = CompilerArgs.getCompilersList()

    fun mutate(
        project: Project,
        curFile: BBFFile,
        conditions: List<(PsiFile) -> Boolean> = listOf()
    ) {
        Transformation.checker = MutationChecker(
                compilers,
                project,
                curFile
            ).also { checker -> conditions.forEach { checker.additionalConditions.add(it) } }
        Mutator(project).startMutate()
    }

    protected val log = Logger.getLogger("bugFinderLogger")

}