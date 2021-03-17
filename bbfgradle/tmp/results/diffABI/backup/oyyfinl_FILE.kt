// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt

import kotlin.reflect.full.hasAnnotation
import kotlin.test.assertFalse
import kotlin.test.assertTrue

annotation class Baz
annotation class Far

@Baz
@Far
class Foo

class Bar

fun box(): String =TODO()

sealed class A(val a: UShort, val b: Far, val c: HashMap<Sequence<UInt>, Foo>): Map <Collection<Baz>, Baz>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.Collection<Baz>, Baz>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.collections.Collection<Baz>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<Baz>
    get() = TODO()

override fun containsKey(key: kotlin.collections.Collection<Baz>): kotlin.Boolean = TODO()

override fun containsValue(value: Baz): kotlin.Boolean = TODO()

override fun get(key: kotlin.collections.Collection<Baz>): Baz? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

inline suspend  fun <T>  twllp(a: LinkedHashMap<Triple<Far, UByte, Bar>, Bar>, b: Double): Double = TODO()

inline   fun  lqygk(a: Pair<Far, String>, b: Char): Set<Short> = TODO()

suspend public fun  jhpxr(a: Long): Float = TODO()

tailrec private fun <T, S>  xppyk(a: S, b: S, c: T): Boolean = TODO()

internal fun <T: Baz>  mlzeo(a: T, b: Pair<Baz, ULong>, c: MutableMap<Baz, ArrayList<Short>>): Boolean = TODO()

}


