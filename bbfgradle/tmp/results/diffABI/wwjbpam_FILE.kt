// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NewInference
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.experimental.ExperimentalTypeInference
import kotlin.contracts.*
import kotlin.collections.*
import kotlin.sequences.*


interface In<in E> {
    suspend fun send(element: E)
}

class InImpl<E>(val block: suspend In<E>.() -> Unit) : In<E> {
    override suspend fun send(element: E):Unit =TODO()
}

@OptIn(ExperimentalTypeInference::class)
public fun <T> builder(@BuilderInference block: suspend In<T>.() -> Unit):Unit =TODO()

fun test33542():Unit =TODO()

fun test33544():Unit=TODO()

fun box():String = TODO()










private interface Gze <T> : In<String>{

fun  qbfpz(a: Array<InImpl<UShort>>, b: Double): Int = TODO()

var rscd: List<InImpl<Int>> 

var Float.dysw: InImpl<InImpl<Float>> 
get() = TODO()
set(value) = TODO()

var List<ArrayList<InImpl<InImpl<Float>>>>.drwx: In<UInt> 
get() = TODO()
set(value) = TODO()

val wjqu: Sequence<In<Double>> 

val Char.keuh: InImpl<String> 
get() = TODO()


val darh: In<InImpl<Boolean>> 

val bjka: Collection<T> 

}

private final class Hih {

val ULong.wrld: InImpl<UInt> 
get() =  TODO()


val Long.spxv: HashSet<In<String>> 
get() =  linkedSetOf<In<String>>()


var pjix: Boolean = true

var UInt.puel: Float 
get() =  TODO()
set(value) = TODO()

var mdmj: InImpl<Set<Map<In<ULong>, Short>>> = TODO()

var pvrn: InImpl<Boolean> = TODO()

val hddr: InImpl<UShort> = TODO()

}




public interface Qfw : In<Array<List<Double>>>, MutableCollection<In<Float>>{

override fun addAll(elements: kotlin.collections.Collection<In<kotlin.Float>>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun remove(element: In<kotlin.Float>): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<In<kotlin.Float>>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<In<kotlin.Float>>): kotlin.Boolean = TODO()

val sgtf: InImpl<Int> 

var mrkr: InImpl<Short> 

val Int.sfuv: Char 
get() = TODO()


val hjqh: LinkedHashMap<UInt, In<String>> 

var bwui: Set<Int> 

val Short.yusf: In<InImpl<UByte>> 
get() = TODO()


var zcyt: InImpl<UShort> 

var In<ULong>.tmfq: ULong 
get() = TODO()
set(value) = TODO()

}


