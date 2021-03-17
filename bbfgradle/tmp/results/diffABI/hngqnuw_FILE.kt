// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

interface PsiElement {
    fun <T: UInt> findChildByType(Data: Int): T? =
            TODO()
}

inline

fun box():Array<Int> = TODO()
