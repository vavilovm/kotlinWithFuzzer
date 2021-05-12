package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.reduktor.util.getAllChildrenNodes
import org.jetbrains.kotlin.bbf.reduktor.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.KtNodeTypes
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.jetbrains.kotlin.psi.KtReturnExpression

class ReturnValueToConstant : SimplificationPass() {

    override fun simplify() {
        val functions = file.getAllPSIChildrenOfType<KtNamedFunction>()
        for (f in functions) {
            if (typeConstants.containsKey(f.typeReference?.text)) {
                val returns = f.node.getAllChildrenNodes()
                        .filter { it.elementType == KtNodeTypes.RETURN }
                        .map { it.psi as KtReturnExpression }
                for (r in returns) {
                    val type = f.typeReference!!.text
                    val replace = KtPsiFactory(file.project).createExpression(typeConstants[type]!!)
                    if (r.returnedExpression != null)
                        checker.replaceNodeIfPossible(r.returnedExpression!!.node, replace.node)
                }
            }
        }
    }

    private val typeConstants = mapOf(Pair("Int", "1"), Pair("Double", "0.0"), Pair("String", "\"\""))
}