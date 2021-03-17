// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.jvm.reflect

inline class C(val x: Int)

fun C.f(x: (String) -> Unit = { OK: String -> }) = x.reflect()?.parameters?.singleOrNull()?.name

fun box(): String = TODO()

data public  class A<T> (val a: Triple<T, T, T>, val b: C, val c: UByte, val d: T, val e: UShort): AbstractList <UShort>(){

override val size:  kotlin.Int
    get() = TODO()

override fun contains(element: kotlin.UShort): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.UShort>): kotlin.Boolean = TODO()

override fun get(index: kotlin.Int): kotlin.UShort = TODO()

override fun indexOf(element: kotlin.UShort): kotlin.Int = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.UShort> = TODO()

override fun lastIndexOf(element: kotlin.UShort): kotlin.Int = TODO()

override fun listIterator(): kotlin.collections.ListIterator<kotlin.UShort> = TODO()

override fun listIterator(index: kotlin.Int): kotlin.collections.ListIterator<kotlin.UShort> = TODO()

override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.collections.List<kotlin.UShort> = TODO()

override fun toArray(): kotlin.Array<kotlin.Any?> = TODO()

override fun <T> toArray(array: kotlin.Array<T>): kotlin.Array<T> = TODO()

fun <T, S>  uqdcy(a: MutableMap<C, MutableMap<UByte, ULong>>, b: MutableMap<LinkedHashMap<UShort, Long>, Float>): Long = TODO()

suspend  fun  ahqbc(a: Int, b: C): C = TODO()

fun  usqjk(a: ArrayDeque<Pair<Char, UShort>>, b: Int, c: ULong): UByte = TODO()

inline operator internal fun   C.iterator(): Boolean = TODO()

infix  fun   C.bkgnw(a: List<Int>): Triple<String, UShort, Float> = TODO()

}


