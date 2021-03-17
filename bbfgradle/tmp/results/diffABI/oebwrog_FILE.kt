// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.ranges.*
inline class IC(val s: String)

interface IFoo<T> {
    fun foo(x: T, s: String = "K"): String
}

class FooImpl : IFoo<IC> {
    override fun foo(x: IC, s: String): String = TODO()
}

fun box(): String = TODO()

internal interface Bxr : IFoo<Set<Long>>, KClassifier, KMutableProperty<String>{

val aawg: ULong 

val nqtc: List<Short> 

var pteb: Int 

val higu: ArrayList<FooImpl> 

var lapy: UShort 

var pbhy: Sequence<String> 

var ArrayDeque<FooImpl>.aneu: FooImpl 
get() = TODO()
set(value) = TODO()

}







internal interface Wzg <T, S: List<IFoo<Int>>> : MutableSet<Byte>, ClosedRange<UShort>, IFoo<HashMap<Float, FooImpl>>{

override fun addAll(elements: kotlin.collections.Collection<kotlin.Byte>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.Byte> = TODO()

override val endInclusive:  kotlin.UShort
var tjij: FooImpl 

var IFoo<IFoo<Int>>.jvcm: Boolean 
get() = TODO()
set(value) = TODO()

val Collection<FooImpl>.wvsi: Pair<T, Long> 
get() = TODO()


val HashMap<Short, FooImpl>.dkjk: S 
get() = TODO()


var nzoe: IC 

}


