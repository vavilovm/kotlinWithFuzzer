// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

internal interface Wvz {
    fun f(): Int = TODO()
}

open class Yxg : Wvz

internal abstract class Lhm : Wvz, Yxg()
