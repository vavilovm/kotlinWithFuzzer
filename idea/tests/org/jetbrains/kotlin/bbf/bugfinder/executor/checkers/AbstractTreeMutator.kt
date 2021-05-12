package org.jetbrains.kotlin.bbf.bugfinder.executor.checkers

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.CommonCompiler
import org.jetbrains.kotlin.bbf.bugfinder.executor.CompilerArgs
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.BBFFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Header
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.LANGUAGE
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Project
import org.jetbrains.kotlin.bbf.reduktor.parser.PSICreator

class AbstractTreeMutator(private val compilers: List<CommonCompiler>, val configuration: Header) {
    constructor(compiler: CommonCompiler, configuration: Header) : this(listOf(compiler), configuration)

    private fun prepareChecker(file: PsiFile): MutationChecker {
        val tmpName = "${CompilerArgs.pathToTmpDir}/tmp.kt"
        val ctx = PSICreator.analyze(file)
        val bbfFile = BBFFile(tmpName, file, ctx)
        val pr = Project(configuration, listOf(bbfFile), LANGUAGE.KOTLIN)
        return MutationChecker(compilers, pr, pr.files.first())
    }

    fun replacePSINodeIfPossible(file: PsiFile, node: PsiElement, replacement: PsiElement) =
        prepareChecker(file).replacePSINodeIfPossible(node, replacement)

    fun replaceNodeIfPossible(file: PsiFile, node: ASTNode, replacement: ASTNode) =
        prepareChecker(file).replaceNodeIfPossible(node, replacement)

    fun replaceNodeIfPossibleWithNode(file: PsiFile, node: ASTNode, replacement: ASTNode) =
        prepareChecker(file).replaceNodeIfPossibleWithNode(node, replacement)

    fun addNodeIfPossible(file: PsiFile, anchor: PsiElement, node: PsiElement, before: Boolean = false) =
        prepareChecker(file).addNodeIfPossible(anchor, node, before)

    fun checkCompiling(file: PsiFile) = prepareChecker(file).checkCompiling()

    fun addNodeIfPossibleWithNode(
        file: PsiFile,
        anchor: PsiElement,
        node: PsiElement,
        before: Boolean = false
    ): PsiElement? = prepareChecker(file).addNodeIfPossibleWithNode(anchor, node, before)
}