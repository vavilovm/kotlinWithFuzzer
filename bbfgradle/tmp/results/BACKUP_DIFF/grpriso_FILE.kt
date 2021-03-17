// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

fun box(): Any {
(1 downTo 1u).iterator().next()
return "ufbfukbavt"
}
