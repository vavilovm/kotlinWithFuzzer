// Bug happens on JVM , JAVA
//File: tmp/tmp0.kt

interface Kl0<T> {
    fun foo(): Any
}
interface Kl1<T> : Kl0<T>
fun box(): String {
class Kl2<T>(a: Kl1<T>) : Kl1<T>, Kl0<T> by a
val prop1: Any = Kl2(object : Kl1<Int> {
        override fun foo() = ""
})
null!!
}