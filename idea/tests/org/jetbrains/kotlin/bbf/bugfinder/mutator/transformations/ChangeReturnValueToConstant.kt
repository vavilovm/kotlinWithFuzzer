package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations

import org.jetbrains.kotlin.KtNodeTypes
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.jetbrains.kotlin.psi.KtReturnExpression

import org.jetbrains.kotlin.bbf.bugfinder.util.getAllChildrenNodes
import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.bbf.bugfinder.util.getRandomBoolean

class ChangeReturnValueToConstant : Transformation() {

    override fun transform() {
        val functions = file.getAllPSIChildrenOfType<KtNamedFunction>().filter { getRandomBoolean() }
        for (f in functions) {
            val key = typeConstants.keys.find { f.typeReference?.text?.startsWith(it) == true } ?: continue
            val returns = f.node.getAllChildrenNodes()
                    .asSequence()
                    .filter { it.elementType == KtNodeTypes.RETURN }
                    .map { it.psi as KtReturnExpression }
                    .toList()
            for (r in returns) {
                val replacement = KtPsiFactory(file.project).createExpression(typeConstants[key]!!)
                if (r.returnedExpression != null) {
                    checker.replacePSINodeIfPossible(r.returnedExpression!!, replacement)
                }
            }
        }
    }

    //TODO make for a sortedMap, huyap etc.
    private val typeConstants = mapOf(Pair("Int", "1"), Pair("Double", "0.0"), Pair("String", "\"\""),
            Pair("ArrayList", "arrayListOf()"), Pair("List", "listOf()"), Pair("Set", "setOf()"), Pair("Map", "mapOf()"),
            Pair("Array", "arrayOf()"))
}