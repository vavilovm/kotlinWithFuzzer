// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

interface IFoo {
    fun foo(): String
}

inline class IC(val x: String) : IFoo {
    private fun privateFun() = x
    override fun foo() = privateFun()
}

fun box(): String {
    val x: IFoo = IC("OK")
    return x.foo()
}
