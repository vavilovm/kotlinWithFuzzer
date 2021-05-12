package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.reduktor.util.getAllChildrenNodes
import org.jetbrains.kotlin.KtNodeTypes
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtBinaryExpression

class ElvisOperatorSimplifier: SimplificationPass() {

    override fun simplify() {
        var elvExpr = getAllElvisExpressions()
        for (b in elvExpr) {
            checker.replaceNodeIfPossible(b.node, b.right!!.node)
        }
        elvExpr = getAllElvisExpressions()
        for (b in elvExpr) {
            checker.replaceNodeIfPossible(b.node, b.left!!.node)
        }
    }

    private fun getAllElvisExpressions() = file.node.getAllChildrenNodes()
            .map { it.psi }
            .filter {
                it is KtBinaryExpression && it.node.findChildByType(KtNodeTypes.OPERATION_REFERENCE) != null
                        && it.operationToken == KtTokens.ELVIS && it.left != null && it.right != null
            }
            .map { it as KtBinaryExpression }
}