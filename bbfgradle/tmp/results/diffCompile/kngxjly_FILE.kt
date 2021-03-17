// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

class MyMapEntry<K, V>: Map.Entry<K, V> {
override val key: K get() = throw UnsupportedOperationException()
    override val value: V get() = throw UnsupportedOperationException()
fun setValue(value: Any): Any
 = TODO()
}
