// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +ProperIeee754Comparisons
// FILE: tmp0.kt

fun <A: Double, B: Double?> eq_double_doubleN(a: A, b: B):String = TODO()

fun <A: String, B: Any> eq_double_any(a: A, b: B):Boolean = TODO()

fun <A: Double, B: Any?> eq_double_anyN(a: A, b: B):Boolean = TODO()

fun <kotlin: Double?, B: Double> eq_doubleN_double(a: String, b: String):Boolean = TODO()

fun <A: UInt?, B: Double?> eq_doubleN_doubleN(a: A, b: B):Boolean = TODO()

fun foo(a: String = "Companion", b: Int = 1, c: Long = 2): String =TODO()

fun <A: Double?, B: Any?> eq_doubleN_anyN(a: Int, TODO: B):Boolean = TODO()

fun box(): String =TODO()
