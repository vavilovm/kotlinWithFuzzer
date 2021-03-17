// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class Foo(val a: String) {
    fun test(): String {
        return a + inlineFun()
    }
}

inline fun inlineFun(): String = "K"

fun box(): String {
    val f = Foo("O")
    return f.test()
}
