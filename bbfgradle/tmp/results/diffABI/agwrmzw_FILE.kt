// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


package hnilwyh
import kotlin.collections.*
import kotlin.contracts.*
import kotlin.sequences.*
import kotlin.coroutines.*
import kotlin.reflect.*
interface Trait1 {
    fun foo() : String
}

interface Trait2  {
    fun bar() : String
}

class T1 : Trait1{
    override fun foo():String = TODO()
}

class T2 : Trait2{
    override fun bar():String  = TODO()
}

class C(a:Trait1, b:Trait2) : Trait1 by a, Trait2 by b

fun box() : String =TODO()










internal interface Och : MutableList<T2>, KProperty2<LinkedHashSet<T2>, Collection<UShort>, C>{

override fun addAll(elements: kotlin.collections.Collection<T2>): kotlin.Boolean = TODO()

override fun contains(element: T2): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<T2>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<T2> = TODO()

override fun removeAll(elements: kotlin.collections.Collection<T2>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<T2>): kotlin.Boolean = TODO()

override fun set(index: kotlin.Int, element: T2): T2 = TODO()

override fun get(receiver1: kotlin.collections.LinkedHashSet<T2>, receiver2: kotlin.collections.Collection<kotlin.UShort>): C = TODO()

private fun   C.lrwpc(a: Trait2, b: T1, c: UInt): ULong = TODO()

val jnff: UInt 

var Double.xveb: Trait2 
get() = TODO()
set(value) = TODO()

val uxfj: Long 

val Trait2.zipb: String 
get() = TODO()


var bqhu: Set<UByte> 

}
