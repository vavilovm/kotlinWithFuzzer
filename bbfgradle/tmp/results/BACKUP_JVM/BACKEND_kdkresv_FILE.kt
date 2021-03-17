// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.reflect.KProperty0
class A
fun callTwice(x: KProperty0<Int>): Int = TODO()
fun box()  {
callTwice((A::equals)!!
::p)
}
