package org.jetbrains.kotlin.bbf.bugfinder.util

import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.psi.KtNamedFunction

fun noBoxFunModifying(file: PsiFile): Boolean {
    val boxFun =
        file.getAllPSIChildrenOfType<KtNamedFunction>().firstOrNull { it.name?.contains("box") ?: false} ?: return false
    //Check if top level
    return boxFun.isTopLevel
}