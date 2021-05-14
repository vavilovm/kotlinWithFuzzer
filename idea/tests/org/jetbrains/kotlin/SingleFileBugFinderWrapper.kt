/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin

import com.intellij.testFramework.TestDataPath
import org.apache.log4j.PropertyConfigurator
import org.jetbrains.kotlin.idea.intentions.AbstractBBFIntentionTest
import org.jetbrains.kotlin.test.KotlinTestUtils
import org.jetbrains.kotlin.test.TestMetadata

@TestMetadata("idea/testData/intentionTests")
@TestDataPath("/")
open class SingleFileBugFinderWrapper : AbstractBBFIntentionTest() {

    init {
        PropertyConfigurator.configure("./bbfgradle/resources/bbfLog4j.properties")
    }

//    @Throws(Exception::class)
//    private fun runTest(testDataFilePath: String) {
//        KotlinTestUtils.runTest({ path: String? -> findBugs(path!!) }, this, testDataFilePath)
//    }

    @Throws(Exception::class)
    private fun runTest(testDataFilePath: String) {
        KotlinTestUtils.runTest({ path: String? -> doTest(path!!) }, this, testDataFilePath)
    }


    @TestMetadata("myTest.kt")
    @Throws(java.lang.Exception::class)
    fun testMyTest() {
        runTest("idea/testData/intentionTests/myTest.kt")
    }

//    fun findBugs(path: String) {
//        project.executeWriteCommand("myTest") {
//            val psiFile = myFixture.configureByFiles(path.substringAfterLast('/')).firstOrNull() ?: return@executeWriteCommand
//            Factory.file = psiFile
//            IntentionsChecker.intentionExecutor = this
//            SingleFileBugFinder("").findIntentionsBugs(psiFile)
//            return@executeWriteCommand
//        }
//        return
//    }


//    fun runIntention(intentionAction: IntentionAction): Boolean {
//        if (intentionAction.isAvailable(project, editor, file)) {
//            val action = { intentionAction.invoke(project, editor, file) }
//            if (intentionAction.startInWriteAction())
//                project.executeWriteCommand(intentionAction.text, action)
//            else
//                project.executeCommand(intentionAction.text, null, action)
//            return true
//        }
//        return false
//    }

//    fun configureByText(text: String) = myFixture.configureByText(KotlinFileType.INSTANCE, text)

//    var isConfigured = false

}
