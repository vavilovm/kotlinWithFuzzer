// Bug happens on JVM , JAVA
//File: tmp/tmp0.kt
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND_FIR: JVM_IR
// WITH_RUNTIME

val prop0:Any = TODO()




// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
fun box(): String {
    val prop0 = ArrayList<Boolean>()
    prop0.add(true)
    val prop1 = !prop0[0]
    prop1
    return "OK"
}