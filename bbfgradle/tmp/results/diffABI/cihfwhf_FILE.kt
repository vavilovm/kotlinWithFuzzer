// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class InlineNotNullPrimitive(val x: Int)
inline class InlineNullablePrimitive(val x: Int?)
inline class InlineNotNullReference(val a: Any)
inline class InlineNullableReference(val a: Any?)

fun test1(a: InlineNotNullPrimitive):Unit =TODO()

fun test2(b: InlineNullablePrimitive):Unit =TODO()

fun test3(c: InlineNotNullReference):Unit =TODO()

fun test4(d: InlineNullableReference):Unit =TODO()

fun box(): String =TODO()

internal abstract class A<T: InlineNotNullPrimitive, S> (val a: InlineNullablePrimitive, val b: T): Map <InlineNullableReference, Triple<Long, List<Boolean>, ArrayList<Char>>>{

override val keys:  kotlin.collections.Set<InlineNullableReference>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

fun   Collection<UInt>.gunql(a: InlineNullableReference, b: UInt): Double = TODO()

fun  bnixd(a: InlineNotNullReference): ULong = TODO()

inline   fun  vuzxi(a: InlineNullableReference, b: Char): InlineNotNullPrimitive = TODO()

private fun <T, S>  jzsif(a: S, b: Collection<UShort>, c: UByte): InlineNullableReference = TODO()

public fun   HashMap<String, InlineNotNullPrimitive>.czllo(a: InlineNullableReference, b: Long, c: LinkedHashSet<Float>): Double = TODO()

}


