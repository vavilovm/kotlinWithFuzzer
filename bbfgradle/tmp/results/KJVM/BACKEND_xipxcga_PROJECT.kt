// Bug happens on KJVM 
// FILE A.java








// FILE Main.kt
fun Int.foo() = (
::bar)!!
fun Any
.bar(x: Int
) = x
