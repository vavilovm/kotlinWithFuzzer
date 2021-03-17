// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS, JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt


fun <T> testIntersection():Int where T : Any, T : (@Int
Boolean) -> Int =TODO()

