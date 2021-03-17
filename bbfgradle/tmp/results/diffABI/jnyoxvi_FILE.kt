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




private interface Ori <T, S: ULong> : Eem, Collection<Anno>{

override fun provideDelegate(thisRef: kotlin.sequences.Sequence<kotlin.collections.List<test.Anno>>, property: kotlin.reflect.KProperty<*>): kotlin.collections.LinkedHashMap<test.Anno, kotlin.Int> = TODO()

override fun add(index: kotlin.Int, element: test.Anno): kotlin.Unit = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun listIterator(index: kotlin.Int): kotlin.collections.MutableListIterator<test.Anno> = TODO()

override fun listIterator(): kotlin.collections.MutableListIterator<test.Anno> = TODO()

override var mkam:  test.Anno
override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<test.Anno> = TODO()

override fun lastIndexOf(element: test.Anno): kotlin.Int = TODO()

override fun removeAt(index: kotlin.Int): test.Anno = TODO()

val viit: S 

var rpoe: Sequence<S> 

var ArrayDeque<Collection<ArrayDeque<Anno>>>.tkxf: S 
get() = TODO()
set(value) = TODO()

val mmwp: Triple<Anno, T, Array<Sequence<String>>> 

var jiec: Anno 

var Boolean.zcjp: Anno 
get() = TODO()
set(value) = TODO()

var alfl: Char 

val bemo: T 

}


