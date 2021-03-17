// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test

import kotlin.reflect.KClass
import kotlin.reflect.*
import kotlin.properties.*
import kotlin.collections.*
import kotlin.sequences.*


annotation class Anno(val k1: KClass<*>, val k2: KClass<*>, val k3: KClass<*>)

fun box(): String =TODO()

public interface Eem : PropertyDelegateProvider<Sequence<List<Anno>>, LinkedHashMap<Anno, Int>>, MutableList<Anno>, KProperty1<Anno, Boolean>{

override fun provideDelegate(thisRef: kotlin.sequences.Sequence<kotlin.collections.List<test.Anno>>, property: kotlin.reflect.KProperty<*>): kotlin.collections.LinkedHashMap<test.Anno, kotlin.Int> = TODO()

override val size:  kotlin.Int
override fun add(element: test.Anno): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun indexOf(element: test.Anno): kotlin.Int = TODO()

override fun listIterator(index: kotlin.Int): kotlin.collections.MutableListIterator<test.Anno> = TODO()

override fun remove(element: test.Anno): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<test.Anno>): kotlin.Boolean = TODO()

override fun set(index: kotlin.Int, element: test.Anno): test.Anno = TODO()

val httt: Anno 

val ykff: Sequence<Anno> 

val jjdr: Sequence<LinkedHashMap<UInt, Anno>> 

var mkam: Anno 

val aial: Sequence<LinkedHashMap<Int, Boolean>> 

}










annotation private  class Ozf (val eau: Int, val alq: KClass<*>)

private interface Rwt : Eem{

override val size:  kotlin.Int
override fun add(element: test.Anno): kotlin.Boolean = TODO()

override fun add(index: kotlin.Int, element: test.Anno): kotlin.Unit = TODO()

override val jjdr:  kotlin.sequences.Sequence<kotlin.collections.LinkedHashMap<kotlin.UInt, test.Anno>>
override var mkam:  test.Anno
override val aial:  kotlin.sequences.Sequence<kotlin.collections.LinkedHashMap<kotlin.Int, kotlin.Boolean>>
override fun addAll(index: kotlin.Int, elements: kotlin.collections.Collection<test.Anno>): kotlin.Boolean = TODO()

override fun get(receiver: test.Anno): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun removeAt(index: kotlin.Int): test.Anno = TODO()

override fun retainAll(elements: kotlin.collections.Collection<test.Anno>): kotlin.Boolean = TODO()

var jibp: UInt 

val untc: String 

var tqog: Anno 

var hhwu: Anno 

val hqjx: Short 

var illa: Anno 

var mxvd: Sequence<Pair<Anno, String>> 

}


