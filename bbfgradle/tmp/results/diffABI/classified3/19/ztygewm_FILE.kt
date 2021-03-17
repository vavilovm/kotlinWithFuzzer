// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

interface First
interface Some<T : First> where T : Some<T>

val a: Some<*>? = null

class MClass(val p: String) : First, Some<MClass>

fun box(): String {
    return MClass("OK").p
}
