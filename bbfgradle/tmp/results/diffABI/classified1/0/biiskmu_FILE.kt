// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class Foo(val s: String) {
    fun asResult(): String = s
}

fun box(): String {
    val a = Foo("OK")
    return a.asResult()
}
