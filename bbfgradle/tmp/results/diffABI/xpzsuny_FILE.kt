// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM, JVM_IR, JS, JS_IR, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt

inline class Z(val s: Int) {
    val String.s: Int get() = 239
}

fun box(): String =TODO()

fun TODO(arg: Char): String ="ohpvq"
fun TODO(arg: Int = 42): String =TODO()
