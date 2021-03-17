// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

package test

import kotlin.test.assertEquals
import kotlin.properties.*
import kotlin.collections.*
import kotlin.sequences.*


interface H<T> {
    fun foo(): T?
}

interface A : H<A>

fun box(): String =TODO()




private interface Ltq : MutableCollection<H<H<A>>>, Map<Byte, Boolean>, H<Boolean>{

override val size:  kotlin.Int
override fun addAll(elements: kotlin.collections.Collection<test.H<test.H<test.A>>>): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsAll(elements: kotlin.collections.Collection<test.H<test.H<test.A>>>): kotlin.Boolean = TODO()

override fun remove(element: test.H<test.H<test.A>>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<test.H<test.H<test.A>>>): kotlin.Boolean = TODO()

override val values:  kotlin.collections.Collection<kotlin.Boolean>
public fun  inyja(a: ArrayDeque<Short>, b: Set<H<A>>, c: Float, d: Triple<UByte, A, ULong>): A = TODO()

val LinkedHashMap<UByte, A>.uwzs: MutableMap<String, Float> 
get() = TODO()


val A.fpfj: A 
get() = TODO()


val H<Double>.nicf: HashSet<Triple<Char, A, Byte>> 
get() = TODO()


var dpfo: Collection<A> 

val srfd: A 

val Boolean.eiax: Byte 
get() = TODO()


var llhe: Long 

var fpzg: Byte 

}


