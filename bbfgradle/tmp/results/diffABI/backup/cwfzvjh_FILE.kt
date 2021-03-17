// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

inline class L(val x: String) {
    inner class Inner(val y: Int) {
        val xx = x
    }
}
class stringPredicate {
// TARGET_BACKEND: JVM

}

    // Test that SAM wrappers with type parameters are cached properly.
// IGNORE_BACKEND_FIR: JVM_IR
fun intPredicate(xx: (
        Int, Int, Int, Int, Int, Int, Int, Int, Int, Int,
        Int, Int, Int, Int, Int, Int, Int, Int, Int, Int,
        Int, Int, Int, Int, Int, Int, Int, Int, Int, Int,
        Int, Int, Int, Int, Int, Int, Int, Int, Int, Int
    ) -> String, p: Int): Long =TODO()
// FILE: test.kt

// FULL_JDK
// SKIP_JDK6
    

fun box():(Boolean) -> String = TODO()fun stringPredicate.A(String: Boolean, string: Boolean): Boolean =TODO()
// WITH_RUNTIME
