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

internal  class A(): AbstractFoo <String, Sequence<Sequence<StringFoo<AbstractFoo<Float, ULong>>>>>(){

override val size:  kotlin.Int
    get() = TODO()

override fun containsKey(key: kotlin.String): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.sequences.Sequence<kotlin.sequences.Sequence<StringFoo<AbstractFoo<kotlin.Float, kotlin.ULong>>>>): kotlin.Boolean = TODO()

override val keys:  kotlin.collections.Set<kotlin.String>
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.sequences.Sequence<kotlin.sequences.Sequence<StringFoo<AbstractFoo<kotlin.Float, kotlin.ULong>>>>>
    get() = TODO()

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.String, kotlin.sequences.Sequence<kotlin.sequences.Sequence<StringFoo<AbstractFoo<kotlin.Float, kotlin.ULong>>>>>>
    get() = TODO()

inline tailrec  fun   AnyFoo<Byte>.hwnso(a: StringFoo<AbstractFoo<UInt, UInt>>, b: UShort, c: Array<Boolean>): AbstractFoo<Byte, Map<AbstractFoo<AnyFoo<Short>, Short>, UByte>> = TODO()

val hagwi: Set<MutableMap<Char, Float>> = TODO()
private sealed class C<T> (val cy: T, val fe: HashSet<T>, val kr: HashSet<Char>){

fun <T, S>  odstv(a: Map<UInt, AbstractFoo<UInt, Float>>, b: T, c: Set<UShort>): Boolean = TODO()

val bnfqc: Char = TODO()
open class E<T> (val nj: LinkedHashSet<UShort> = LinkedHashSet<UShort>(), val wr: T){

suspend  fun  ctfdd(a: LinkedHashSet<UByte>, b: Sequence<Byte>, c: LinkedHashSet<ArrayList<ULong>>, d: Pair<AnyFoo<ULong>, AnyFoo<Short>>): StringFoo<UByte> = TODO()

val wnxnh: StringFoo<Byte> = TODO()

}
}
}


