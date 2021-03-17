// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: enable
// FILE: tmp0.kt

interface A<K, V> : MutableMap<K, V>

class B : A<String, String>, java.util.AbstractMap<String, String>() {
    override val entries: MutableSet<MutableMap.MutableEntry<String, String>>
        get() = java.util.HashSet()
}

interface C<K, V> : MutableMap<K, V> {
    @JvmDefault
    override fun remove(key: K, value: V) = true
}

class D : A<String, String>, java.util.AbstractMap<String, String>() {
    override val entries: MutableSet<MutableMap.MutableEntry<String, String>>
        get() = java.util.HashSet()
}

fun box(): String {
    val x1 = B().remove("1", "2")
    if (x1) return "fail 1"

    val x2 = D().remove("3", "4")
    if (x1) return "fail 2"

    return "OK"
}
