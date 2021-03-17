// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.collections.MutableSet
inline class FieldValue(val value: String)

enum class RequestFields {
    ENUM_ONE
}

class RequestInputParameters(
    private val backingMap: Map<RequestFields, FieldValue>
) : Map<RequestFields, FieldValue> by backingMap

fun box(): String =TODO()

data internal  class A<T, S> (val ax: FieldValue = FieldValue("ufrgw"), val mz: Triple<S, S, UShort>, val vx: S, val lp: FieldValue, val gv: UShort = 34.toUShort()): MutableSet <Int>{

override val size:  kotlin.Int
    get() = TODO()

override fun add(element: kotlin.Int): kotlin.Boolean = TODO()

override fun addAll(elements: kotlin.collections.Collection<kotlin.Int>): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun contains(element: kotlin.Int): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.Int>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.Int> = TODO()

override fun remove(element: kotlin.Int): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<kotlin.Int>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<kotlin.Int>): kotlin.Boolean = TODO()

val tmshk: RequestInputParameters = TODO()

}


