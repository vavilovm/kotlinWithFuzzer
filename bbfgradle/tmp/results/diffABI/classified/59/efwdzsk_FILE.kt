// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

package foo

import kotlin.reflect.KProperty

class Delegate {
    inline operator fun getValue(t: Any?, p: KProperty<*>): String = p.name
}

fun box(): String {
    val OK: String by Delegate()
    return OK
}
