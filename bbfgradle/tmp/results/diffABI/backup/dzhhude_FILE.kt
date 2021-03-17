// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

inline class Z(val x: String)
class WithNative {

    companion object {
        @JvmStatic external fun bar(l: (String)?, s: Int): ((Long)?)?
    }
}

fun box():(Double)? = TODO()
