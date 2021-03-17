// Bug happens on JVM 
//File: tmp/tmp0.kt

interface I2<T> : I<Int>
fun box1()   = 
B()
.g()
interface I<T> {
    val prop: Any
fun g(Int: String = ""): Any
}
open class A<T> {
inline fun g(x: String) = x
}
class B : A<Int>(), I2<Int> {
    override val prop
        get() = ""
}
