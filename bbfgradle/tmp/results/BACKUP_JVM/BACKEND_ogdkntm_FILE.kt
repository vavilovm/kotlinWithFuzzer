// Bug happens on JVM 
// FILE: tmp0.kt

open class Base(fn: Any
 )
val x = ""
fun localFn() = x
class Local : Base({
fun 
(  a: ULong,b: ULong) = x in a..b
localFn()
 })

