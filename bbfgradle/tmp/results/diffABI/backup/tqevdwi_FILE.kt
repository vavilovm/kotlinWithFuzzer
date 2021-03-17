// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.collections.AbstractMap
import kotlin.NullPointerException
inline class Foo(val x: Int) : Comparable<Foo> {
    override fun compareTo(other: Foo): Int =TODO()
}

fun box(): String =TODO()

private sealed class A(val ry: UShort, val ss: Short = -879): NullPointerException(){

override val cause:  kotlin.Throwable?
    get() = TODO()

override val message:  kotlin.String?
    get() = TODO()

val tlvmc: ArrayList<Foo> = TODO()
data private  class C(val pu: Collection<Short>, val iw: ArrayDeque<Foo>, val wb: Foo): AbstractMap <Set<MutableMap<UShort, Int>>, UInt>(){

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.Set<kotlin.collections.MutableMap<kotlin.UShort, kotlin.Int>>, kotlin.UInt>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.collections.Set<kotlin.collections.MutableMap<kotlin.UShort, kotlin.Int>>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.UInt>
    get() = TODO()

override fun get(key: kotlin.collections.Set<kotlin.collections.MutableMap<kotlin.UShort, kotlin.Int>>): kotlin.UInt? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

val dgrwp: Sequence<List<UShort>> = TODO()

}
}


