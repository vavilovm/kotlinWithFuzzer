package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.reduktor.util.getAllChildrenNodes
import org.jetbrains.kotlin.bbf.reduktor.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.bbf.reduktor.util.replaceThis

import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtTryExpression

class TryCatchDeleter : SimplificationPass() {

    override fun simplify() {
        val tryExpressions = file.getAllPSIChildrenOfType<KtTryExpression>()
        for (t in tryExpressions) {
            if (t.node.getAllChildrenNodes().all { it.elementType != KtTokens.TRY_KEYWORD }) continue
            val tryBackup = t.copy()
            val block = t.tryBlock
            if (block.lBrace != null) {
                //Delete braces
                block.deleteChildInternal(block.lBrace!!.node)
                block.deleteChildInternal(block.rBrace!!.node)
            }
            t.replaceThis(block)
            if (!checker.checkTest()) {
                block.replaceThis(tryBackup)
            }
//            //Try to replace
//            val backup = checker.replaceNodeOnItChild(file, t.node, block.node) as? KtTryExpression?
//            if (backup != null) {
//                //val afterTryNode = backup.allChildren.toList()[1].node
//                //backup.node.addChild(oldBlock.node, afterTryNode)
//            }
        }
    }

}