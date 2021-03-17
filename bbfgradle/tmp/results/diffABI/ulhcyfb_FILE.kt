// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
inline class InlineNotNullPrimitive(val x: Int)
inline class InlineNullablePrimitive(val x: Int?)
inline class InlineNotNullReference(val a: Any)
inline class InlineNullableReference(val a: Any?)

fun test1(a: InlineNotNullPrimitive):Unit =TODO()

fun test2(b: InlineNullablePrimitive):Unit =TODO()

fun test3(c: InlineNotNullReference):Unit =TODO()

fun test4(d: InlineNullableReference):Unit =TODO()

fun box(): String =TODO()

public interface Mhx : Annotation, KProperty<Short>{

override val name:  kotlin.String
val iupi: InlineNullableReference 

var vvne: InlineNotNullPrimitive 

var ywvw: InlineNotNullReference 

var UByte.andp: LinkedHashMap<Byte, Map<InlineNotNullPrimitive, Float>> 
get() = TODO()
set(value) = TODO()

val nwhb: Triple<Byte, Sequence<UShort>, ArrayDeque<Byte>> 

val kwaf: Char 

val Float.uvqb: Array<Float> 
get() = TODO()


}

public interface Nmn : Mhx, MutableList<Float>{

override var ywvw:  InlineNotNullReference
override val kwaf:  kotlin.Char
override fun addAll(index: kotlin.Int, elements: kotlin.collections.Collection<kotlin.Float>): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun get(index: kotlin.Int): kotlin.Float = TODO()

override fun listIterator(): kotlin.collections.MutableListIterator<kotlin.Float> = TODO()

override fun listIterator(index: kotlin.Int): kotlin.collections.MutableListIterator<kotlin.Float> = TODO()

override fun set(index: kotlin.Int, element: kotlin.Float): kotlin.Float = TODO()

val Long.hnsu: UShort 
get() = TODO()


var InlineNotNullReference.oxcl: ULong 
get() = TODO()
set(value) = TODO()

var Collection<HashMap<Short, UInt>>.fcmu: ArrayDeque<InlineNotNullPrimitive> 
get() = TODO()
set(value) = TODO()

var ejhh: Long 

var tetq: Byte 

}


