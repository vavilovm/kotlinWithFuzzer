// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.collections.AbstractMutableSet
@Target(AnnotationTarget.PROPERTY)
annotation class Anno(val value: String)

annotation class M(@Anno("OK") val result: Int)

fun box(): String =
    TODO()

final class A(val ks: UInt, val dt: ULong): AbstractMutableSet <UInt>(){

override val size:  kotlin.Int
    get() = TODO()

override fun add(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.UInt> = TODO()

override fun remove(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun toArray(): kotlin.Array<kotlin.Any?> = TODO()

infix private fun   LinkedHashSet<M>.thslf(a: Anno): MutableMap<Triple<UByte, Float, M>, Anno> = TODO()

val luuvj: ULong = TODO()

}


