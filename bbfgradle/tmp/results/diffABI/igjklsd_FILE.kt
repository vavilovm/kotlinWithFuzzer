// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.reflect.*
import kotlin.sequences.*
interface FooTrait {
        val propertyTest: String
}

class FooDelegate: FooTrait {
        override val propertyTest: String = "OK"
}

class DelegateTest(): FooTrait by FooDelegate() {
  fun test():String = TODO()
}

fun box():String  = TODO()

internal interface Icc : Iterable<Map<FooTrait, DelegateTest>>, KProperty<FooDelegate>, FooTrait{

fun  yzwwv(a: FooTrait): FooDelegate = TODO()

val itaa: DelegateTest 

val acpe: UShort 

val UShort.abdc: Short 
get() = TODO()


var wrqz: UByte 

var Sequence<Set<Byte>>.dzyx: Long 
get() = TODO()
set(value) = TODO()

}

public interface Jgt <T: Triple<DelegateTest, FooDelegate, DelegateTest>, S> : FooTrait, Set<LinkedHashMap<Array<UInt>, String>>{

override val size:  kotlin.Int
override fun contains(element: kotlin.collections.LinkedHashMap<kotlin.Array<kotlin.UInt>, kotlin.String>): kotlin.Boolean = TODO()

var ruds: Int 

val ztvq: Collection<S> 

var rmjf: String 

var ugpd: T 

var FooTrait.tdfy: LinkedHashSet<Char> 
get() = TODO()
set(value) = TODO()

var egnz: UInt 

var DelegateTest.fmoj: Short 
get() = TODO()
set(value) = TODO()

val sufl: S 

}


