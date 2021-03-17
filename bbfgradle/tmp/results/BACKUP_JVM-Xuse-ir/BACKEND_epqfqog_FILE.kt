// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.test.assertEquals
class Kl0 {
object Kl1 
}
fun box1()  {
    val prop0 = Kl0.Kl1::class.members
.first { 
val l = false
l
 }
assertEquals( TODO(),prop0
.callBy((::Kl0)!!.single
            ))
}
