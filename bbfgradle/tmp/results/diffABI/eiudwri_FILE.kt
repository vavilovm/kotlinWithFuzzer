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
import kotlin.collections.Map


class Container<T>

fun <X> createX(): KTypeParameter =
    TODO()

fun <X> createOtherX(): KTypeParameter =
    TODO()

fun box(): String =TODO()

val isJS = 1 as Any is Double

sealed class A(val qa: List<Sequence<Container<Container<Short>>>>, val bs: LinkedHashMap<Container<String>, Container<Double>>): Map <Long, Container<Container<ULong>>>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.Long, test.Container<test.Container<kotlin.ULong>>>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.Long>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<test.Container<test.Container<kotlin.ULong>>>
    get() = TODO()

override fun containsKey(key: kotlin.Long): kotlin.Boolean = TODO()

override fun containsValue(value: test.Container<test.Container<kotlin.ULong>>): kotlin.Boolean = TODO()

override fun get(key: kotlin.Long): test.Container<test.Container<kotlin.ULong>>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

inline  internal fun <T>   HashMap<Container<Char>, Int>.biluk(a: Container<UShort>, b: Sequence<Double>, c: Container<Container<Long>>, d: Long): Container<HashSet<MutableMap<UInt, Float>>> = TODO()

val wtsvn: Container<Double> = TODO()
private sealed class C(val xv: Int, val za: Triple<ULong, Boolean, Long> = Triple<ULong, Boolean, Long>(1936148424965478592.toULong(), true, -2780761116286137443)){

val qmrre: Container<Double> = TODO()

}
}


