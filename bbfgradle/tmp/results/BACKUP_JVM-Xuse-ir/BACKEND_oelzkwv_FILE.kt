// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
class Kl0 : Throwable {
constructor() : super()
}
fun box()  {
    val prop0:Any = TODO()
Kl0().cause != {prop0 = Kl0()}
}
