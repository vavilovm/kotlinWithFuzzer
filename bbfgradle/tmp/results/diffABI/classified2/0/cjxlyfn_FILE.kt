// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

fun <T> T.runExt(fn: T.() -> String) = fn()

inline class R(private val r: String) {
    fun test() = runExt { r }
}

fun box() = R("OK").test()
