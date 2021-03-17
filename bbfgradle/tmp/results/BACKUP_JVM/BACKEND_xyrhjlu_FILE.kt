// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.test.assertEquals
open class Kl0<smth1> {
    fun myfu0():Int = TODO()
}
class Kl1<smth1> : Kl0<Int>()
fun box1()   =
assertEquals( TODO(),Kl1<
@Kl1 String>::myfu0.toString())
