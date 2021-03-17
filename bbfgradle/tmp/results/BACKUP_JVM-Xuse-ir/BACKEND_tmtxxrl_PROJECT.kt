// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// WITH_COROUTINES
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


fun bar(): Any  = 
fun 
() = (::bar)!!

