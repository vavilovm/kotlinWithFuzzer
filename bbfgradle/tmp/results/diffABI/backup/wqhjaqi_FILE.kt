// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.collections.Collection
inline class UInt(val value: Int) {
    operator fun plus(other: UInt):UInt = TODO()
    fun otherValue(other: UInt):Int = TODO()
}

fun box(): String =TODO()

internal abstract class A<T: UByte> (val pa: T, val mm: T, val hs: Short = -10471, val gc: Short): Collection <List<UInt>>{

override val size:  kotlin.Int
    get() = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.collections.List<UInt>>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.collections.List<UInt>> = TODO()

val cahic: UInt = TODO()

}


