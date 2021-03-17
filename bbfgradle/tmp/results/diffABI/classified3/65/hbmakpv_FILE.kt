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
    if (Z::test.invoke(Z(42)) != 42) throw AssertionError()
    if (L::test.invoke(L(1234L)) != 1234L) throw AssertionError()
    if (S::test.invoke(S("abcdef")) != "abcdef") throw AssertionError()

    return "OK"
}
