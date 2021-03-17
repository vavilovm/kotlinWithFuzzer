// Bug happens on JVM 
// FILE: tmp0.kt

class Cell(var x: Int)
fun box()  {
    val c = Cell(TODO())
(c[1])--
}
operator fun Cell.get(s: Int) = x

