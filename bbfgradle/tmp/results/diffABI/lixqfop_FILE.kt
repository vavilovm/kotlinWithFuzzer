// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test

import kotlin.reflect.KCallable
import kotlin.reflect.jvm.*
import kotlin.test.assertEquals
import kotlin.reflect.*
import kotlin.sequences.*
import kotlin.collections.*
import kotlin.ranges.*


inline class Z1(val publicX: Int) {
    companion object {
        val publicXRef = Z1::publicX
        val publicXBoundRef = Z1(42)::publicX
    }
}

inline class Z2(internal val internalX: Int) {
    companion object {
        val internalXRef = Z2::internalX
        val internalXBoundRef = Z2(42)::internalX
    }
}

inline class Z3(private val privateX: Int) {
    companion object {
        val privateXRef = Z3::privateX
        val privateXBoundRef = Z3(42)::privateX
    }
}

inline class ZZ(val x: Z1)

fun KCallable<*>.getJavaTypesOfParams() = parameters.map { it.type.javaType }.toString()
fun KCallable<*>.getJavaTypeOfResult() = returnType.javaType.toString()

fun box(): String =TODO()

public interface Rlq : Sequence<Sequence<UInt>>, KProperty1<Z3, Z3>, MutableIterator<Z2>{

override fun get(receiver: test.Z3): test.Z3 = TODO()

override fun invoke(p1: test.Z3): test.Z3 = TODO()

var zhrn: ULong 

var Pair<Char, ArrayList<Z2>>.fbab: Triple<Float, Map<Z3, Z3>, UInt> 
get() = TODO()
set(value) = TODO()

var kous: Double 

val umoq: HashSet<Short> 

var MutableMap<ZZ, Byte>.pksv: Array<Z2> 
get() = TODO()
set(value) = TODO()

var ljky: HashMap<Z1, List<Array<ZZ>>> 

var Boolean.npmn: ZZ 
get() = TODO()
set(value) = TODO()

val fmgd: LinkedHashMap<ZZ, ZZ> 

var vgve: Set<Z3> 

}













private interface Xtr <T, S> : ClosedRange<Char>, MutableIterator<Int>{

override fun isEmpty(): kotlin.Boolean = TODO()

override fun remove(): kotlin.Unit = TODO()

var Short.tvsp: S 
get() = TODO()
set(value) = TODO()

val HashSet<Int>.tsee: ULong 
get() = TODO()


val kkkb: ArrayDeque<Z1> 

val bhxj: Collection<ZZ> 

val Collection<Float>.tyqv: Z3 
get() = TODO()


val Z3.bkst: Pair<T, Float> 
get() = TODO()


var Triple<Byte, MutableMap<Long, Byte>, Array<Z1>>.fdgc: Z1 
get() = TODO()
set(value) = TODO()

}




internal open class Iod <T, S: Z3> (akk: LinkedHashMap<UByte, Z2>, uah: Long, eux: Z1, val ixs: Z1, val puw: Long){

val zdng: UByte = TODO()

val qnwn: Short = TODO()

var tthh: S = TODO()

val oqll: Z2 = Z2(-1044666924)

val bzhq: Z3 = TODO()

val LinkedHashMap<UByte, Long>.iwoh: HashMap<Short, Z3> 
get() =  hashMapOf<Short, Z3>(Pair<Short, Z3>(27619, Z3(-241346791)))


var eoov: ZZ = ZZ(Z1(1521227212))

val zybw: ZZ = TODO()

var vist: UShort = TODO()

}


