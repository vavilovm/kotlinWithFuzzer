package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations

import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.checkers.MutationChecker
import org.apache.log4j.Logger

abstract class Transformation {
    abstract fun transform()

    companion object {
        lateinit var checker: MutationChecker
        val file: PsiFile
            get() = checker.curFile.psiFile

        //val curProject = checker.project
        internal val log = Logger.getLogger("mutatorLogger")
    }

}