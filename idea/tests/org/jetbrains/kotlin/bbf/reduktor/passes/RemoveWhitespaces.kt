package org.jetbrains.kotlin.bbf.reduktor.passes

import com.intellij.psi.PsiWhiteSpace
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory
import org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations.Factory.psiFactory
import org.jetbrains.kotlin.bbf.reduktor.util.getAllChildrenNodes
import java.lang.StringBuilder

class RemoveWhitespaces : SimplificationPass() {

    override fun simplify() {
        file.node.getAllChildrenNodes()
            .filter { it.psi is PsiWhiteSpace }
            .filter { it.text.count { it == '\n' } > 1 }
            .forEach {
                val count = it.text.count { it == '\n' }
                for (i in 1 until count) {
                    val newWhitespace =
                        psiFactory.createWhiteSpace(StringBuilder().also { str -> repeat(i) { str.append("\n") } }
                            .toString())
                    log.debug("TRYING TO REPLACE ${count} on ${newWhitespace.text.count { it == '\n' }}: ")
                    val res = checker.replaceNodeIfPossible(it, newWhitespace.node)
                    log.debug(res)
                    if (res) break
                }
                //checker.replaceNodeIfPossible(it, psiFactory.createWhiteSpace("\n").node)
            }
        val children = file.node.getAllChildrenNodes()
        children
            .filterIndexed { index, astNode -> index > 0 && children[index - 1] is PsiWhiteSpace && astNode.psi is PsiWhiteSpace }
            .forEach { checker.replaceNodeIfPossible(it.psi, Factory.psiFactory.createWhiteSpace(" ")) }
    }
}