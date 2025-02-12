package org.jetbrains.kotlin.bbf.bugfinder.executor.checkers

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.TreeElement
import org.jetbrains.kotlin.bbf.bugfinder.executor.Checker
import org.jetbrains.kotlin.bbf.bugfinder.executor.CommonCompiler
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.BBFFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Project
import org.jetbrains.kotlin.bbf.bugfinder.util.getAllParentsWithoutNode
import org.apache.log4j.Logger

open class MutationChecker(
    compilers: List<CommonCompiler>,
    val project: Project,
    var curFile: BBFFile,
    withTracesCheck: Boolean = true
) :
    Checker(compilers, withTracesCheck) {

    constructor(compiler: CommonCompiler, project: Project, curFile: BBFFile) : this(listOf(compiler), project, curFile)
    constructor(compiler: CommonCompiler, project: Project, curFile: BBFFile, withTracesCheck: Boolean) :
            this(listOf(compiler), project, curFile, withTracesCheck)

    constructor(compiler: CommonCompiler, project: Project) : this(compiler, project, project.files.first())
    constructor(compilers: List<CommonCompiler>, project: Project) : this(compilers, project, project.files.first())

    fun checkCompiling() = checkCompilingWithBugSaving(project, curFile)

    fun replacePSINodeIfPossible(node: PsiElement, replacement: PsiElement) =
        replaceNodeIfPossible(node.node, replacement.node)

    fun replaceNodeIfPossibleWithNode(node: ASTNode, replacement: ASTNode): ASTNode? {
        log.debug("Trying to replace $node on $replacement")
        if (node.text.isEmpty() || node == replacement) {
            return if (checkCompilingWithBugSaving(project, curFile)) node else null
        }
        for (p in node.getAllParentsWithoutNode()) {
            try {
                if (node.treeParent.elementType.index == DUMMY_HOLDER_INDEX) continue
                val oldText = curFile.text
                val replCopy = replacement.copyElement()
                if ((node as TreeElement).treeParent !== p) {
                    continue
                }
                p.replaceChild(node, replCopy)
                if (oldText == curFile.text)
                    continue
                if (!checkCompilingWithBugSaving(project, curFile)) {
                    log.debug("Result = false\nText:\n${curFile.text}")
                    p.replaceChild(replCopy, node)
                    return null
                } else {
                    log.debug("Result = true\nText:\n${curFile.text}")
                    return replCopy
                }
            } catch (e: Error) {
            }
        }
        return null
    }

    fun replaceNodeIfPossible(node: ASTNode, replacement: ASTNode): Boolean =
        replaceNodeIfPossibleWithNode(node, replacement) != null


    fun addNodeIfPossible(anchor: PsiElement, node: PsiElement, before: Boolean = false): Boolean {
        log.debug("Trying to add $node to $anchor")
        if (node.text.isEmpty() || node == anchor) return checkCompilingWithBugSaving(project, curFile)
        try {
            val addedNode =
                if (before) anchor.parent.addBefore(node, anchor)
                else anchor.parent.addAfter(node, anchor)
            if (checkCompilingWithBugSaving(project)) {
                log.debug("Result = true\nText:\n${curFile.text}")
                return true
            }
            log.debug("Result = false\nText:\n${curFile.text}")
            addedNode.parent.node.removeChild(addedNode.node)
            return false
        } catch (e: Throwable) {
            println("e = $e")
            return false
        }
    }

    fun addNodeIfPossibleWithNode(anchor: PsiElement, node: PsiElement, before: Boolean = false): PsiElement? {
        log.debug("Trying to add $node to $anchor")
        if (node.text.isEmpty() || node == anchor) return null
        try {
            val addedNode =
                if (before) anchor.parent.addBefore(node, anchor)
                else anchor.parent.addAfter(node, anchor)
            if (checkCompilingWithBugSaving(project, curFile)) {
                log.debug("Result = true\nText:\n${curFile.text}")
                return addedNode
            }
            log.debug("Result = false\nText:\n${curFile.text}")
            addedNode.parent.node.removeChild(addedNode.node)
            return null
        } catch (e: Throwable) {
            println("e = $e")
            return null
        }
    }

    fun addNodeIfPossible(anchor: ASTNode, node: ASTNode, before: Boolean = false): Boolean =
        addNodeIfPossible(anchor.psi, node.psi, before)

    private val DUMMY_HOLDER_INDEX: Short = 86
    private val log = Logger.getLogger("mutatorLogger")
}