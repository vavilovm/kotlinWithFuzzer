// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND: NATIVE
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt

package test

import kotlin.reflect.typeOf
import kotlin.reflect.KTypeParameter
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.reflect.*
import kotlin.collections.*
import kotlin.test.*
import kotlin.sequences.*


class Container<T>

fun <X> createX(): KTypeParameter =
    TODO()

fun <X> createOtherX(): KTypeParameter =
    TODO()

fun box(): String =TODO()

val isJS = 1 as Any is Double










internal interface Cll : KProperty1<Container<Container<Byte>>, Container<Container<Double>>>, MutableCollection<Float>{

override fun addAll(elements: kotlin.collections.Collection<kotlin.Float>): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<kotlin.Float>): kotlin.Boolean = TODO()

var LinkedHashMap<Float, Short>.cjlh: Byte 
get() = TODO()
set(value) = TODO()

var otbw: LinkedHashSet<Container<Container<UInt>>> 

val Set<MutableMap<Char, Byte>>.dcwh: Container<HashSet<ULong>> 
get() = TODO()


var pgge: Container<Container<Short>> 

var swgb: MutableMap<UByte, Boolean> 

}


