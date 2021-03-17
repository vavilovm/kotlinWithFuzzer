// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp.kt


open class Kl2<smth0> {
fun foo(p1: smth0): Int = TODO()
fun foo(par1: String): Int = TODO()
}
class Kl1 : Kl2<String>()

