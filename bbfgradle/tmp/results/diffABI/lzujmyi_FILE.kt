// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.coroutines.*
import kotlin.reflect.*
import kotlin.sequences.*
open class A {
    open val foo: String = "OK"
}

open class B : A() {

}

class C : B() {
    inner class D {
        val foo: String = super<B>@C.foo
    }
}

fun box():String = TODO()













internal interface Irq <T: ULong, S> : Set<Pair<Sequence<B>, Long>>, MutableIterator<B>{

override fun hasNext(): kotlin.Boolean = TODO()

override fun next(): B = TODO()

val Short.uesf: T 
get() = TODO()


var ozht: B 

val ycpa: String 

var hrjd: T 

val oyfr: HashMap<S, T> 

var qfmn: List<T> 

val gcho: ArrayDeque<UByte> 

}


