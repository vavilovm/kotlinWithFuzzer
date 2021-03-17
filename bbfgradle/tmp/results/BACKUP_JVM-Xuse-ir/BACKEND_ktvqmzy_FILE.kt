// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt


fun f2(fn: suspend () -> Int): Any = TODO()
class Kl0 {
    fun f13():Int = TODO()
}
fun f1(c: Kl0) = f2(c::f13)

