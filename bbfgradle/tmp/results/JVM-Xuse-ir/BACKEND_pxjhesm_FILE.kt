// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp.kt

var log = ""
object A
fun getA() = A.also { log += getA().toString }

