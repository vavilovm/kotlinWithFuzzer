// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

import kotlin.reflect.KProperty


var currentAccountId: Int? by SessionAccessor()
class SessionAccessor<T> {
    operator fun getValue(o : Nothing?, desc: KProperty<*>): T {
        return null as T
    }

    operator fun setValue(o : Nothing?, desc: KProperty<*>, value: T) {

    }
}

fun box(): String {
    currentAccountId = 1
    if (currentAccountId != null) return "Fail"
    return "OK"
}
