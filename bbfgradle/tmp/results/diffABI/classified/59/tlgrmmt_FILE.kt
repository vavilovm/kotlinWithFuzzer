// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

object Whatever {
    operator fun getValue(thisRef: Any?, prop: Any?) = "OK"
}

fun box(): String {
    val key by Whatever
    return {
        object {
            val keys = key
        }.keys
    } ()
}
