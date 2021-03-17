// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty
import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.jvm.*
import kotlin.contracts.*


operator fun <R> KMutableProperty0<R>.setValue(host: Any?, property: KProperty<*>, value: R):Unit = TODO()
operator fun <R> KMutableProperty0<R>.getValue(host: Any?, property: KProperty<*>): R = TODO()

inline class Foo(val i: Int)

var f = Foo(4)

fun modify(ref: KMutableProperty0<Foo>):Unit =TODO()

fun box(): String =TODO()

internal interface Tui <T> : Collection<UByte>, KProperty0<UByte>{

override val size:  kotlin.Int
override fun iterator(): kotlin.collections.Iterator<kotlin.UByte> = TODO()

override val name:  kotlin.String
suspend  fun  lkzaf(a: HashSet<Foo>, b: ArrayList<LinkedHashSet<Boolean>>, c: Foo): T = TODO()

val Foo.bczh: Foo 
get() = TODO()


var Pair<Float, HashMap<Boolean, Foo>>.koqt: Int 
get() = TODO()
set(value) = TODO()

val tqlc: T 

val wfeg: Int 

var wetf: MutableMap<Foo, Short> 

}




enum internal  class Lmp (nnx: Short = -3980, var nmd: ULong, val dxi: Boolean, val yas: Short = 14915){
SE(19881, 1349177276323332853.toULong(), false, 14884),
EK(-21489, 666152814265808743.toULong(), false, -5967);
annotation public  class Kfu (val gkj: JvmField)
}

enum private  class Xoq {
CG(),
EX(),
YM();

}







public interface Hlo <T, S> : KProperty0<Short>, MutableCollection<Pair<Foo, UByte>>{

override val name:  kotlin.String
override fun add(element: kotlin.Pair<Foo, kotlin.UByte>): kotlin.Boolean = TODO()

override fun remove(element: kotlin.Pair<Foo, kotlin.UByte>): kotlin.Boolean = TODO()

val Foo.myeh: Foo 
get() = TODO()


var cnvk: T 

var Float.obsw: Foo 
get() = TODO()
set(value) = TODO()

val pyvv: Foo 

var amvh: Set<UShort> 

val hfdk: Boolean 

}


