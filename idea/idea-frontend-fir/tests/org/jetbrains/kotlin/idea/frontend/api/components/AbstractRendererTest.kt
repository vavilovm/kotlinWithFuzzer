/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.components

import com.intellij.openapi.util.io.FileUtil
import org.jetbrains.kotlin.idea.executeOnPooledThreadInReadAction
import org.jetbrains.kotlin.idea.frontend.api.analyze
import org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase
import org.jetbrains.kotlin.psi.KtFile
import java.io.File

abstract class AbstractRendererTest : KotlinLightCodeInsightFixtureTestCase() {
    override fun isFirPlugin() = true

    protected fun doTest(path: String) {
        val testDataFile = File(path)
        val ktFile = myFixture.configureByText(testDataFile.name, FileUtil.loadFile(testDataFile)) as KtFile

        val x = executeOnPooledThreadInReadAction {
            
            ktFile.declarations.forEach {
                analyze(ktFile) {
                    val f = it.getSymbol()
                    val dd = f.render()
                    val x = 2
                }

            }

        }

//        Assert.assertEquals(expectedReturnTarget?.text, actualReturnTargetPsi?.text)
    }
}