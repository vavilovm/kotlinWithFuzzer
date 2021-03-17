// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

inline class A(val x: Int) {
    fun f()  = super.hashCode()
}

