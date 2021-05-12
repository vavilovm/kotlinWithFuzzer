package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations

import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFunction
import org.jetbrains.kotlin.psi.KtModifierList
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.bbf.bugfinder.util.getAllChildrenNodes
import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.psi.addRemoveModifier.setModifierList
import java.util.*

class ChangeModifiers : Transformation() {
    override fun transform() {
        for (i in 0..RANDOM_CONST) {
            val modifiersLists = file.getAllPSIChildrenOfType<KtModifierList>().filter { Random().nextBoolean() }
            for (modList in modifiersLists) {
                val workingList =
                        when (modList.parent) {
                            is KtProperty -> possiblePropertyModifiers
                            is KtFunction -> possibleFunctionModifiers
                            is KtClass -> possibleClassModifiers
                            else -> return
                        }
                val parent =
                        when (modList.parent) {
                            is KtProperty -> modList.parent as KtProperty
                            is KtFunction -> modList.parent as KtFunction
                            is KtClass -> modList.parent as KtClass
                            else -> return
                        }
                val modifiers = modList.node.getAllChildrenNodes()
                for (m in modifiers) {
                    val ind = workingList.indexOf(m.text)
                    if (ind == -1) continue
                    val newModIndex = Random().nextInt(workingList.size)
                    val keyword = KtTokens.MODIFIER_KEYWORDS_ARRAY.find { it.value == workingList[newModIndex] }
                            ?: continue
                    val oldKeyword = KtTokens.MODIFIER_KEYWORDS_ARRAY.find { it.value == m.text } ?: continue
                    val oldModList = parent.modifierList!!.copy() as KtModifierList
                    parent.removeModifier(oldKeyword)
                    parent.addModifier(keyword)
                    if (!checker.checkCompilingWithBugSaving(file)) {
                        parent.setModifierList(oldModList)
                    }
                }
            }
        }
    }

    private val possibleClassModifiers = listOf("private", "protected", "internal", "public", "open", "inner", "sealed",
            "data", "abstract", "enum")

    private val possiblePropertyModifiers = listOf("lateinit", "override", "open", "final", "abstract", "private",
            "public", "protected", "internal", "const")

    private val possibleFunctionModifiers = listOf("tailrec", "operator", "infix", "external", "lateinit",
            "override", "open", "final", "abstract", "private", "public", "protected", "internal", "const")

    val RANDOM_CONST = 10
}