package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations


import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtWhenExpression
import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.bbf.bugfinder.util.getRandomBoolean
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory.psiFactory as psiFactory

class AddBracketsToExpression : Transformation() {

    override fun transform() {
        file.getAllPSIChildrenOfType<KtExpression>()
            .filter { getRandomBoolean(4) }
            .forEach {
                if (it is KtWhenExpression) return@forEach
                try {
                    val newExpr = psiFactory.createExpression("(${it.text})")
                    checker.replacePSINodeIfPossible(it, newExpr)
                } catch (e: Exception) {
                    return@forEach
                }
            }
    }
}