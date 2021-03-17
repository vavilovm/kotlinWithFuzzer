// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

import kotlin.reflect.KProperty
import kotlin.reflect.*
import kotlin.text.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.ranges.*


object Delegate {
    operator fun getValue(instance: Any?, property: KProperty<*>):String = TODO()
}

val foo: String by Delegate

fun box(): String =TODO()







public interface Pax : MutableMap<ArrayDeque<Float>, Char>, Set<LinkedHashSet<ULong>>, ClosedFloatingPointRange<ULong>{

override val keys:  kotlin.collections.MutableSet<kotlin.collections.ArrayDeque<kotlin.Float>>
override val size:  kotlin.Int
override val values:  kotlin.collections.MutableCollection<kotlin.Char>
override fun containsKey(key: kotlin.collections.ArrayDeque<kotlin.Float>): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.Char): kotlin.Boolean = TODO()

override fun get(key: kotlin.collections.ArrayDeque<kotlin.Float>): kotlin.Char? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun put(key: kotlin.collections.ArrayDeque<kotlin.Float>, value: kotlin.Char): kotlin.Char? = TODO()

override fun remove(key: kotlin.collections.ArrayDeque<kotlin.Float>): kotlin.Char? = TODO()

override fun contains(element: kotlin.collections.LinkedHashSet<kotlin.ULong>): kotlin.Boolean = TODO()

override val endInclusive:  kotlin.ULong
override val start:  kotlin.ULong
var vrjj: Byte 

var lnfx: List<Int> 

val mvmz: Delegate 

var kupl: Triple<Char, MutableMap<UShort, Delegate>, Double> 

var nucj: Delegate 

}


