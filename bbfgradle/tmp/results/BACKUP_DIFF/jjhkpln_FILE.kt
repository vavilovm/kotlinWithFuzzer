// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box(): Any {
var prop1: Any? = null
val par0 = arrayOf(""  ).iterator().next()
class Kl0 {
            val prop1 = par0
inner class Kl1 {
                fun f0() = Kl0()
            }
}
prop1 = Kl0()
val prop2 = (prop1 as Kl0).Kl1().f0()
return "OK"
}