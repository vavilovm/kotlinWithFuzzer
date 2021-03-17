// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

object A {
var a: Int = TODO()
}
fun box()  {
var p = 
A.a
val i:Any = TODO()
when (i) {
 true -> p != try {
1
} catch(e: Exception){}
 else -> try {
{p}
} 
finally{}
}
}
