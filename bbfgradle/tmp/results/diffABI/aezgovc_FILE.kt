// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.sequences.*
import kotlin.collections.*
import kotlin.ranges.*
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

public interface Sjn : ClosedRange<Long>, MutableMap<LinkedHashSet<MutableMap<HashSet<Double>, CountingSequence<CountingSequence<Float>>>>, MutableMap<Int, Int>>{

override val endInclusive:  kotlin.Long
override val start:  kotlin.Long
override fun isEmpty(): kotlin.Boolean = TODO()

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.collections.LinkedHashSet<kotlin.collections.MutableMap<kotlin.collections.HashSet<kotlin.Double>, CountingSequence<CountingSequence<kotlin.Float>>>>, kotlin.collections.MutableMap<kotlin.Int, kotlin.Int>>>
override val keys:  kotlin.collections.MutableSet<kotlin.collections.LinkedHashSet<kotlin.collections.MutableMap<kotlin.collections.HashSet<kotlin.Double>, CountingSequence<CountingSequence<kotlin.Float>>>>>
override fun clear(): kotlin.Unit = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.collections.LinkedHashSet<kotlin.collections.MutableMap<kotlin.collections.HashSet<kotlin.Double>, CountingSequence<CountingSequence<kotlin.Float>>>>, kotlin.collections.MutableMap<kotlin.Int, kotlin.Int>>): kotlin.Unit = TODO()

val euxs: CountingSequence<Char> 

var CountingSequence<Double>.kvzj: Pair<CountingSequence<Float>, CountingSequence<ULong>> 
get() = TODO()
set(value) = TODO()

var oaem: LinkedHashSet<Byte> 

val Map<Byte, CountingSequence<Double>>.glqq: UInt 
get() = TODO()


var blqc: CountingSequence<UByte> 

var jsal: ULong 

var irex: UShort 

var jxfa: Byte 

var rnij: CountingSequence<UShort> 

}


