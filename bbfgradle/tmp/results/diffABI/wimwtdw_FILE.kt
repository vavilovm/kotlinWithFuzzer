// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.reflect.*
import kotlin.collections.*
open class A<T> {
    open fun <U> foo(t: T, u: U):String = TODO()
}

class Z : A<String>() {
    override fun <U> foo(t: String, u: U):String = TODO()
}


fun box(): String =TODO()







internal interface Xvc : KMutableProperty2<String, Collection<Short>, Boolean>, MutableCollection<A<Z>>{

override val name:  kotlin.String
override fun get(receiver1: kotlin.String, receiver2: kotlin.collections.Collection<kotlin.Short>): kotlin.Boolean = TODO()

override fun invoke(p1: kotlin.String, p2: kotlin.collections.Collection<kotlin.Short>): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<A<Z>>): kotlin.Boolean = TODO()

val yhem: Z 

var icrt: Float 

var ugel: Z 

var rjtg: Float 

val zydp: ULong 

val dmrk: Z 

}

private interface Gga <T, S: UInt> : Annotation, Xvc{

override fun get(receiver1: kotlin.String, receiver2: kotlin.collections.Collection<kotlin.Short>): kotlin.Boolean = TODO()

override val yhem:  Z
override val zydp:  kotlin.ULong
override fun set(receiver1: kotlin.String, receiver2: kotlin.collections.Collection<kotlin.Short>, value: kotlin.Boolean): kotlin.Unit = TODO()

override fun containsAll(elements: kotlin.collections.Collection<A<Z>>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<A<Z>>): kotlin.Boolean = TODO()

infix  fun   LinkedHashMap<Char, A<A<Double>>>.pdujj(a: A<MutableMap<UByte, String>>): T = TODO()

val Pair<List<UShort>, Byte>.yisl: Collection<T> 
get() = TODO()


val qrhj: ArrayDeque<T> 

var klom: Z 

var dizh: A<T> 

val Float.dwbi: A<A<ULong>> 
get() = TODO()


val xkas: A<List<Byte>> 

var A<Double>.yofp: S 
get() = TODO()
set(value) = TODO()

}


