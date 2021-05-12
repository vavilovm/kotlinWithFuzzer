package org.jetbrains.kotlin.bbf.bugfinder.mutator.transformations

import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.bbf.reduktor.parser.PSICreator
import org.jetbrains.kotlin.psi.KtPsiFactory

object Factory {
    lateinit var file: PsiFile
    val psiFactory
        get() = KtPsiFactory(file.project)
}
//abstract class Factory {
//    companion object {
//
//        val psiFactory = KtPsiFactory(file.project)
//    }
//
//    val psiFactory = KtPsiFactory(file.project)
//}