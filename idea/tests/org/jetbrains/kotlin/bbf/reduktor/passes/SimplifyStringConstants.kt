package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.reduktor.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.jetbrains.kotlin.psi.KtStringTemplateExpression

class SimplifyStringConstants : SimplificationPass() {
    override fun simplify() {
        val stringConsts = file.getAllPSIChildrenOfType<KtStringTemplateExpression>()
        stringConsts.forEach { checker.replaceNodeIfPossible(it, KtPsiFactory(file.project).createStringTemplate("")) }
    }
}
