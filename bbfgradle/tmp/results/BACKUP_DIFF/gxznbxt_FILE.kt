// Bug happens on JVM , JAVA
//File: tmp/tmp0.kt

class Kl0 {
fun f0()   {
     null!!
  }
}
fun box() : Any {
val prop1 = Kl0()
.f0()
return "OK"
}
