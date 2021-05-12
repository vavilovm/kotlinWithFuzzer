package org.jetbrains.kotlin.bbf.reduktor.executor

import com.intellij.lang.ASTNode
import com.intellij.lang.FileASTNode
import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.BBFFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Project
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSourceLocation

interface CompilerTestChecker {

    fun removeNodeIfPossible(node: ASTNode): Boolean
    fun removeNodesIfPossible(nodes: List<ASTNode>): Boolean
    fun replaceNodeIfPossible(node: ASTNode, replacement: ASTNode): Boolean
    fun replaceNodeIfPossible(node: PsiElement, replacement: PsiElement) =
            replaceNodeIfPossible(node.node, replacement.node)
    fun replaceNodeOnItChild(node: ASTNode, replacement: ASTNode): ASTNode? = node

    @Deprecated("")
    fun replaceNodeIfPossible(tree: FileASTNode, node: ASTNode, replacement: ASTNode): Boolean
    @Deprecated("")
    fun removeNodeIfPossible(tree: FileASTNode, node: ASTNode): Boolean

    fun checkTest(): Boolean
    fun checkTest(text: String): Boolean

    fun getErrorMessage(): String
    fun getErrorMessageWithLocation(): Pair<String, List<CompilerMessageSourceLocation>>

    fun refreshAlreadyCheckedConfigurations() {
        alreadyChecked.clear()
    }

    val project: Project
    var curFile: BBFFile
    val alreadyChecked: HashMap<Int, Boolean>
}