// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt

package test

import kotlin.reflect.KType
import kotlin.reflect.typeOf
import kotlin.test.assertEquals
import kotlin.collections.Set
import kotlin.collections.Map


inline class Z(val value: String)

fun check(expected: String, actual: KType):Unit =TODO()

fun box(): String =TODO()

public  class A<T> (val jo: T, val ap: T, val un: Set<T>, val rq: T): Map <Z, Pair<Set<Z>, Long>>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<test.Z, kotlin.Pair<kotlin.collections.Set<test.Z>, kotlin.Long>>>
    get() = TODO()

override val keys:  kotlin.collections.Set<test.Z>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.Pair<kotlin.collections.Set<test.Z>, kotlin.Long>>
    get() = TODO()

override fun containsKey(key: test.Z): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.Pair<kotlin.collections.Set<test.Z>, kotlin.Long>): kotlin.Boolean = TODO()

override fun get(key: test.Z): kotlin.Pair<kotlin.collections.Set<test.Z>, kotlin.Long>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

val ofwqp: Z = TODO()
final class C(): Set <Z>{

override val size:  kotlin.Int
    get() = TODO()

override fun contains(element: test.Z): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<test.Z>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<test.Z> = TODO()

external public fun <T>  cdebn(a: Z, b: T, c: Z): Collection<Map<Short, Short>>

val lhxvu: Char = TODO()

}
}


