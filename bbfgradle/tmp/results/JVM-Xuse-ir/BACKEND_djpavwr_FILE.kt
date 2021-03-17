// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

@Suppress("UNRESOLVED_REFERENCE") class ResultT {
    val String: Any get() = value is Int
}

