// Bug happens on JVM
//File: tmp/tmp0.kt

open class Kl0(par1: Int)

fun box()  {
    var prop1 = 1
    class Kl1 : Kl0(prop1) {
        init {
            Kl1()
        }
    }
}
