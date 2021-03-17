// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.reflect.*
import kotlin.reflect.full.*
import kotlin.test.assertEquals
import kotlin.collections.*
import kotlin.test.*


class C(var state: String) {
    var String.prop: String
        get() = length.toString()
        set(value) { state = this + value }
}

fun box(): String =TODO()

private interface Vkh : Set<C>, AsserterContributor, MutableMap<Int, Collection<Byte>>{

override fun contains(element: C): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun contribute(): kotlin.test.Asserter? = TODO()

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.Int, kotlin.collections.Collection<kotlin.Byte>>>
override fun clear(): kotlin.Unit = TODO()

override fun get(key: kotlin.Int): kotlin.collections.Collection<kotlin.Byte>? = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.Int, kotlin.collections.Collection<kotlin.Byte>>): kotlin.Unit = TODO()

override fun remove(key: kotlin.Int): kotlin.collections.Collection<kotlin.Byte>? = TODO()

operator  fun <T, S>   C.timesAssign(a: S): Unit = TODO()

val qrof: List<Double> 

val ymhj: C 

var HashMap<Boolean, C>.lwde: ArrayDeque<C> 
get() = TODO()
set(value) = TODO()

var osvd: C 

var vosi: Collection<Array<C>> 

val yyja: Double 

val ysjr: C 

var txxu: Boolean 

var dmzp: Short 

}


