// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.sequences.*
interface ImmutableCollection<out E> : Collection<E> {
    fun add(element: @UnsafeVariance E): ImmutableCollection<E>
    fun addAll(elements: Collection<@UnsafeVariance E>): ImmutableCollection<E>
    fun remove(element: @UnsafeVariance E): ImmutableCollection<E>
}

class ImmutableCollectionmpl<E> : ImmutableCollection<E> {
    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun contains(element: E): Boolean =TODO()

    override fun containsAll(elements: Collection<E>): Boolean =TODO()

    override fun isEmpty(): Boolean =TODO()

    override fun iterator(): Iterator<E> =TODO()

    override fun add(element: E): ImmutableCollection<E> = TODO()
    override fun addAll(elements: Collection<E>): ImmutableCollection<E> = TODO()
    override fun remove(element: E): ImmutableCollection<E> = TODO()
}

fun box(): String =TODO()










internal interface Qeq : ImmutableCollection<Pair<ULong, ImmutableCollectionmpl<ImmutableCollectionmpl<Char>>>>{

override fun add(element: kotlin.Pair<kotlin.ULong, ImmutableCollectionmpl<ImmutableCollectionmpl<kotlin.Char>>>): ImmutableCollection<kotlin.Pair<kotlin.ULong, ImmutableCollectionmpl<ImmutableCollectionmpl<kotlin.Char>>>> = TODO()

override fun addAll(elements: kotlin.collections.Collection<kotlin.Pair<kotlin.ULong, ImmutableCollectionmpl<ImmutableCollectionmpl<kotlin.Char>>>>): ImmutableCollection<kotlin.Pair<kotlin.ULong, ImmutableCollectionmpl<ImmutableCollectionmpl<kotlin.Char>>>> = TODO()

override fun contains(element: kotlin.Pair<kotlin.ULong, ImmutableCollectionmpl<ImmutableCollectionmpl<kotlin.Char>>>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.Pair<kotlin.ULong, ImmutableCollectionmpl<ImmutableCollectionmpl<kotlin.Char>>>> = TODO()


abstract fun  fhwci(a: UInt): ImmutableCollection<Char>

var uhbt: Float  

val kvdg: MutableMap<Sequence<ULong>, Double>  



var ebxt: ArrayList<Long>  







}


