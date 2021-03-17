// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


open class A<T> {
fun <U> foo( t: T,u: U):Int = TODO()
fun  <U> foo( t: kotlin.String,u: U): Int  = TODO()
}
class B : A<String>()

