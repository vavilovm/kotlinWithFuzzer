// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline fun <T> T.runInlineExt(fn: T.() -> String) = fn()

inline class R(private val r: String) {
    fun test() = runInlineExt { r }
}

fun box() = R("OK").test()
