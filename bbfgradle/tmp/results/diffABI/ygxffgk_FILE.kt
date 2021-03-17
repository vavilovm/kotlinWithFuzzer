// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS
// FILE: tmp0.kt


import kotlin.Number
import kotlin.ranges.ClosedRange
import kotlin.Comparable
private object NotEmptyList : MutableList<Any> {
    override fun contains(element: Any): Boolean = TODO()
    override fun indexOf(element: Any): Int = TODO()
    override fun lastIndexOf(element: Any): Int = TODO()
    override fun remove(element: Any): Boolean = TODO()

    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun containsAll(elements: Collection<Any>): Boolean = TODO()
    override fun isEmpty(): Boolean = TODO()
    override fun get(index: Int): Any = TODO()
    override fun add(element: Any): Boolean = TODO()
    override fun addAll(elements: Collection<Any>): Boolean = TODO()
    override fun addAll(index: Int, elements: Collection<Any>): Boolean = TODO()
    override fun removeAll(elements: Collection<Any>): Boolean = TODO()
    override fun retainAll(elements: Collection<Any>): Boolean = TODO()
    override fun clear(): Unit = TODO()
    override fun set(index: Int, element: Any): Any = TODO()
    override fun add(index: Int, element: Any): Unit = TODO()
    override fun removeAt(index: Int): Any = TODO()
    override fun listIterator(): MutableListIterator<Any> = TODO()
    override fun listIterator(index: Int): MutableListIterator<Any> = TODO()
    override fun subList(fromIndex: Int, toIndex: Int): MutableList<Any> = TODO()
    override fun iterator(): MutableIterator<Any> = TODO()
}

fun box(): String =TODO()

internal sealed class A<T> (val zd: ULong, val op: T, val zv: Int = 1042159564){

tailrec private fun  lszdn(a: UShort, b: NotEmptyList): Triple<Long, Short, NotEmptyList> = TODO()

val quljx: UInt = TODO()
private  class C<T: NotEmptyList, S> (val ls: S, val jg: T, val su: NotEmptyList, val yn: S, val iw: Int): Comparable <NotEmptyList>, ClosedRange <Char>{

override fun compareTo(other: NotEmptyList): kotlin.Int = TODO()

override val endInclusive:  kotlin.Char
    get() = TODO()

override val start:  kotlin.Char
    get() = TODO()

override fun contains(value: kotlin.Char): kotlin.Boolean = TODO()

val vnmbt: HashMap<Long, Short> = TODO()
internal abstract class E<T, S> (val er: HashMap<S, ULong>): Number(), ClosedRange <UShort>{

override fun toByte(): kotlin.Byte = TODO()

override val start:  kotlin.UShort
    get() = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

val yffim: List<Float> = TODO()

}
}
}


