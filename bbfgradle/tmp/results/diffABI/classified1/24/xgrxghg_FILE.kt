// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

class A : HashMap<String, Double>()

fun box(): String {
    val a = A()
    val b = A()

    a.put("", 0.0)
    a.remove("")

    a.putAll(b)
    a.clear()

    a.keys
    a.values
    a.entries

    return "OK"
}
