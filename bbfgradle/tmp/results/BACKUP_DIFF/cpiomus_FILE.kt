// Bug happens on JVM , JS 
// WITH_REFLECT
// IGNORE_BACKEND: NATIVE
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt

package test

import kotlin.reflect.typeOf
import kotlin.reflect.KTypeParameter
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.*


class Container<T>

class C<X, Y> {
    val x1 = createX()
    val x2 = createXFromOtherFunction()
    val xFun = createIrrelevantX<Any>()
    val y = createY()

    fun createX(): KTypeParameter =
        typeOf<Container<X>>().arguments.single().type!!.classifier as KTypeParameter

    fun createXFromOtherFunction(): KTypeParameter =
        typeOf<Container<X>>().arguments.single().type!!.classifier as KTypeParameter

    fun <X> createIrrelevantX(): KTypeParameter =
        typeOf<Container<X>>().arguments.single().type!!.classifier as KTypeParameter

    fun createY(): KTypeParameter =
        typeOf<Container<Y>>().arguments.single().type!!.classifier as KTypeParameter
override fun toString(): String{
var res = ""
res += x1.toString()
res += x2.toString()
res += xFun.toString()
res += y.toString()
return res
}}

fun box(): String {
    val c = C<Any, Any>()
    assertEquals(c.x1, c.x2)
    assertEquals(c.x1.hashCode(), c.x2.hashCode())


    if (!isJS){
println("""THEN""");

        assertNotEquals(c.x1, c.xFun)
}
    assertNotEquals(c.x1, c.y)
    return "OK"
}

val isJS = 1 as Any is Double

fun box293(): String {
    assertFailsWith<IllegalArgumentException> {
        for (i in 1..7 step 0 step 2) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 1L..7L step 0L step 2L) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 'a'..'g' step 0 step 2) {
        }
    }

    return "OK"
}

class Kla4 {
    val prope1: String = "O"
        get() = field + "K"
override fun toString(): String{
var res = ""
res += prope1.toString()
return res
}}

fun box979() = Kla4().prope1


