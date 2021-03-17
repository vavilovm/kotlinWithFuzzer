// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.text.*
import kotlin.coroutines.*
interface IQ {
    fun ok(): String
}

inline class X(val t: IQ): IQ {
    override fun ok(): String = TODO()
}

interface IFoo1 {
    fun foo(): IQ
}

interface IFoo2 {
    fun foo(): Any
}

object OK : IQ {
    override fun ok(): String = TODO()
}

class Test : IFoo1, IFoo2 {
    override fun foo(): X = TODO()
}

fun box(): String =TODO()







private interface Uus <T, S> : IFoo2, IQ{

val zunc: Test 

var Set<UByte>.fbmq: Double 
get() = TODO()
set(value) = TODO()

val Collection<Triple<Double, Long, ArrayList<UByte>>>.rmot: S 
get() = TODO()


val zwip: Float 

val xkcq: ArrayList<S> 

val llew: Sequence<S> 

var viwl: Boolean 

var lvel: IFoo1 

val Sequence<UByte>.ieyn: UInt 
get() = TODO()


}







internal interface Koo : CoroutineContext, KProperty0<IFoo1>{

override fun minusKey(key: kotlin.coroutines.CoroutineContext.Key<*>): kotlin.coroutines.CoroutineContext = TODO()

suspend public fun  tuyog(a: Test, b: MutableMap<X, OK>, c: LinkedHashSet<UShort>, d: LinkedHashSet<IQ>): List<UShort> = TODO()

var utxy: List<ULong> 

var krvd: ArrayDeque<Short> 

val Double.uvij: Collection<Float> 
get() = TODO()


val bwzm: UByte 

var zauk: Pair<ArrayDeque<Int>, UShort> 

}

private interface Ncz : MutableSet<HashMap<MutableMap<Boolean, Collection<Char>>, Double>>, IQ{

override val size:  kotlin.Int
override fun add(element: kotlin.collections.HashMap<kotlin.collections.MutableMap<kotlin.Boolean, kotlin.collections.Collection<kotlin.Char>>, kotlin.Double>): kotlin.Boolean = TODO()

override fun contains(element: kotlin.collections.HashMap<kotlin.collections.MutableMap<kotlin.Boolean, kotlin.collections.Collection<kotlin.Char>>, kotlin.Double>): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.collections.HashMap<kotlin.collections.MutableMap<kotlin.Boolean, kotlin.collections.Collection<kotlin.Char>>, kotlin.Double>>): kotlin.Boolean = TODO()

var nuco: UShort 

val X.shvg: LinkedHashSet<IQ> 
get() = TODO()


val hwtj: IFoo1 

val utem: Double 

val jkze: X 

val UInt.oxsw: Set<IFoo2> 
get() = TODO()


}


