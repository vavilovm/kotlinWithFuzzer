// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.*
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.*
import kotlin.collections.*
import kotlin.test.*
import kotlin.sequences.*
import kotlin.ranges.*
import kotlin.jvm.*
import kotlin.annotation.*
import kotlin.contracts.*



class A(@OptIn(Annotation::class)
param: String) {
    protected var v: String = param

    fun ref():KMutableProperty1<A, String> = TODO()
}

@Test()
@JvmOverloads()
@BeforeTest()
fun box(): String =TODO()

private interface Uqm : KMutableProperty2<Pair<A, A>, Float, String>, Annotation{

override val name:  kotlin.String
var qqbp: ULong 

var eemx: Int 

var wwnt: Char 

var UInt.hyeg: A 
get() = TODO()
set(value) = TODO()

var A.wpud: A 
get() = TODO()
set(value) = TODO()

var hxaf: LinkedHashMap<Double, Pair<@ParameterName("rqtgn")
A, LinkedHashSet<String>>> 

val A.gdix: A 
get() = TODO()


@Deprecated("lvzvz", ReplaceWith("lvpgu", "rbshl"), kotlin.DeprecationLevel.HIDDEN)
val Float.rpda: A 
get() = TODO()


var najp: A 

}







@Ignore()
final class Eie <T: A, S> (val sec: A, var fay: A, val psw: A, val etj: Short){

var znpf: A = TODO()

var pehi: A = A("xsvvo")

val A.gjmv: String 
get() =  TODO()


var ktru: S = TODO()

val awhu: ULong = TODO()

var fnol: String = TODO()

var xrmt: T = TODO()

var ddho: Triple<Long, Double, S> = TODO()

}







private  class Vye <T, S: Short> (var cgt: UByte = 51.toUByte(), var vyt: A = A("zehsy")){

val gkfh: A = A("duxpy")

val erep: T = TODO()

var Sequence<Set<ULong>>.avwc: S 
get() =  TODO()
set(value) = TODO()

val ULong.vhfx: HashMap<UInt, A> 
get() =  TODO()


@ExperimentalMultiplatform()
var Boolean.yeqk: String 
get() =  "unypl"
set(value) = TODO()

val oczn: S = TODO()

val qqhk: A = A("dkzym")

@ExperimentalMultiplatform()
var Float.hltc: T 
get() =  TODO()
set(value) = TODO()

var A.ksrh: Short 
get() =  -29789
set(value) = TODO()

}











