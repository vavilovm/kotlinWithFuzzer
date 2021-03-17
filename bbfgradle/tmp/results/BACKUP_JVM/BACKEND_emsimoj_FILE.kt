// Bug happens on JVM 
//File: tmp/tmp0.kt
object A {
fun get()  = 
A[1, 1, 1]++
operator fun get( i1: Int,i2: Int,i3: Int ): Int = TODO()
operator fun set( i1: Any,i2: Int,i3: Int,value: Int  ):Int = TODO()
}
