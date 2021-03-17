// Bug happens on JVM 
//File: tmp/tmp0.kt

fun box1()  {
    val three:Any = TODO()
open class Local(val one: Int) {
fun value() = "$three$one"
    }
data class Derived(val two: Int) : Local(1)
}