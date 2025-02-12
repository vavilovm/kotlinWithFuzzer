// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

private object EmptyMap : Map<Any, Nothing> {
    override val size: Int get() = 0
    override fun isEmpty(): Boolean = true

    override fun containsKey(key: Any): Boolean = false
    override fun containsValue(value: Nothing): Boolean = false
    override fun get(key: Any): Nothing? = null
    override val entries: Set<Map.Entry<String, Nothing>> get() = null!!
    override val keys: Set<String> get() = null!!
    override val values: Collection<Nothing> get() = null!!
}


fun box(): String {
    val n = EmptyMap as Map<Any?, Any?>

    if (n.get(null) != null) return "fail 1"
    if (n.containsKey(null)) return "fail 2"
    if (n.containsValue(null)) return "fail 3"

    return "OK"
}
