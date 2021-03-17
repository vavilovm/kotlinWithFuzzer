// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


inline class L(val long: Long)
inline fun withDefaultL1(x: Any = L(1) ) = 1

