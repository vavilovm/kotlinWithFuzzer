// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NoConstantValueAttributeForNonConstVals, +JvmFieldInInterface
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


@file:JvmMultifileClass()
import kotlin.test.assertEquals
import kotlin.jvm.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.test.*
import kotlin.time.*
import kotlin.experimental.*



class C {
    val testClassVal = 100

    @JvmField
    val testJvmFieldVal = 105

    companion object {
        val testCompanionObjectVal = 110

        @JvmStatic
        val testJvmStaticCompanionObjectVal = 120

        @JvmField
        val testJvmFieldCompanionObjectVal = 130
    }
}


interface IFoo {
    companion object {
        val testInterfaceCompanionObjectVal = 200
    }
}


@ExperimentalStdlibApi()
interface IBar {
    companion object {
        @JvmField
        val testJvmFieldInInterfaceCompanionObject = 210
    }

}


object Obj {
    val testObjectVal = 300

    @JvmStatic
    val testJvmStaticObjectVal = 310

    @JvmField
    val testJvmFieldObjectVal = 320
}


val testTopLevelVal = 400

@Test()
fun box(): String =TODO()

class Pza : IBar{


inline   fun <T, S>  ylaks(a: T, b: T, c: Triple<IBar, Int?, IBar>): MutableMap<Short, Float> = TODO()

infix public fun   Obj.ererg(a: Obj): Short = TODO()

val ljjp: ULong  
get() = TODO()



companion object {

inline tailrec public fun <T, S>   Map<UInt, Char>.fbytp(a: T, b: S, c: Obj?, d: Map<IBar, C>): Byte = TODO()

external internal fun  jgrtk(a: Sequence<Obj?>): IBar

suspend internal fun <T, S>  jiozn(a: HashSet<IFoo>, b: T, c: @UnsafeVariance()
C?, d: S): Triple<String, Obj, Long?> = TODO()

val llpl: String  
get() = TODO()


val ArrayList<UInt>.dwxa: Short  
@ExperimentalUnsignedTypes()

get() =  -23173


val fyne: UShort  
get() = TODO()


}



}

internal sealed class Rqm <in T, out S> (val zwm: Function2<UInt, ULong, Byte>, var cjv: Float? = 0.379162f): IFoo{


tailrec  fun  nyrsl(a: LinkedHashMap<IFoo, Triple<HashSet<IFoo?>?, UByte?, Long>>, b: ULong): S = TODO()





}

public interface Pne : IBar{


private fun  rltff(a: IBar, b: C): Short = TODO()

private fun  echwx(a: List<Long>, b: Float?, c: Obj): IBar = TODO()





}

private interface Gye : Pne{


val vaqd: LinkedHashMap<Char, Char>  







}

val flsc: Map<IFoo, ULong>  
get() = TODO()

class Pap <T> (val bjm: C): Gye{

override val vaqd:  kotlin.collections.LinkedHashMap<kotlin.Char, kotlin.Char>
    get() = TODO()


suspend  fun  vgeuw(a: IFoo, b: UShort): UShort = TODO()

val nmtu: Collection<HashSet<Boolean>>  
get() = TODO()






}

val vpiv: IFoo  = TODO()

var tgwz: Char  
get() = TODO()
set(value) = TODO()

private object Ubx {


fun  jehlv(a: Obj, b: C, c: LinkedHashMap<IFoo, Int>, d: C): Pair<Array<IBar>, Map<UInt, Collection<IBar>>>? = TODO()

suspend  fun  jycod(a: Char, b: UInt, c: Obj): Double = TODO()

val pwld: IBar?  = TODO()

@ExperimentalTime()
lateinit var lluy: IFoo





}

var tftz: Char  = '?'
@ExperimentalMultiplatform()

get() = '?'
private set

private interface Rmw : IFoo{


fun  kxxbm(a: Map<Map<Obj, Int>, Array<Double>>, b: Boolean?): Map<Char?, Boolean?>

var cwzm: IFoo  



var gpep: String?  



var pcye: IBar  







}


