// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box(): Any {
val prop1 = 1
class Kl0 {
fun f0(): Any {
Kl0()
            prop1
            return Kl0()
        }
}
Kl0().f0()
return "OK"
}