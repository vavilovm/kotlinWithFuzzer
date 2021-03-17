// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.test.*
import kotlin.collections.*
import kotlin.time.*
import kotlin.annotation.*
import kotlin.contracts.*
inline class Z(val int: Int)
inline class L(val long: Long)
inline class Str(val string: String)
inline class Obj(val obj: Any)

inline fun <R> s1Z(x: Z, fn: (Int, Z) -> R):R = TODO()
inline fun <R> s1L(x: L, fn: (Int, L) -> R):R = TODO()
inline fun <R> s1Str(x: Str, fn: (Int, Str) -> R):R = TODO()
inline fun <R> s1Obj(x: Obj, fn: (Int, Obj) -> R):R = TODO()

fun testS1Z(a: Z):Z = TODO()
fun testS1L(a: L):L = TODO()
fun testS1Str(a: Str):Str = TODO()
fun testS1Obj(a: Obj):Obj = TODO()

fun box(): String =TODO()

annotation public  class Vqv (val tsu: KClass<*>)










public interface Spc : MutableList<LinkedHashMap<Boolean, String>>, MutableListIterator<HashSet<MutableMap<L, String>>>{

override fun addAll(elements: kotlin.collections.Collection<kotlin.collections.LinkedHashMap<kotlin.Boolean, kotlin.String>>): kotlin.Boolean = TODO()

override fun get(index: kotlin.Int): kotlin.collections.LinkedHashMap<kotlin.Boolean, kotlin.String> = TODO()

override fun indexOf(element: kotlin.collections.LinkedHashMap<kotlin.Boolean, kotlin.String>): kotlin.Int = TODO()

override fun removeAt(index: kotlin.Int): kotlin.collections.LinkedHashMap<kotlin.Boolean, kotlin.String> = TODO()

override fun set(index: kotlin.Int, element: kotlin.collections.LinkedHashMap<kotlin.Boolean, kotlin.String>): kotlin.collections.LinkedHashMap<kotlin.Boolean, kotlin.String> = TODO()

override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.collections.MutableList<kotlin.collections.LinkedHashMap<kotlin.Boolean, kotlin.String>> = TODO()

override fun hasNext(): kotlin.Boolean = TODO()

override fun hasPrevious(): kotlin.Boolean = TODO()

override fun previousIndex(): kotlin.Int = TODO()

override fun remove(): kotlin.Unit = TODO()

var jpzf: ULong 

val HashSet<String>.ahen: Obj 
get() = TODO()


var Pair<UByte, Z>.wtxo: L 
get() = TODO()
set(value) = TODO()

val Byte.hbdh: UByte 
get() = TODO()


val jnmr: L 

}


