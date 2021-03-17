// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.collections.AbstractMutableMap


fun stringMultiArray(): Array<Array<String>> = TODO()

fun stringNullableMultiArray(): Array<Array<String?>> = TODO()

fun box(): String =TODO()

internal final class A(val tl: Boolean, val ta: Sequence<Collection<Char>> = emptySequence<Collection<Char>>(), val ik: UShort, val jo: Collection<UByte>, val av: Boolean = true): AbstractMutableMap <UShort, String>(){

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.UShort, kotlin.String>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.UShort>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<kotlin.String>
    get() = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsKey(key: kotlin.UShort): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.String): kotlin.Boolean = TODO()

override fun put(key: kotlin.UShort, value: kotlin.String): kotlin.String? = TODO()

override fun remove(key: kotlin.UShort): kotlin.String? = TODO()

inline operator public fun   Byte.minusAssign(a: Long): Unit = TODO()

val jpvfr: Pair<Char, UByte> = TODO()

}


