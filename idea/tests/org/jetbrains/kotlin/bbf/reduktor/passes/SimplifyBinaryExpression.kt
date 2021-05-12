package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.psi.KtBinaryExpression

class SimplifyBinaryExpression : SimplificationPass() {
    override fun simplify() {
        file.getAllPSIChildrenOfType<KtBinaryExpression>().reversed().forEach { binExp ->
            tryToReplace(binExp, true)
        }
        file.getAllPSIChildrenOfType<KtBinaryExpression>().reversed().forEach { binExp ->
            tryToReplace(binExp, false)
        }
    }

    //leftOrRight = true if left
    private fun tryToReplace(binExp: KtBinaryExpression, leftOrRight: Boolean): Boolean {
        val replacement = if (leftOrRight) binExp.left else binExp.right
        replacement?.let { return checker.replaceNodeIfPossible(binExp, it) }
        return false
    }
}