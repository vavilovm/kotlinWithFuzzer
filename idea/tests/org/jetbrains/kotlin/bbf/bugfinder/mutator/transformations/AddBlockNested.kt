/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations

import org.jetbrains.kotlin.bbf.bugfinder.util.getAllPSIChildrenOfType
import org.jetbrains.kotlin.bbf.bugfinder.util.getRandomVariableName
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.startOffset
import java.util.*


class AddBlockNested : Transformation() {

    override fun transform() {
        val expr1 = file.getAllPSIChildrenOfType<KtIfExpression>()
        val expr2 = file.getAllPSIChildrenOfType<KtWhenExpression>()
        generate(expr1)
        generate(expr2)
    }

    private fun generate(expr: List<KtExpression>) {
        expr.forEach {
            generateRandomBooleanExpression(it)?.let { blockExpr ->
                checker.replacePSINodeIfPossible(it, blockExpr)
            }
        }
    }

    private fun generateRandomBooleanExpression(exp: KtExpression): KtBlockExpression? {
        val varList = mutableListOf<String>()
        val names = mutableListOf<String>()
        val logicalOps = listOf("&&", "||")
        repeat(Random().nextInt(randomConst) + 1) {
            val name = Random().getRandomVariableName(randomConst)
            val value = Random().nextBoolean()
            names.add(name)
            varList.add("val $name = $value")
        }
        val expr = StringBuilder()
        names.forEach {
            if (it != names.last())
                expr.append("$it ${logicalOps[Random().nextInt(2)]} ")
            else
                expr.append(it)
        }
        return try {
            val res = when (Random().nextInt(2)) {
                0 -> Factory.psiFactory.createExpression("if (${expr}) {${exp.text}} else {${exp.text}}") as KtIfExpression
                else -> Factory.psiFactory.createExpression("when (${expr}) {\n true -> {${exp.text}}\n else -> {${exp.text}}\n}") as KtWhenExpression
            }
            val block = Factory.psiFactory.createBlock(varList.joinToString("\n") + "\n${res.text}")
            //Remove braces
            block.deleteChildInternal(block.lBrace!!.node)
            block.deleteChildInternal(block.rBrace!!.node)
            block
        } catch (e: Exception) {
            null
        }
    }

    //!!!!
//    private val randomConst = 5
    private val randomConst = 1
}