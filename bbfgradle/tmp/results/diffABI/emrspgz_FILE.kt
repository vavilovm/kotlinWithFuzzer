// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

package test

import kotlin.test.assertEquals
import kotlin.collections.*
import kotlin.test.*


annotation class Anno(
        val b: Byte,
        val c: Char,
        val d: Double,
        val f: Float,
        val i: Int,
        val j: Long,
        val s: Short,
        val z: Boolean,
        val ba: ByteArray,
        val ca: CharArray,
        val da: DoubleArray,
        val fa: FloatArray,
        val ia: IntArray,
        val ja: LongArray,
        val sa: ShortArray,
        val za: BooleanArray,
        val str: String,
        val stra: Array<String>
)

@Anno(
        1.toByte(),
        'x',
        3.14,
        -2.72f,
        42424242,
        239239239239239L,
        42.toShort(),
        true,
        byteArrayOf((-1).toByte()),
        charArrayOf('y'),
        doubleArrayOf(-3.14159),
        floatArrayOf(2.7218f),
        intArrayOf(424242),
        longArrayOf(239239239239L),
        shortArrayOf((-43).toShort()),
        booleanArrayOf(false, true),
        "lol",
        arrayOf("rofl")
)
fun foo():Unit =TODO()

fun box(): String =TODO()

public interface Ocg : Collection<LinkedHashMap<UInt, Array<Double>>>, ListIterator<Double>, AsserterContributor{

override fun contains(element: kotlin.collections.LinkedHashMap<kotlin.UInt, kotlin.Array<kotlin.Double>>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.collections.LinkedHashMap<kotlin.UInt, kotlin.Array<kotlin.Double>>> = TODO()

override fun hasNext(): kotlin.Boolean = TODO()

infix  fun   LinkedHashMap<Map<ULong, UShort>, Long>.fsinl(a: Anno): Pair<UByte, UByte> = TODO()

val xizv: Anno 

val xcqa: Anno 

var cqmc: Anno 

var Map<Triple<Short, Char, HashSet<Float>>, UShort>.yytm: Double 
get() = TODO()
set(value) = TODO()

var dtgd: Char 

val String.zmpz: Anno 
get() = TODO()


var Anno.yuve: List<Short> 
get() = TODO()
set(value) = TODO()

var atro: String 

val Anno.cawu: LinkedHashMap<UInt, Anno> 
get() = TODO()


}


