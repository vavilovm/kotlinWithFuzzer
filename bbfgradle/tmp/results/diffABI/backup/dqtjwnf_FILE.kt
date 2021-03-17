// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

interface PsiElement {
    fun <T: UInt> findChildByType(Data: PsiElement?): T =
            TODO()
}

inline

fun box():Int = TODO()
