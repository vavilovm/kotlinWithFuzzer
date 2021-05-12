package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.reduktor.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.psi.KtBlockExpression
import org.jetbrains.kotlin.psi.psiUtil.parents

class SimplifyBlockExpression : SimplificationPass() {
    override fun simplify() {
        file.getAllPSIChildrenOfType<KtBlockExpression>().forEach { block ->
            val newBlock = block.copy() as KtBlockExpression
            if (newBlock.lBrace != null)
                newBlock.node.removeChild(newBlock.lBrace!!.node)
            if (newBlock.rBrace != null)
                newBlock.node.removeChild(newBlock.rBrace!!.node)
            for (p in block.parents.toList().reversed()) {
                if (checker.replaceNodeIfPossible(p, newBlock))
                    break
            }
        }
    }
}