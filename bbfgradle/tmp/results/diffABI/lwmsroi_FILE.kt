// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.reflect.*
import kotlin.sequences.*
import kotlin.collections.*
var result = ""

interface Base
open class Child : Base

interface A<T : Base> {
    fun <E : T> foo(a : E):Unit =TODO()
}

class B : A<Child> {
    override fun <E : Child> foo(a : E):Unit =TODO()
}

fun box(): String =TODO()

annotation private  class Epl (val isn: BeforeTest, val cbu: KClass<*>, val kuw: Short)

public interface Dbu : A<Child>, KMutableProperty0<B>{

override fun <E : Child> foo(a: E): kotlin.Unit = TODO()

override fun set(value: B): kotlin.Unit = TODO()

val dmrz: Sequence<Set<UByte>> 

val LinkedHashMap<UShort, ULong>.lsro: UByte 
get() = TODO()


var Long.htqg: MutableMap<Int, Char> 
get() = TODO()
set(value) = TODO()

val vchy: UByte 

var B.vozr: Base 
get() = TODO()
set(value) = TODO()

val ifmp: A<Child> 

val zooo: B 

}

internal interface Obh : Map<Sequence<Base>, Char>, Sequence<String>, KCallable<B>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.sequences.Sequence<Base>, kotlin.Char>>
override val keys:  kotlin.collections.Set<kotlin.sequences.Sequence<Base>>
override val size:  kotlin.Int
override fun containsValue(value: kotlin.Char): kotlin.Boolean = TODO()

override fun get(key: kotlin.sequences.Sequence<Base>): kotlin.Char? = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.String> = TODO()

override val name:  kotlin.String
val coji: ULong 

val Boolean.tkpw: Boolean 
get() = TODO()


var amrr: Base 

val LinkedHashSet<Float>.qqww: Float 
get() = TODO()


var tetu: B 

val ljzz: List<UInt> 

var dwph: A<Child> 

var A<Child>.nnuz: Base 
get() = TODO()
set(value) = TODO()

val enpd: ULong 

}


