// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt


fun builder(c: 
 Any):Int = TODO()
fun box()   = 
    builder {
try {}
finally {
 {}
}
    }
