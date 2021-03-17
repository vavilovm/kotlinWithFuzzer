// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

interface Kl0 {
    fun foo() = TODO
}
interface Kl2 : Int {
fun foo() = Kl4().foo
}
class Kl4 : Kl3
interface Kl3 : Kl0, Kl2
