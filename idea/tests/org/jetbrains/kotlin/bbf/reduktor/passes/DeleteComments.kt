package org.jetbrains.kotlin.bbf.reduktor.passes

import com.intellij.psi.PsiComment
import org.jetbrains.kotlin.bbf.reduktor.executor.CompilerTestChecker
import org.jetbrains.kotlin.bbf.reduktor.util.getAllPSIChildrenOfType

class DeleteComments(private val checker: CompilerTestChecker): SimplificationPass() {

    override fun simplify() {
        file.getAllPSIChildrenOfType<PsiComment>().forEach { checker.removeNodeIfPossible(it.node) }
    }
}

