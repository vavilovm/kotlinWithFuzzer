// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

data class A(val s: String) : Cloneable {
    fun externalClone(): A = clone() as A
}

fun box(): String {
    val a = A("OK")
    val b = a.externalClone()
    if (a != b) return "Fail equals"
    if (a === b) return "Fail identity"
    return b.s
}
