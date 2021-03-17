// Bug happens on KJVM 
// FILE A.java




// FILE Main.kt
class A(val pp: String)
var log: Any = TODO()
fun A.plusAssign() = if (true) ::bar else pp
fun <T> Any.bar(f: Int) = f
