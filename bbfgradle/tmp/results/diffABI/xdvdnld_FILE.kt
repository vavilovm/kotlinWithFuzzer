// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KProperty
import kotlin.annotation.*
import kotlin.collections.*
import kotlin.reflect.*
import kotlin.sequences.*


@Retention(AnnotationRetention.RUNTIME)
annotation class First

class MyClass() {
    public var x: String by Delegate()
        @First set
}

class Delegate {
    operator fun getValue(t: Any?, p: KProperty<*>): String =TODO()

    operator fun setValue(t: Any?, p: KProperty<*>, i: String):Unit =TODO()
}

fun box(): String =TODO()

val iyat: ArrayDeque<Boolean>  = ArrayDeque<Boolean>()

internal abstract class Lwi {


internal fun <T>  yjdpc(a: Byte?): Function2<UShort, Byte, List<Short>> = TODO()

val rmzc: UInt  
get() = 505935220.toUInt()


abstract var mqwa: List<MyClass>





}

private object Lmr {


external  fun <T, S>  lgxhv(a: ArrayList<Triple<LinkedHashMap<Delegate, MyClass>, Boolean, ULong>>, b: Sequence<UShort>): Pair<Long, Byte>

var knng: ULong?  = 1911688258179476007.toULong()
get() = 1911688258179476007.toULong()
private set


val pbaq: Delegate?  
get() = TODO()






}

final class Gta {


private fun  iodnn(a: Long, b: ArrayList<UByte?>, c: Delegate?): Delegate? = TODO()

inline  internal fun <T, S>  bvtmf(a: S, b: UInt?): HashSet<LinkedHashMap<UInt, UInt>?> = TODO()

fun <T>   ArrayDeque<UByte>.ummny(a: UInt, b: ArrayDeque<HashSet<String>>, c: T): LinkedHashMap<String?, MyClass> = TODO()





}

public sealed class Hoz <out T, S> {


val ehee: UShort  
get() = 30450.toUShort()


lateinit var ivgj: First





}




external internal fun <T>  ulhcr(a: MyClass, b: T, c: First, d: MyClass): LinkedHashSet<ULong>

public interface Twc <in T> {


inline  private fun   HashSet<Byte>?.qnnrx(a: Float, b: LinkedHashSet<Delegate>, c: MyClass): First? = TODO()

private fun  kgzmt(a: String): T = TODO()

val rbkc: String  







}


