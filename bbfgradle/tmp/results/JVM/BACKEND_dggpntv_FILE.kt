// Bug happens on JVM 
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp.kt

var log = ""
object A
fun getA() = A.also { log += getA().toString }

