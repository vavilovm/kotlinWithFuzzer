// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.collections.MutableMap
import kotlin.collections.Collection


annotation class NoParams
annotation class OneDefault(val s: String = "Fail")
annotation class TwoNonDefaults(val string: String, val klass: KClass<*>)

inline fun <reified T : Annotation> create(vararg args: Any?): T =
        TODO()

fun box(): String =TODO()

internal abstract class A(val ie: MutableMap<LinkedHashMap<Short, OneDefault>, OneDefault>): MutableMap <Boolean, TwoNonDefaults>, Collection <ULong>{

override fun containsValue(value: TwoNonDefaults): kotlin.Boolean = TODO()

override fun get(key: kotlin.Boolean): TwoNonDefaults? = TODO()

override fun remove(key: kotlin.Boolean): TwoNonDefaults? = TODO()

override fun contains(element: kotlin.ULong): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

infix private fun   Int.qnsko(a: Float): ArrayList<Double> = TODO()

val cbsnn: Char = TODO()

}


