// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

@Suppress("UNRESOLVED_REFERENCE") class ResultT {
    val String: Any get() = value is Int
}

