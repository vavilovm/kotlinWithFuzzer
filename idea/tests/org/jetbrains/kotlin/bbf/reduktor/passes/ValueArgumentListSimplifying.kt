package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.bbf.bugfinder.util.replaceThis
import org.jetbrains.kotlin.psi.*

class ValueArgumentListSimplifying : SimplificationPass() {

    override fun simplify() {
        file.getAllPSIChildrenOfType<KtValueArgumentList>().reversed().forEach { argList ->
            if (argList.arguments.size == 0) return@forEach
            var i = 0
            while (i < argList.arguments.size - 1) {
                val cur = argList.arguments[i].copy() as KtValueArgument
                val next = argList.arguments[i + 1]
                argList.removeArgument(i)
                if (!checker.checkTest()) {
                    ++i
                    argList.addArgumentBefore(cur, next)
                }
            }
            //Handle last arg
            val last = argList.arguments.last()
            val argListCopy = argList.copy() as KtValueArgumentList
            argList.removeArgument(last)
            if (!checker.checkTest()) {
                argList.replaceThis(argListCopy)
            }
        }
    }

}