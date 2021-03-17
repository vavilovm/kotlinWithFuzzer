// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.collections.AbstractMutableList
inline class InlineNotNullPrimitive(val x: Int)
inline class InlineNotNullReference(val y: String)

fun <T> testNotNullPrimitive(a: Any, b: T, c: InlineNotNullPrimitive, d: InlineNotNullPrimitive?):Unit =TODO()
fun <T> testNotNullReference(a: Any, b: T, c: InlineNotNullReference, d: InlineNotNullReference?):Unit =TODO()

fun test(a: InlineNotNullPrimitive, b: InlineNotNullReference):Unit =TODO()

fun box(): String =TODO()

abstract class A(val hn: Float, val cf: LinkedHashSet<Long>, val mp: InlineNotNullReference, val vq: InlineNotNullPrimitive, val gr: Char): AbstractMutableList <Short>(){

override val size:  kotlin.Int
    get() = TODO()

override fun add(index: kotlin.Int, element: kotlin.Short): kotlin.Unit = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun contains(element: kotlin.Short): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun remove(element: kotlin.Short): kotlin.Boolean = TODO()

override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.collections.MutableList<kotlin.Short> = TODO()

override fun toArray(): kotlin.Array<kotlin.Any?> = TODO()

infix private fun   UShort.lnunh(a: Boolean): List<InlineNotNullPrimitive> = TODO()

val qzsvc: Collection<Byte> = TODO()

}


