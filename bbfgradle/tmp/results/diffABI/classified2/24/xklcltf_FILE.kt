// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM, JVM_IR, JS, JS_IR, NATIVE
// FILE: tmp0.kt

inline class Z(val s: String) {
    val Int.s: Int get() = 42
}

fun box(): String {
    if (Z("a").toString() == "Z(s=\"a\")")
        return "OK"
    return "Fail"
}
