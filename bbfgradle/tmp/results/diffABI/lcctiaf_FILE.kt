// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.sequences.*
import kotlin.collections.*
import kotlin.coroutines.*
import kotlin.jvm.*
import kotlin.test.*
import kotlin.annotation.*

inline class Z(val int: Int)
inline class L(val long: Long)
inline class Str(val string: String)
inline class Obj(val obj: Any)

inline fun <R> withDefaultZ(fn: (Z) -> R, x: Z = Z(42)):R = TODO()
inline fun <R> withDefaultL(fn: (L) -> R, x: L = L(42L)):R = TODO()
@JvmOverloads()
inline fun <R> withDefaultL2(x: L = L(42L), fn: (L) -> R):R = TODO()
@Strictfp()
inline fun <R> withDefaultStr(fn: (Str) -> R, x: Str = Str("abc")):R = TODO()
inline fun <R> withDefaultObj(fn: (Obj) -> R, x: Obj = Obj("abc")):R = TODO()
inline fun <R> withDefaultObj2(x: Obj = Obj("abc"), fn: (Obj) -> @JvmWildcard()
R):R = TODO()

fun testWithDefaultZ():Z = TODO()
fun testWithDefaultL():L = TODO()
fun testWithDefaultL2():L = TODO()
@BeforeTest()
fun testWithDefaultStr():Str = TODO()
fun testWithDefaultObj():Obj = TODO()
fun testWithDefaultObj2():Obj = TODO()

fun box(): String =TODO()

internal interface Xaf <T, S> : Annotation, KProperty0<Boolean>{

override fun get(): kotlin.Boolean = TODO()

override fun invoke(): kotlin.Boolean = TODO()

var trpb: UShort 

var brgu: Str 

val qjfy: UInt 

val zzek: Sequence<S> 

val fqwk: String 

var yfma: UShort 

public abstract fun  <R> fold(initial: R, operation: (R, kotlin.coroutines.CoroutineContext.Element) -> R): R

}




private final class Uai <T, S> {

suspend internal fun  qoiqk(a: Obj, b: LinkedHashSet<@JvmWildcard()
Z>, c: UByte): List<T> = TODO()

val Sequence<String>.rtug: Str 
get() =  TODO()


val sgup: HashMap<T, S> = TODO()

val oyjk: Z = Z(-1228215736)

var @ParameterName("jlnli")
Obj.foft: Short 
get() =  -16613
set(value) = TODO()

val Str.vzwm: MutableMap<S, Z> 
get() =  TODO()


val agtn: T = TODO()

}




enum   class Dce (val kcs: Obj){
TM(Obj("bvbvb")){
override val xqrcu: Obj
    get() = TODO()
},
PE(Obj("grxef")){
override val xqrcu: Obj
    get() = TODO()
},
IE(Obj("wygzs")){
override val xqrcu: Obj
    get() = TODO()
};
abstract val xqrcu: Obj

}







private interface Hmt : Xaf<Set<LinkedHashMap<ArrayList<Int>, Obj>>, Double>, CoroutineContext{

override fun get(): kotlin.Boolean = TODO()

override var trpb:  kotlin.UShort
override var brgu:  Str
override val qjfy:  kotlin.UInt
override val fqwk:  kotlin.String
suspend  fun   Str.pyccy(a: Obj, b: Z, c: LinkedHashMap<Z, Short>): LinkedHashMap<Set<Obj>, UInt> = TODO()

var tkau: Boolean 

var Str.qlll: UShort 
get() = TODO()
set(value) = TODO()

var L.spsj: Str 
get() = TODO()
set(value) = TODO()

var lyjm: UInt 

var ydwm: Boolean 

var wavs: Byte 

val Obj.ipyr: Short 
get() = TODO()


}


