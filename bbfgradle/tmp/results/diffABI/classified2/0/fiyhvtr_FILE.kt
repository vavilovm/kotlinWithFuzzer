// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

inline class IC(val x: String) {
    private fun privateFun() = x
    override fun toString() = privateFun()
}

fun box(): String {
    val x: Any = IC("OK")
    return x.toString()
}
