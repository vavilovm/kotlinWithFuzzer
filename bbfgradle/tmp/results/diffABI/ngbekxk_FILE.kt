// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

package test

import kotlin.test.assertEquals
import kotlin.collections.*
import kotlin.text.*
import kotlin.reflect.*
import kotlin.ranges.*


interface H<T> {
    val parent : T?
}

interface A : H<A>

fun box(): String =TODO()




public interface Dsm : KProperty2<H<H<A>>, Char, A>, MutableSet<H<UByte>>, ClosedRange<UByte>{

override fun add(element: test.H<kotlin.UByte>): kotlin.Boolean = TODO()

override fun addAll(elements: kotlin.collections.Collection<test.H<kotlin.UByte>>): kotlin.Boolean = TODO()

override fun remove(element: test.H<kotlin.UByte>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

var ihwu: ArrayDeque<UByte> 

var vjzu: UShort 

val cryp: H<ArrayDeque<H<ULong>>> 

var mexa: H<Long> 

var iwwq: A 

val LinkedHashMap<Boolean, ArrayDeque<String>>.nzis: A 
get() = TODO()


val sgrp: H<A> 

var mjce: H<Short> 

}


