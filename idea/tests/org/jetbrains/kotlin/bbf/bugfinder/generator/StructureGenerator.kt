package org.jetbrains.kotlin.bbf.bugfinder.generator

import org.jetbrains.kotlin.bbf.bugfinder.executor.CompilerArgs
import org.jetbrains.kotlin.bbf.bugfinder.generator.subjectgenerator.Expression
import org.jetbrains.kotlin.bbf.bugfinder.util.debugPrint
import org.jetbrains.kotlin.bbf.reduktor.parser.PSICreator
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtPsiFactory
import java.io.File

class StructureGenerator {

    fun generate(): KtFile {
        File(CompilerArgs.pathToTmpFile).writeText("")
        val resultFile = PSICreator("").getPSIForFile(CompilerArgs.pathToTmpFile)
        Expression.factory = KtPsiFactory(resultFile.project)
        resultFile.debugPrint()
        System.exit(0)
        return resultFile
    }
}