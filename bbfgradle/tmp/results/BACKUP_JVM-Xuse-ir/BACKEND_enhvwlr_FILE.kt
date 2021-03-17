// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun <T, R> myWith( receiver: T,block: R): Int = TODO()
operator fun UInt
.set( x: Any,value: Any):Int  = TODO()
fun bar() = myWith(TODO(),{
1[""] = ""
})
