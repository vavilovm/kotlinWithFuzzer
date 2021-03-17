// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.util.AbstractMap

abstract class AbstractMutableMap<K, V> : MutableMap<K, V>, AbstractMap<K, V>()

class MyMap<K, V> : AbstractMutableMap<K, V>() {
    override val size: Int
        get() = 1
    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = null!!
}

fun box(): String =
    if (MyMap<String, String>().size == 1) "OK" else "Fail"
