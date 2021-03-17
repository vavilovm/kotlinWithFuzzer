// Different compile happens on:JVM ,JVM -Xnew-inference
interface PsiElement 
    fun <T: Long
> findChildByType(): T
 =
            TODO()
interface JetSimpleNameExpression : PsiElement {
    fun getReferencedNameElement(): PsiElement
}
class JetLabelReferenceExpression : JetSimpleNameExpression {
override fun getReferencedNameElement()  =
            findChildByType() ?: JetLabelReferenceExpression()
}
