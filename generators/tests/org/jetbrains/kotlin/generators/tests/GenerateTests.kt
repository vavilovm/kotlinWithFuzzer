/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.generators.tests

import org.jetbrains.kotlin.generators.impl.generateTestGroupSuite
import org.jetbrains.kotlin.idea.intentions.AbstractIntentionTest

import org.jetbrains.kotlin.idea.intentions.AbstractBBFIntentionTest

fun main(args: Array<String>) {
    System.setProperty("java.awt.headless", "true")
    generateTestGroupSuite(args) {
        val excludedFirTestdataPattern = "^(.+)\\.fir\\.kts?\$"

        testGroup("idea/tests", "idea/testData") {
            testClass<AbstractBBFIntentionTest> {
                //model("intentions", pattern = "^([\\w\\-_]+)\\.(kt|kts)$")
                model("intentionTests", pattern = "^([\\w\\-_]+)\\.(kt|kts)$", recursive = false)
                model("intentionTests/arrays", pattern = "^([\\w\\-_]+)\\.(kt|kts)$", recursive = false)
            }
        }
    }
}
