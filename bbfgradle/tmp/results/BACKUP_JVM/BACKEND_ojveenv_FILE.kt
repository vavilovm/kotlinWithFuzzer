// Bug happens on JVM 
// FILE: tmp0.kt


class X {
operator fun get(name: String ) = name
}
fun box()  {
    var x = X()
    x[""] += ""
}
operator  fun Any.set( name: Any,defaultParam: Any = "",value: Any ):Int = TODO()
