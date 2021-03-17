// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.jvm.*
import kotlin.properties.*
import kotlin.contracts.*
import kotlin.collections.*
import kotlin.reflect.*
import kotlin.ranges.*
import kotlin.sequences.*
var result = "fail 2"
object Foo {
    @JvmStatic
    private val a = "OK"

    val b = { a }
    val c = Runnable { result = a }
}

fun box(): String =TODO()




internal interface Cpf : Set<Sequence<ArrayDeque<Foo>>>, KProperty2<UShort, Float, Boolean>, ClosedFloatingPointRange<Long>{

override val size:  kotlin.Int
override fun contains(element: kotlin.sequences.Sequence<kotlin.collections.ArrayDeque<Foo>>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun get(receiver1: kotlin.UShort, receiver2: kotlin.Float): kotlin.Boolean = TODO()

val ULong.nvnh: Set<String> 
get() = TODO()


val khre: UInt 

val MutableMap<HashMap<Foo, UInt>, LinkedHashMap<Long, Float>>.dhxw: MutableMap<String, String> 
get() = TODO()


var MutableMap<HashMap<ULong, Byte>, Set<Short>>.xcoe: Foo 
get() = TODO()
set(value) = TODO()

var mgvw: ArrayDeque<Long> 

var jxol: UByte 

}


