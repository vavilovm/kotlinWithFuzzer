// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.reflect.*
import kotlin.test.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.ranges.*


interface IFoo {
    fun foo(s: String): String
}

inline class Z(val x: Long) : IFoo {
    override fun foo(s: String): String = TODO()
}

class Test(x: Long) : IFoo by Z(x)

fun box(): String =TODO()







internal open class Gyw (val eic: Byte = 113, vararg icr: IFoo, val cai: ULong = 1496807440908728345.toULong()){

val wbvo: Z = Z(-8145632485812970014)

var jfbg: Test = Test(-5088051911733721879)

var fxnr: IFoo = TODO()

val vyaq: Float = TODO()

var Test.fbay: Test 
get() =  Test(-8324120405571207857)
set(value) = TODO()
data internal  class Gqz (val rtr: UInt){

var sgeb: IFoo = TODO()

val fsox: Byte = TODO()

var String.qgzm: Boolean 
get() =  TODO()
set(value) = TODO()

var idyd: IFoo = TODO()

var lpym: Collection<UByte> = TODO()

}
}

private interface Rts : ClosedRange<Short>, MutableCollection<Map<ArrayDeque<UShort>, Int>>{

override val endInclusive:  kotlin.Short
override fun isEmpty(): kotlin.Boolean = TODO()

override fun contains(element: kotlin.collections.Map<kotlin.collections.ArrayDeque<kotlin.UShort>, kotlin.Int>): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<kotlin.collections.Map<kotlin.collections.ArrayDeque<kotlin.UShort>, kotlin.Int>>): kotlin.Boolean = TODO()

val kftx: Short 

var ubek: Set<IFoo> 

val tgwe: Array<MutableMap<Pair<ULong, Byte>, Long>> 

val zzcy: Char 

val msgx: ArrayList<Test> 

val zqrh: Set<Test> 

val hafa: IFoo 

var Boolean.zzrx: Test 
get() = TODO()
set(value) = TODO()

}


