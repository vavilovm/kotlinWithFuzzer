// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.sequences.*
import kotlin.collections.*
class Delegate(val value: String) {
    operator fun getValue(thisRef: Any?, kProperty: Any?):String = TODO()
}

fun box(): String =TODO()







private interface Mmt : Iterator<Delegate>, KProperty<Delegate>, Annotation{

override fun hasNext(): kotlin.Boolean = TODO()

val Delegate.galk: Delegate 
get() = TODO()


val MutableMap<HashSet<Delegate>, UByte>.fpiq: Delegate 
get() = TODO()


val aeoq: Delegate 

val qgih: ULong 

val gbus: Double 

}

private interface Hmf : Mmt, MutableList<UInt>{

override fun hasNext(): kotlin.Boolean = TODO()

override val aeoq:  Delegate
override val gbus:  kotlin.Double
override fun next(): Delegate = TODO()

override fun addAll(index: kotlin.Int, elements: kotlin.collections.Collection<kotlin.UInt>): kotlin.Boolean = TODO()

override fun contains(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun get(index: kotlin.Int): kotlin.UInt = TODO()

override fun listIterator(index: kotlin.Int): kotlin.collections.MutableListIterator<kotlin.UInt> = TODO()

val klam: Double 

var yrks: Sequence<Delegate> 

val lvuq: Delegate 

val jytt: Delegate 

var Byte.hinp: ULong 
get() = TODO()
set(value) = TODO()

var oumg: Delegate 

}


