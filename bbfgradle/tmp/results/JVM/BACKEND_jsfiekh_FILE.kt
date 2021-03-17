// Bug happens on JVM 
// WITH_REFLECT
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt


val Any.x: Any get() = this
fun box()   =
Short::x
