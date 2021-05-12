package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations

import org.jetbrains.kotlin.psi.KtExpression

import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.bbf.bugfinder.util.getRandomBoolean
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory.psiFactory as psiFactory

class AddNotNullAssertions : Transformation() {


    override fun transform() {
        file.getAllPSIChildrenOfType<KtExpression>()
            .filter { getRandomBoolean(3) }
            .map { tryToAddNotNullAssertion(it) }
    }

    private fun tryToAddNotNullAssertion(exp: KtExpression) {
        try {
            val newExp = psiFactory.createExpressionIfPossible("${exp.text}!!") ?: return
            checker.replacePSINodeIfPossible(exp, newExp)
        } catch (e: Exception) {
            return
        }
    }
}
