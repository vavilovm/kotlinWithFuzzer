// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.collections.ListIterator
import kotlin.collections.Iterable
import kotlin.collections.AbstractMutableMap


inline fun foo(x: String, block: (String) -> String):String = TODO()

fun box(): String =TODO()

private open class A(val lg: Byte): Iterable <Boolean>, AbstractMutableMap <Double, Long>(){

override fun iterator(): kotlin.collections.Iterator<kotlin.Boolean> = TODO()

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.Double, kotlin.Long>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.Double>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<kotlin.Long>
    get() = TODO()

override fun containsKey(key: kotlin.Double): kotlin.Boolean = TODO()

override fun get(key: kotlin.Double): kotlin.Long? = TODO()

override fun put(key: kotlin.Double, value: kotlin.Long): kotlin.Long? = TODO()

val zminu: UByte = TODO()
public  class C<T: UByte> (val zn: T, val zg: Float): ListIterator <Collection<UShort>>{

override fun hasNext(): kotlin.Boolean = TODO()

override fun hasPrevious(): kotlin.Boolean = TODO()

override fun next(): kotlin.collections.Collection<kotlin.UShort> = TODO()

override fun nextIndex(): kotlin.Int = TODO()

override fun previous(): kotlin.collections.Collection<kotlin.UShort> = TODO()

override fun previousIndex(): kotlin.Int = TODO()

val mwehr: Short = TODO()

}
}


