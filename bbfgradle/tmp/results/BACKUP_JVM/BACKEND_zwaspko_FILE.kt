// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


fun box() = 1UL !in 1 until 1UL

