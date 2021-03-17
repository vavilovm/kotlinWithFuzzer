// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt

inline class Z(val x: Int) {
    fun test() = x
}

inline class L(val x: Long) {
    fun test() = x
}

inline class S(val x: String) {
    fun test() = x
}

fun box(): String {
    if (Z(42)::test.invoke() != 42) throw AssertionError()
    if (L(1234L)::test.invoke() != 1234L) throw AssertionError()
    if (S("abcdef")::test.invoke() != "abcdef") throw AssertionError()

    return "OK"
}
