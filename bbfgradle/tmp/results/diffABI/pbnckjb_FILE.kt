// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.annotation.*
import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.test.*
var setterInvoked = 0

var backing = 42

inline class DelegateStr(val ignored: String) {

    operator fun getValue(thisRef: Any?, prop: Any?):Int =
        TODO()

    operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int):Unit =TODO()
}

inline class DelegateInt(val ignored: Int) {

    operator fun getValue(thisRef: Any?, prop: Any?):Int =
        TODO()

    operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int):Unit =TODO()
}

inline class DelegateLong(val ignored: Long) {

    operator fun getValue(thisRef: Any?, prop: Any?):Int =
        TODO()

    operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int):Unit =TODO()
}

fun box(): String =TODO()

private fun testDelegateStr():Unit =TODO()

private fun testDelegateInt():Unit =TODO()

private fun testDelegateLong():Unit =TODO()

annotation public  class Cot (val pvf: AnnotationRetention, val nsa: KVariance, val xcs: DeprecatedSinceKotlin, val whl: LazyThreadSafetyMode)

internal sealed class Gnh (vararg hta: LinkedHashSet<Float>){

var jvkr: Short = TODO()

val fuir: UInt = TODO()

var sbrv: Short = TODO()

var DelegateInt.qlpa: UByte 
get() =  113.toUByte()
set(value) = TODO()

val nkmj: ArrayList<Long> = ArrayList<Long>()

val jlnm: DelegateStr = TODO()

val UInt.vqss: Set<Long> 
get() =  linkedSetOf<Long>(2372742768974837424)


val DelegateStr.agfl: DelegateStr 
get() =  DelegateStr("epyjq")


}













public interface Zfc <T: DelegateInt, S: ULong> : KMutableProperty1<ArrayDeque<DelegateStr>, DelegateLong>, MutableSet<Short>, Asserter{

override fun get(receiver: kotlin.collections.ArrayDeque<DelegateStr>): DelegateLong = TODO()

override val size:  kotlin.Int
override fun add(element: kotlin.Short): kotlin.Boolean = TODO()

override fun addAll(elements: kotlin.collections.Collection<kotlin.Short>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<kotlin.Short>): kotlin.Boolean = TODO()

override fun assertEquals(message: kotlin.String?, expected: kotlin.Any?, actual: kotlin.Any?): kotlin.Unit = TODO()

override fun assertNotSame(message: kotlin.String?, illegal: kotlin.Any?, actual: kotlin.Any?): kotlin.Unit = TODO()

override fun assertSame(message: kotlin.String?, expected: kotlin.Any?, actual: kotlin.Any?): kotlin.Unit = TODO()

override fun fail(message: kotlin.String?): kotlin.Nothing = TODO()

fun  vqhpc(a: Collection<Int>, b: UShort, c: Float): DelegateLong = TODO()

var nryf: HashMap<Boolean, T> 

var pgfv: Boolean 

var nixk: DelegateLong 

val Double.yoph: T 
get() = TODO()


val pbry: UShort 

var DelegateStr.infa: Byte 
get() = TODO()
set(value) = TODO()

val sgzi: Boolean 

}


