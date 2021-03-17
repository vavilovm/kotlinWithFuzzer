// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.reflect.KVariance
import kotlin.test.assertEquals
import kotlin.collections.*


class Triple<in A, B, out C> {
    fun <T> foo(): T = TODO()
}

fun box(): String =TODO()

internal interface Oao : ListIterator<Triple<ULong, Byte, UInt>>, Set<Triple<UInt, UInt, Char>>{

override fun hasPrevious(): kotlin.Boolean = TODO()

override fun contains(element: Triple<kotlin.UInt, kotlin.UInt, kotlin.Char>): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<Triple<kotlin.UInt, kotlin.UInt, kotlin.Char>>): kotlin.Boolean = TODO()

infix  fun <T, S>   Triple<Triple<Short, Float, UInt>, Boolean, Byte>.vrmaz(a: S): Short = TODO()

val Triple<UInt, Boolean, Double>.dhbx: Int 
get() = TODO()


var Boolean.meer: MutableMap<LinkedHashSet<Triple<Long, Long, UInt>>, Triple<Short, UShort, ULong>> 
get() = TODO()
set(value) = TODO()

var wkut: Triple<Double, ULong, Long> 

var eogr: Char 

val Triple<HashMap<Triple<Byte, Float, Boolean>, Long>, UShort, String>.uctg: Pair<Float, Triple<Int, UShort, Char>> 
get() = TODO()


val mcrs: Map<Triple<Short, Triple<Float, UShort, UInt>, Int>, Triple<Boolean, Triple<UShort, UInt, UInt>, ULong>> 

}


