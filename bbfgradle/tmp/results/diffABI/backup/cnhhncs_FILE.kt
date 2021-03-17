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
        get() = throw UnsupportedOperationException()
    override val entries: Set<Map.Entry<K, V>>
        get() = throw UnsupportedOperationException()
}

public open class StringFoo<E> : AbstractFoo<String, E>() {
    override operator fun get(key: String): E? =TODO()
}

public class IntFoo<E> : AbstractFoo<Int, E>() {
    override operator fun get(key: Int): E? =TODO()
}

public class AnyFoo<E> : AbstractFoo<Any?, E>() {}

fun box(): String =TODO()

private open class A(val bg: Map<MutableMap<ArrayDeque<Int>, Byte>, Map<UByte, UInt>>, val rg: HashMap<AnyFoo<Triple<StringFoo<Long>, UInt, String>>, Byte>, val dh: UInt){

val izbrj: Char = TODO()
private abstract class C(): StringFoo <AbstractFoo<Boolean, ULong>>(){

override val values:  kotlin.collections.Collection<AbstractFoo<kotlin.Boolean, kotlin.ULong>>
    get() = TODO()

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.String, AbstractFoo<kotlin.Boolean, kotlin.ULong>>>
    get() = TODO()

public fun   StringFoo<StringFoo<Float>>.gbsfs(a: StringFoo<UShort>, b: Triple<AnyFoo<AbstractFoo<Long, ULong>>, Boolean, Short>, c: ULong): Double = TODO()

val mdfwy: StringFoo<Double> = TODO()
private  class E(val ij: Sequence<Double> = generateSequence<Double>(0.690428864308249, {a: Double -> 0.48478725712382176})): AbstractFoo <Collection<Double>, IntFoo<Long>>(){

override fun get(key: kotlin.collections.Collection<kotlin.Double>): IntFoo<kotlin.Long>? = TODO()

override val size:  kotlin.Int
    get() = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun containsValue(value: IntFoo<kotlin.Long>): kotlin.Boolean = TODO()

override val keys:  kotlin.collections.Set<kotlin.collections.Collection<kotlin.Double>>
    get() = TODO()

override val values:  kotlin.collections.Collection<IntFoo<kotlin.Long>>
    get() = TODO()

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.Collection<kotlin.Double>, IntFoo<kotlin.Long>>>
    get() = TODO()

val ktxss: IntFoo<Float> = TODO()

}
}
}


