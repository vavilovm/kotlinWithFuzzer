// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.util.Hashtable

class A : Hashtable<String, String>()

fun box(): String {
    val sz = A().size
    return "OK"
}
