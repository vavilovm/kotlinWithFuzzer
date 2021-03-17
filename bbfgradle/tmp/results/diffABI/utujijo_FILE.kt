// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt

package test

import kotlin.reflect.typeOf
import kotlin.reflect.KTypeParameter
import kotlin.test.assertEquals
import kotlin.collections.AbstractMutableMap


class Container<T>

fun <X, Y, Z> test() where X : Y?, Y : List<Z>, Z : Set<String>
        = typeOf<Container<X>>()

fun box(): String =TODO()

private sealed class A(val lv: Container<ULong> = Container<ULong>()): AbstractMutableMap <UByte, UByte>(){

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.UByte, kotlin.UByte>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.UByte>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<kotlin.UByte>
    get() = TODO()

override fun containsKey(key: kotlin.UByte): kotlin.Boolean = TODO()

override fun put(key: kotlin.UByte, value: kotlin.UByte): kotlin.UByte? = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.UByte, kotlin.UByte>): kotlin.Unit = TODO()

val ysbee: Int = TODO()

}


