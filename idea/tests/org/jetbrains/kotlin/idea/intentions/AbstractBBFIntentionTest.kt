/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.intentions

import com.google.common.collect.Lists
import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.progress.Task
import com.intellij.openapi.progress.util.ProgressIndicatorBase
import com.intellij.openapi.util.Computable
import com.intellij.openapi.util.SystemInfo
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiFile
import com.intellij.refactoring.BaseRefactoringProcessor
import com.intellij.refactoring.util.CommonRefactoringUtil
import com.intellij.testFramework.PlatformTestUtil
import junit.framework.ComparisonFailure
import junit.framework.TestCase
import org.apache.log4j.PropertyConfigurator
import org.jetbrains.annotations.NotNull
import org.jetbrains.kotlin.bbf.bugfinder.SingleFileBugFinder
import org.jetbrains.kotlin.bbf.bugfinder.executor.checkers.IntentionsChecker
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory
import org.jetbrains.kotlin.formatter.FormatSettingsUtil
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.idea.test.*
import org.jetbrains.kotlin.idea.util.application.executeCommand
import org.jetbrains.kotlin.idea.util.application.executeWriteCommand
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.test.InTextDirectivesUtils
import org.jetbrains.kotlin.test.KotlinTestUtils
import org.junit.Assert
import java.io.File
import java.nio.file.Path
import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit

abstract class AbstractBBFIntentionTest : KotlinLightCodeInsightFixtureTestCase() {
    init {
        PropertyConfigurator.configure("./bbfgradle/resources/bbfLog4j.properties")
    }

    @Throws(Exception::class)
    protected fun doTest(path: String) {
        findBugs(path)
    }


    fun findBugs(path: String) {
        project.executeWriteCommand("myTest") {
            val psiFile = myFixture.configureByFiles(path.substringAfterLast('/')).firstOrNull() ?: return@executeWriteCommand
            Factory.file = psiFile
            IntentionsChecker.intentionExecutor = this
            SingleFileBugFinder("").findIntentionsBugs(psiFile)
            return@executeWriteCommand
        }
        return
    }


    fun runIntention(intentionAction: IntentionAction): Boolean {
        if (intentionAction.isAvailable(project, editor, file)) {
            val action = { intentionAction.invoke(project, editor, file) }
            if (intentionAction.startInWriteAction())
                project.executeWriteCommand(intentionAction.text, action)
            else
                project.executeCommand(intentionAction.text, null, action)
            return true
        }
        return false
    }

    fun configureByText(text: String) = myFixture.configureByText(KotlinFileType.INSTANCE, text)

    var isConfigured = false
}