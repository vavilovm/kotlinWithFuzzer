// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.annotation.*
import kotlin.collections.*
import kotlin.contracts.*
import kotlin.text.*
import kotlin.sequences.*
import kotlin.time.*
inline class Foo(val x: Int) : Comparable<Foo> {
    override fun compareTo(other: Foo): Int =TODO()
}

fun box(): String =TODO()

annotation public  class Aex (val cua: KClass<*>, val ucb: ReplaceWith, val ifb: AnnotationRetention, val xcg: AnnotationTarget, val zcx: KClass<*>)













internal interface Uwm : KMutableProperty0<Foo>, MutableMap<Sequence<String>, Int>, KProperty0<Foo>{

override val keys:  kotlin.collections.MutableSet<kotlin.sequences.Sequence<kotlin.String>>
override val values:  kotlin.collections.MutableCollection<kotlin.Int>
override fun containsKey(key: kotlin.sequences.Sequence<kotlin.String>): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.Int): kotlin.Boolean = TODO()

override fun put(key: kotlin.sequences.Sequence<kotlin.String>, value: kotlin.Int): kotlin.Int? = TODO()

override fun remove(key: kotlin.sequences.Sequence<kotlin.String>): kotlin.Int? = TODO()

var Foo.fduw: LinkedHashSet<Foo> 
get() = TODO()
set(value) = TODO()

var qrbu: Foo 

val sgzl: Short 

var iaci: Foo 

val rcvy: MutableMap<Byte, Float> 

}


