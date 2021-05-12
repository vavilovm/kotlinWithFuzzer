package org.jetbrains.kotlin.bbf.bugfinder.generator.constructor

import com.intellij.lang.ASTNode
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.bbf.bugfinder.util.flatMap

class ConstructionContext {

    fun getUsageOfType(type: KotlinType): UsingExample? {
        val usagesOfNeededType = classesAndUsages.values
            .filterNotNull()
            .flatMap { it.filter { it.type == type } }
        return if (usagesOfNeededType.isEmpty()) null else usagesOfNeededType.random()
    }

    var classesAndUsages: MutableMap<ASTNode, List<UsingExample>?> = mutableMapOf()
}

data class UsingExample(val node: ASTNode, val type: KotlinType) {

}