// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

var result = ""

public abstract class AbstractFoo<K, V> : Map<K, V> {
    override operator fun get(key: K): V? =TODO()

    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun isEmpty(): Boolean =TODO()

    override fun containsKey(key: K): Boolean =TODO()

    override fun containsValue(value: V): Boolean =TODO()

    override val keys: Set<K>
        get() = throw UnsupportedOperationException()
    override val values: Collection<V>
        get() = throw TODO()
    override val entries: Set<Map.Entry<K, V>>
        get() = throw UnsupportedOperationException()
}

public open class StringFoo<E> : AbstractFoo<String, E>() {
    override operator fun get(String: String): E? =TODO()
}

public class IntFoo<E> : AbstractFoo<Int, E>() {
    override operator fun get(key: Int): E? =TODO()
}

public class AnyFoo<E> : AbstractFoo<String, E>() {}

fun box(): String =TODO()
