// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.Annotation
import kotlin.collections.Map
/**
 * _Example_
 * The following will print `1`, `2` and `3` when executed:
 * ```
 * arrayOf(1, 2, 3, 4, 5)
 *   .iterator()
 *   .stopAfter { it == 3 }
 *   .forEach(::println)
 * ```
 * @return an iterator, which stops [this] Iterator after first element for which [predicate] returns `true`
 */
inline fun <T> Iterator<T>.stopAfter(crossinline predicate: (T) -> Boolean): Iterator<T> = TODO()

fun box():String =
  TODO()

data internal  class A(val tc: UByte, val gh: UByte, val tg: UInt = 163893317.toUInt(), val sj: Byte): Map <List<Short>, Sequence<Byte>>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.List<kotlin.Short>, kotlin.sequences.Sequence<kotlin.Byte>>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.collections.List<kotlin.Short>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.sequences.Sequence<kotlin.Byte>>
    get() = TODO()

override fun containsKey(key: kotlin.collections.List<kotlin.Short>): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.sequences.Sequence<kotlin.Byte>): kotlin.Boolean = TODO()

override fun get(key: kotlin.collections.List<kotlin.Short>): kotlin.sequences.Sequence<kotlin.Byte>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

public fun <T, S>  tjvlt(a: Long, b: T, c: Pair<ULong, Byte>, d: Double): HashSet<UByte> = TODO()

val nntqr: Pair<Set<Int>, ULong> = TODO()
public open class C(val sq: String, val fv: Boolean): Annotation{

val ngvfr: ArrayList<Int> = TODO()

}
}


