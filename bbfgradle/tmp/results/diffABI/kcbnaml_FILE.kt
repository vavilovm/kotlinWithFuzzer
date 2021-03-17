// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


package ktbztnl
import kotlin.sequences.*
import kotlin.collections.*
class CountingSequence<out T>(private val s: Sequence<T>) : Sequence<T> {
    var hasNextCtr = 0
    var nextCtr = 0

    inner class CountingSequenceIterator(private val it: Iterator<T>) : Iterator<T> {
        override fun hasNext():Boolean = TODO()
        override fun next():T = TODO()
    }

    override fun iterator() = CountingSequenceIterator(s.iterator())
}

val xs = CountingSequence(listOf("a", "b", "c", "d").asSequence())

fun box(): String =TODO()

internal interface Xrq : MutableMap<CountingSequence<ArrayDeque<CountingSequence<Long>>>, CountingSequence<Char>>, List<CountingSequence<CountingSequence<Long>>>{

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<CountingSequence<kotlin.collections.ArrayDeque<CountingSequence<kotlin.Long>>>, CountingSequence<kotlin.Char>>>
override val size:  kotlin.Int
override fun get(key: CountingSequence<kotlin.collections.ArrayDeque<CountingSequence<kotlin.Long>>>): CountingSequence<kotlin.Char>? = TODO()

override fun indexOf(element: CountingSequence<CountingSequence<kotlin.Long>>): kotlin.Int = TODO()

override fun iterator(): kotlin.collections.Iterator<CountingSequence<CountingSequence<kotlin.Long>>> = TODO()

override fun lastIndexOf(element: CountingSequence<CountingSequence<kotlin.Long>>): kotlin.Int = TODO()

override fun listIterator(): kotlin.collections.ListIterator<CountingSequence<CountingSequence<kotlin.Long>>> = TODO()

val CountingSequence<CountingSequence<Float>>.drem: CountingSequence<HashMap<Int, CountingSequence<Int>>> 
get() = TODO()


var Boolean.dxwm: ULong 
get() = TODO()
set(value) = TODO()

val qaer: Short 

var rehd: Float 

var Short.atac: Byte 
get() = TODO()
set(value) = TODO()

}
