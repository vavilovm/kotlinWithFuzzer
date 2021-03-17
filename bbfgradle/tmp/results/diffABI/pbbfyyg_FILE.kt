// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.coroutines.*
import kotlin.collections.*
import kotlin.text.*
import kotlin.sequences.*
import kotlin.reflect.*
inline class Z1(val x: String)
inline class ZN(val z: Z1?)
inline class ZN2(val z: ZN)

fun zap(b: Boolean): ZN2? = TODO()

fun eq(a: Any?, b: Any?):Boolean = TODO()

fun box(): String =TODO()



















internal interface Etr <T: ZN> : Function<String>, KCallable<Char>{

val umjo: T 

var beec: ZN 

var iwub: UShort 

var mtdm: T 

val UByte.bwne: HashMap<Sequence<UShort>, HashMap<ZN, UInt>> 
get() = TODO()


val hqqh: UShort 

val dtub: Collection<T> 

val zlzv: T 

val ZN.awhq: ZN 
get() = TODO()


}


