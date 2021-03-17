// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

inline class A(val b: String) {
    override fun toString(): String =
        buildString { append(b) }
}

fun box() = A("OK").toString()
