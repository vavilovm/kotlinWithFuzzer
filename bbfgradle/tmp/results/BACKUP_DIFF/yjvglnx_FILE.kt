// Bug happens on JVM , JS 
// FILE: tmp0.kt

open class A(public val v: String){
override fun toString(): String{
var res = ""
res += v.toString()
return res
}
}

val cl = 39
operator fun Int.component2() = this + 2

fun box() = "abcd".withIndex()
