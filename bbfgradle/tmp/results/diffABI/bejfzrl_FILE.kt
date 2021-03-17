// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.collections.AbstractMutableMap
import kotlin.collections.Set
class Itr : Iterator<String> by ArrayList<String>().iterator()
class MItr : MutableIterator<String> by ArrayList<String>().iterator()
class LItr : ListIterator<String> by ArrayList<String>().listIterator()
class MLItr : MutableListIterator<String> by ArrayList<String>().listIterator()

class It : Iterable<String> by ArrayList<String>()
class MIt : MutableIterable<String> by ArrayList<String>()
class C : Collection<String> by ArrayList<String>()
class MC : MutableCollection<String> by ArrayList<String>()
class L : List<String> by ArrayList<String>()
class ML : MutableList<String> by ArrayList<String>()
class S : Set<String> by HashSet<String>()
class MS : MutableSet<String> by HashSet<String>()

class M : Map<String, String> by HashMap<String, String>()
class MM : MutableMap<String, String> by HashMap<String, String>()

class ME : Map.Entry<String, String> {
    override val key: String get() = throw UnsupportedOperationException()
    override val value: String get() = throw UnsupportedOperationException()
}

class MME : MutableMap.MutableEntry<String, String> {
    override val key: String get() = throw UnsupportedOperationException()
    override val value: String get() = throw UnsupportedOperationException()
    override fun setValue(value: String): String = TODO()
}

inline fun asFailsWithCCE(operation: String, block: () -> Unit):Nothing =TODO()

inline fun asSucceeds(operation: String, block: () -> Unit):Unit =TODO()

fun box(): String =TODO()

data   class A(val lu: Byte, val yw: MutableMap<UShort, Short>, val fp: Double = 0.9040374058175874): Set <UByte>{

override val size:  kotlin.Int
    get() = TODO()

override fun contains(element: kotlin.UByte): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.UByte>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.UByte> = TODO()

external  fun <T, S>  qhfui(a: LItr, b: ULong, c: L): Float

val amzdt: MME = TODO()
public final class C<T, S> (val hu: Double, val fc: S, val by: T, val yh: UShort = 16972.toUShort(), val py: T): AbstractMutableMap <Sequence<Set<MIt>>, Double>(){

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.sequences.Sequence<kotlin.collections.Set<MIt>>, kotlin.Double>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.sequences.Sequence<kotlin.collections.Set<MIt>>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<kotlin.Double>
    get() = TODO()

override fun containsKey(key: kotlin.sequences.Sequence<kotlin.collections.Set<MIt>>): kotlin.Boolean = TODO()

override fun get(key: kotlin.sequences.Sequence<kotlin.collections.Set<MIt>>): kotlin.Double? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun put(key: kotlin.sequences.Sequence<kotlin.collections.Set<MIt>>, value: kotlin.Double): kotlin.Double? = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.sequences.Sequence<kotlin.collections.Set<MIt>>, kotlin.Double>): kotlin.Unit = TODO()

val nvhcy: MIt = TODO()

}
}


