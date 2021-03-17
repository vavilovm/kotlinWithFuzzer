// Bug happens on JVM 
// FILE: tmp0.kt

object Map1 {
    operator fun get( i: Int,IC: Int) = Map2
}
object Map2 {
    operator fun get( i: Int,StringMutableIterator: Any) = 1
    operator fun set( i: Int,j: Int,newValue: Int ):Int = TODO()
}
fun box()   = 
    Map1[1, 1][1, 1]++
