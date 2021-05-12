package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations

import org.jetbrains.kotlin.psi.KtExpression

import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.bbf.bugfinder.util.getRandomBoolean
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory.psiFactory as psiFactory

class ChangeVarToNull : Transformation() {

    override fun transform() {
        file.getAllPSIChildrenOfType<KtExpression>()
                .filter { getRandomBoolean(16) }
                .forEach { checker.replacePSINodeIfPossible(it, psiFactory.createExpression("null")) }
    }

}