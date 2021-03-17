// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp.kt


inline class A(val value: Int)
fun interface I {
    fun compute(): A
}
fun f(i: I):Int = TODO()
fun g()  = 
    f {
TODO() }

