package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.abi

import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Transformation
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.abi.generators.*
import org.jetbrains.kotlin.bbf.bugfinder.util.typeGenerators.RandomTypeGenerator
import org.jetbrains.kotlin.bbf.reduktor.parser.PSICreator
import org.jetbrains.kotlin.bbf.reduktor.util.replaceThis
import org.jetbrains.kotlin.psi.KtFile
import kotlin.system.exitProcess

class AddRandomDS : Transformation() {

    private var ctx = PSICreator.analyze(file)!!
    var tries = 14
    var enoughClasses = 7

    private fun update() {
        checker.curFile.replacePsiFile(file.text)
        ctx = PSICreator.analyze(file)!!
        GeneratorFactory.update(file as KtFile, ctx)
        RandomTypeGenerator.setFileAndContext(file as KtFile, ctx)
    }

    override fun transform() {
        var successClasses = 0
        for (i in 0 until tries) {
            update()
            //TODO!!!!
            val generator = GeneratorFactory.getRandomGenerator()
            //val generator = RandomClassGenerator(file as KtFile, ctx)
            val addedPsiElement = generator.generateAndAddToFile() ?: continue
            val res = checker.checkCompiling()
            //println("RES = $res")
            if (!res) {
                //println("CANT COMPILE =((\n${file.text}\n_______________________________________")
                val psiWhiteSpace = Factory.psiFactory.createWhiteSpace("\n")
                addedPsiElement.replaceThis(psiWhiteSpace)
                if (!checker.checkCompiling()) {
                    println(file.text)
                    exitProcess(0)
                }
            } else if (generator is AbstractClassGenerator) successClasses++
            if (successClasses == enoughClasses) break
        }
    }

}