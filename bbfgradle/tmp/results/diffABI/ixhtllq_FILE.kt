// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

interface IFoo<T : IFoo<T>> {
    fun foo(t: T): String = t.bar()
    fun bar(): String
}

inline class Z(val x: Int) : IFoo<Z> {
    override fun bar(): String = "OK"
}

fun box(): String =
    Z(1).foo(Z(2))
