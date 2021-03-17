// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND: JVM
// FILE: tmp0.kt

inline class A(val x: Int) {
    fun f()  = super.hashCode()
}

