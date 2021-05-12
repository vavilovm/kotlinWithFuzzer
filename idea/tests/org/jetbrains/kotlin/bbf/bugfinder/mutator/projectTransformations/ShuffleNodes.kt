package org.jetbrains.kotlin.bbf.bugfinder.mutator.projectTransformations

import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Transformation

class ShuffleNodes : Transformation() {

    override fun transform() = TODO()
//        val numOfSwaps = Random.nextInt(numOfSwaps.first, numOfSwaps.second)
//        val othFiles = checker.otherFiles!!.texts.map { PSICreator("").getPSIForText(it) }
//        val files = listOf(file) + othFiles
//        for (i in 0 until numOfSwaps) {
//            val children = files.flatMap { it.node.getAllChildrenNodes() }
//            ChangeRandomASTNodes.swapRandomNodes(children, psiFactory, files)
//        }
//        checker.otherFiles = Project(othFiles)
//   }

    val numOfSwaps = 500 to 1000

}