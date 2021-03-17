// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

interface IFoo<T : IFoo<T>> {
    fun foo(t: T): String = TODO()
    fun bar(): String
}

inline class Z(val x: String) : IFoo<Z> {
    override fun bar(): String = TODO()
}

tailrec fun box(): String =
    TODO()
