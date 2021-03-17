// Bug happens on JVM 
// !LANGUAGE: +NewCapturedReceiverFieldNamingConvention
// IGNORE_BACKEND: JVM_IR
// FILE: tmp.kt


inline class A(val x: Int) {
    fun f()  = super.hashCode()
}

