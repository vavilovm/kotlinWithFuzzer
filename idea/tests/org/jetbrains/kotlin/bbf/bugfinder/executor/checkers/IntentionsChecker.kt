///*
// * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
// * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
// */

package org.jetbrains.kotlin.bbf.bugfinder.executor.checkers

import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.SingleFileBugFinderWrapper
import org.jetbrains.kotlin.idea.intentions.AbstractBBFIntentionTest

object IntentionsChecker {
    lateinit var intentionExecutor: AbstractBBFIntentionTest

//    fun run(text: String) {
//        println("check intentions")
//        val length = text.length
//        println(text)
//
//        for (intention in intentions) {
//            println(intention.text)
//            var posExecuted = -1;
//            for (pos in 0..length - 1) {
//                val newCode = runIntentionInPos(text, intention, pos)
//                if (newCode != null) {
//                    println("YES")
//                    posExecuted = pos
////                        checkTraces(Project.createFromCode(newCode))
////                    checkTracesOnTmpProject(Project.createFromCode(newCode))
//                } else println("NO")
//            }
//            println(posExecuted)
//        }
//    }

    fun runIntentionInPos(text: String, intention: IntentionAction, pos: Int): String? {
        if (!intentionExecutor.isConfigured)
            intentionExecutor.configureByText(text)

        if (intentionExecutor.editor.caretModel.offset != pos)
            intentionExecutor.editor.caretModel.moveToOffset(pos)
        intentionExecutor.isConfigured = true


        if (intentionExecutor.runIntention(intention)) {
            intentionExecutor.isConfigured = false
            return intentionExecutor.editor.document.text

        }

        return null
    }

    fun runIntentionInPosReturnPsi(text: String, intention: IntentionAction, pos: Int): PsiFile? {
        if (!intentionExecutor.isConfigured)
            intentionExecutor.configureByText(text)

        if (intentionExecutor.editor.caretModel.offset != pos)
            intentionExecutor.editor.caretModel.moveToOffset(pos)
        intentionExecutor.isConfigured = true


        if (intentionExecutor.runIntention(intention)) {
            intentionExecutor.isConfigured = false
            return intentionExecutor.file
        }
        return null
    }

    private val intentionNames = arrayOf(
        "org.jetbrains.kotlin.idea.intentions.AddBracesIntention",
        "org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention",
        "org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention",
//        "org.jetbrains.kotlin.idea.quickfix.AddConstModifierIntention",
//        "org.jetbrains.kotlin.idea.intentions.AddLabeledReturnInLambdaIntention",
//        "org.jetbrains.kotlin.idea.intentions.AnonymousFunctionToLambdaIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.FoldIfToReturnAsymmetricallyIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldAssignmentToIfIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldAssignmentToWhenIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldPropertyToIfIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldPropertyToWhenIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention",
//        "org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.FlattenWhenIntention",
//        "org.jetbrains.kotlin.idea.intentions.ChopArgumentListIntention",
//        "org.jetbrains.kotlin.idea.intentions.ChopParameterListIntention",
//        "org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceCallWithUnaryOperatorIntention",
//        "org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceContainsIntention",
//        "org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceInvokeIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertBlockCommentToLineCommentIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertCamelCaseTestFunctionToSpacedIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertCollectionConstructorToFunction",
//        "org.jetbrains.kotlin.idea.intentions.ConvertForEachToForLoopIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertFunctionTypeParameterToReceiverIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertFunctionToPropertyIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertFunctionTypeReceiverToParameterIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertLambdaToMultiLineIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertLambdaToSingleLineIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertLateinitPropertyToNullableIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertLazyPropertyToOrdinaryIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertNullablePropertyToLateinitIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertOrdinaryPropertyToLazyIntention",
//        //"org.jetbrains.kotlin.idea.intentions.ConvertParameterToReceiverIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertPrimaryConstructorToSecondaryIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertPropertyGetterToInitializerIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertPropertyToFunctionIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertRangeCheckToTwoComparisonsIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertReceiverToParameterIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertReferenceToLambdaIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertSecondaryConstructorToPrimaryIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertToForEachFunctionCallIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertToRawStringTemplateIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertToAlsoIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertToApplyIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertToRunIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertToWithIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertUnsafeCastCallToUnsafeCastIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertUnsafeCastToUnsafeCastCallIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertVarargParameterToArrayIntention",
//        "org.jetbrains.kotlin.idea.intentions.ConvertVariableAssignmentToExpressionIntention",
//        "org.jetbrains.kotlin.idea.intentions.DestructureIntention",
//        "org.jetbrains.kotlin.idea.intentions.DestructureIntention",
//        "org.jetbrains.kotlin.idea.intentions.EvaluateCompileTimeExpressionIntention",
//        "org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention",
//        "org.jetbrains.kotlin.idea.intentions.IntroduceVariableIntention",
//        "org.jetbrains.kotlin.idea.intentions.DestructureIntention",
//        "org.jetbrains.kotlin.idea.intentions.JoinDeclarationAndAssignmentIntention",
//        "org.jetbrains.kotlin.idea.intentions.LambdaToAnonymousFunctionIntention",
//        "org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopToCallChainIntention",
//        "org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopToLazyCallChainIntention",
//        "org.jetbrains.kotlin.idea.intentions.MovePropertyToClassBodyIntention",
//        //"org.jetbrains.kotlin.idea.intentions.MoveMemberToCompanionObjectIntention",
//        "org.jetbrains.kotlin.idea.intentions.RemoveForLoopIndicesIntention",
//        "org.jetbrains.kotlin.idea.intentions.SamConversionToAnonymousObjectIntention",
//        "org.jetbrains.kotlin.idea.intentions.UsePropertyAccessSyntaxIntention",
//        "org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention"
    )
    val intentions = intentionNames.map(this::getIntentionAction)

    private fun getIntentionAction(intentionName: String): IntentionAction {
        return Class.forName(intentionName).newInstance() as IntentionAction
    }

}