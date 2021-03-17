// Bug happens on JVM , JAVA
//File: tmp/tmp0.kt

open class A<T, U, V> {
    open fun foo( t: T,u: Int,Z: Double ) = ""
}
open class B<T, V> : A<T, Int, Double>()
open class C<V> : B<String, Double>()
class Z : C<Double>() {
    override fun foo( t: String,pomnq: Int,v: Double ) = "Z"
}
fun box(): Any
 {
    val z = Z()
val a: A<String, Int, Double> = z
return when {
a.foo( "",1,1.1 ) != "Z" -> 
""
true -> 
"Fail #1"
else -> {}
    }
}
