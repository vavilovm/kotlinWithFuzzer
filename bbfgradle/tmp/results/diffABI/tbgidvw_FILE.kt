// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.annotation.*
import kotlin.collections.*
import kotlin.reflect.*
import kotlin.sequences.*
import kotlin.contracts.*
@Ann(i, s, f, d, l, b, bool, c, str) class MyClass

fun box(): String =TODO()

@Retention(AnnotationRetention.RUNTIME)
annotation class Ann(
        val i: Int,
        val s: Short,
        val f: Float,
        val d: Double,
        val l: Long,
        val b: Byte,
        val bool: Boolean,
        val c: Char,
        val str: String
)

const val i: Int = 2
const val s: Short = 2
const val f: Float = 2.0.toFloat()
const val d: Double = 2.0
const val l: Long = 2
const val b: Byte = 2
const val bool: Boolean = true
const val c: Char = 'c'
const val str: String = "str"

internal interface Sok : Function<Triple<Long, MyClass, MyClass>>, MutableMap<Float, Int>{

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.Float, kotlin.Int>>
override val keys:  kotlin.collections.MutableSet<kotlin.Float>
override fun containsValue(value: kotlin.Int): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

private fun  vkmyg(a: Triple<Char, HashMap<Collection<Boolean>, Char>, Float>, b: Int): Ann = TODO()

val cbdp: MyClass 

val nrck: MyClass 

var pcrf: Double 

val tfuh: Int 

var Ann.kfdq: MyClass 
get() = TODO()
set(value) = TODO()

val Ann.wyss: Double 
get() = TODO()


var gyhp: Array<Int> 

val jvyd: UInt 

val shze: UByte 

}




public sealed class Efl <T> {

fun  eshar(a: List<MyClass>, b: Sequence<MutableMap<Double, UInt>>, c: UInt): Byte = TODO()

val iolb: Float = TODO()

val jlhm: HashSet<Boolean> = linkedSetOf<Boolean>(false)

var Pair<Double, Ann>.mkks: MyClass 
get() =  TODO()
set(value) = TODO()

var ceqq: UShort = 19505.toUShort()

val ibuf: HashMap<Int, Int> = TODO()

val MyClass.fmgv: MyClass 
get() =  TODO()


val Sequence<Char>.wkgy: MyClass 
get() =  TODO()


val tmmc: ULong = TODO()

}







private interface Ctx <T, S> : MutableList<UInt>, KMutableProperty0<MutableMap<UByte, UShort>>{

override fun addAll(elements: kotlin.collections.Collection<kotlin.UInt>): kotlin.Boolean = TODO()

override fun contains(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun listIterator(): kotlin.collections.MutableListIterator<kotlin.UInt> = TODO()

override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.collections.MutableList<kotlin.UInt> = TODO()

override fun get(): kotlin.collections.MutableMap<kotlin.UByte, kotlin.UShort> = TODO()

val waoa: MyClass 

var HashSet<Pair<UShort, Long>>.wddl: MyClass 
get() = TODO()
set(value) = TODO()

var uifa: Byte 

var jewn: HashMap<Short, Ann> 

var qpih: LinkedHashSet<Ann> 

var pdwu: S 

}


