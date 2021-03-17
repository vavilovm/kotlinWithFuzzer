// Bug happens on JVM 
// FILE: tmp.kt


class X {
operator fun get(name: String ) = name
operator fun set( name: Any,defaultParam: Any = "",value: Any ):Int = TODO()
}
fun box()  {
    var x = X()
    x[""] += ""
}

