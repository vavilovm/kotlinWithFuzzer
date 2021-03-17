// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

const val MaxUI = UInt.MAX_VALUE
const val MinUI = UInt.MIN_VALUE

const val MaxUL = ULong.MAX_VALUE
const val MinUL = ULong.MIN_VALUE

val M = MaxUI.toULong()
val N = Int.MAX_VALUE.toUInt()

val range1 = 1u .. 6u
fun testSimpleUIntLoop():Unit =TODO()

val range2 = 6u .. 1u
fun testEmptyUIntLoop():Unit =TODO()

val range3 = 1UL .. 6UL
fun testSimpleULongLoop():Unit =TODO()

val range4 = 6UL .. 1UL
fun testEmptyULongLoop():Unit =TODO()

val range5 = M+1UL..M+6UL
fun testULongLoop():Unit =TODO()

val range6 = M+6UL..M+1UL
fun testEmptyULongLoop2():Unit =TODO()

val range7 = MaxUI..MinUI
fun testMaxUItoMinUI():Unit =TODO()

val range8 = MaxUL..MinUL
fun testMaxULtoMinUL():Unit =TODO()

val MA = M - 1UL
val MB = M + 1UL
val range9 = MA..MB
fun testWrappingULongLoop():Unit =TODO()

val NA = N - 1u
val NB = N + 1u
val range10 = NA..NB
fun testWrappingUIntLoop():Unit =TODO()

fun box(): String =TODO()

data public  class A<T> (val a: Collection<T>, val b: ArrayDeque<T>, val c: Set<T>, val d: Int): MutableSet <UInt>{

override val size:  kotlin.Int
    get() = TODO()

override fun add(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun addAll(elements: kotlin.collections.Collection<kotlin.UInt>): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun contains(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.UInt>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.UInt> = TODO()

override fun remove(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<kotlin.UInt>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<kotlin.UInt>): kotlin.Boolean = TODO()

public fun <T>  wboqb(a: ULong, b: String): Long = TODO()

infix internal fun   UByte.cilrq(a: UShort): ULong = TODO()

inline suspend public fun  uvjks(a: Map<ULong, ULong>): Int = TODO()

suspend internal fun  qaqql(a: LinkedHashSet<Float>, b: LinkedHashSet<Char>): Pair<Byte, Double> = TODO()

infix  fun   Int.ypgaa(a: UShort): Char = TODO()

}


