package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.reduktor.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.jetbrains.kotlin.psi.KtTypeReference

class TypeChanger : SimplificationPass() {

    override fun simplify() {
        val types = file.getAllPSIChildrenOfType<KtTypeReference>()
        types.forEach { type ->
            if (standardTypes.any { type.text.contains(it) }) return@forEach
            for (standardType in standardTypes) {
                if (checker.replaceNodeIfPossible(type, KtPsiFactory(file.project).createType(standardType))) break
            }
        }
    }

    private val standardTypes = listOf("Int", "Any", "Double", "Char")
}