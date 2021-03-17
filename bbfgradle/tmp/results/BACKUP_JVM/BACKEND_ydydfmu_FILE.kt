// Bug happens on JVM 
// FILE: tmp.kt

fun foo(
x: Int,y: Any): Int = TODO()
tailrec fun useArray(f: (Int, Array<Int>) -> Any): Any = f( 1,Array(1) {
return useArray(::foo)
})

