// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.annotation.*
import kotlin.time.*
import kotlin.collections.*
import kotlin.contracts.*
import kotlin.text.*
import kotlin.reflect.*
@Retention(AnnotationRetention.RUNTIME)
annotation class Ann(
        val p1: Int,
        val p2: Byte,
        val p4: Int,
        val p5: Int
)

@Ann(
        p1 = java.lang.Byte.MAX_VALUE + 1,
        p2 = 1 + 1,
        p4 = 1 + 1,
        p5 = 1.toByte() + 1
) class MyClass

fun box(): String =TODO()
















public interface Tna <T: UShort> : RandomAccess, List<Byte>{

override fun contains(element: kotlin.Byte): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.Byte>): kotlin.Boolean = TODO()

override fun indexOf(element: kotlin.Byte): kotlin.Int = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun lastIndexOf(element: kotlin.Byte): kotlin.Int = TODO()

override fun listIterator(index: kotlin.Int): kotlin.collections.ListIterator<kotlin.Byte> = TODO()

override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.collections.List<kotlin.Byte> = TODO()

operator  fun <T>   MyClass.rem(a: T): Set<Int> = TODO()

val aphf: ULong 

var uhih: ArrayDeque<Char> 

val abnm: UByte 

val lhgl: MyClass 

val Byte.olwd: T 
get() = TODO()


var Int.rzdu: T 
get() = TODO()
set(value) = TODO()

val UShort.ijbw: Double 
get() = TODO()


var bbra: MyClass 

}


