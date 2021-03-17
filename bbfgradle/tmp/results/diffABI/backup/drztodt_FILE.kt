// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.Collection
import kotlin.collections.AbstractMap
import kotlin.CharSequence
import kotlin.collections.MutableMap
import kotlin.reflect.KProperty2
fun <T, R> T.letNoInline(fn: (T) -> R):R =
        TODO()

enum class X {
    B {
        val value2 = "K"
        override val value = "O".letNoInline { it + value2 }
    };

    abstract val value: String
}

fun box():String = TODO()

internal sealed class A(): MutableMap <X, X>, KProperty2 <X, LinkedHashSet<X>, X>{

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<X, X>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<X>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<X>
    get() = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsKey(key: X): kotlin.Boolean = TODO()

override fun containsValue(value: X): kotlin.Boolean = TODO()

override fun get(key: X): X? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun put(key: X, value: X): X? = TODO()

override fun putAll(from: kotlin.collections.Map<out X, X>): kotlin.Unit = TODO()

override fun remove(key: X): X? = TODO()

override val name:  kotlin.String
    get() = TODO()

override fun get(receiver1: X, receiver2: kotlin.collections.LinkedHashSet<X>): X = TODO()

override fun invoke(p1: X, p2: kotlin.collections.LinkedHashSet<X>): X = TODO()

val jucxv: Long = TODO()
private final class C(val oj: UInt = 1116424377.toUInt(), val wa: Char, val mb: Array<Byte>, val ct: X, val wv: X): AbstractMap <UInt, HashMap<Char, Byte>>(), CharSequence{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.UInt, kotlin.collections.HashMap<kotlin.Char, kotlin.Byte>>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.UInt>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.collections.HashMap<kotlin.Char, kotlin.Byte>>
    get() = TODO()

override fun containsKey(key: kotlin.UInt): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.collections.HashMap<kotlin.Char, kotlin.Byte>): kotlin.Boolean = TODO()

override val length:  kotlin.Int
    get() = TODO()

override fun get(index: kotlin.Int): kotlin.Char = TODO()

override fun subSequence(startIndex: kotlin.Int, endIndex: kotlin.Int): kotlin.CharSequence = TODO()

val vhatn: ULong = TODO()
private  class E(val zh: Collection<X>): Collection <Float>{

override val size:  kotlin.Int
    get() = TODO()

override fun contains(element: kotlin.Float): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.Float>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.Float> = TODO()

external  fun <T, S: HashMap<X, Long>>  nxolw(a: X, b: HashSet<X>, c: S, d: T): Char

val frair: Byte = TODO()

}
}
}


