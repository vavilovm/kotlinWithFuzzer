// Bug happens on JVM 
//File: tmp/tmp0.kt
fun box() 
 {
    fun bar():Int = TODO()
    fun baz():Int = TODO()
(::bar)!! == ::baz
}
