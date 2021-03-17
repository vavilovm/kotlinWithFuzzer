// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

inline class Z(val x: (Int)?)

class WithNative {
    companion object {
        @JvmStatic external fun bar(l: (Long)?, s: String): Double
    }
}

fun box():(String)? = TODO()
