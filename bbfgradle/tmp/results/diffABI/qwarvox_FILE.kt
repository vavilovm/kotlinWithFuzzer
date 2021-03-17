// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: ANDROID
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package foo

class WithNative {
    companion object {
        @JvmStatic external fun bar(l: Unit, s: String): Double
    }
}

object ObjWithNative {
    @JvmStatic external fun bar(escapeChar: Long, s: String): String
}

fun box(): String =TODO()
