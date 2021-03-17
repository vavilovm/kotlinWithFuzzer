// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NestedClassesInAnnotations
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt


import kotlin.collections.MutableSet
import kotlin.collections.AbstractMutableMap
import kotlin.text.MatchResult
annotation class Foo(val kind: Kind) {
    enum class Kind { FAIL, OK }
}

@Foo(Foo.Kind.OK)
fun box(): String =TODO()

final class A(val dw: Foo, val fa: Char, val zn: Float = 0.17963165f, val jf: Double): AbstractMutableMap <LinkedHashMap<Short, Double>, HashMap<Char, Short>>(), MatchResult{

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.collections.LinkedHashMap<kotlin.Short, kotlin.Double>, kotlin.collections.HashMap<kotlin.Char, kotlin.Short>>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.collections.LinkedHashMap<kotlin.Short, kotlin.Double>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<kotlin.collections.HashMap<kotlin.Char, kotlin.Short>>
    get() = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsKey(key: kotlin.collections.LinkedHashMap<kotlin.Short, kotlin.Double>): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.collections.HashMap<kotlin.Char, kotlin.Short>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun put(key: kotlin.collections.LinkedHashMap<kotlin.Short, kotlin.Double>, value: kotlin.collections.HashMap<kotlin.Char, kotlin.Short>): kotlin.collections.HashMap<kotlin.Char, kotlin.Short>? = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.collections.LinkedHashMap<kotlin.Short, kotlin.Double>, kotlin.collections.HashMap<kotlin.Char, kotlin.Short>>): kotlin.Unit = TODO()

override fun remove(key: kotlin.collections.LinkedHashMap<kotlin.Short, kotlin.Double>): kotlin.collections.HashMap<kotlin.Char, kotlin.Short>? = TODO()

override val destructured:  kotlin.text.MatchResult.Destructured
    get() = TODO()

override val groupValues:  kotlin.collections.List<kotlin.String>
    get() = TODO()

override val groups:  kotlin.text.MatchGroupCollection
    get() = TODO()

override val range:  kotlin.ranges.IntRange
    get() = TODO()

override val value:  kotlin.String
    get() = TODO()

override fun next(): kotlin.text.MatchResult? = TODO()

val boxfi: Foo = TODO()
data public  class C(val th: String = "vkgrw", val zo: MutableMap<Foo, Int> = hashMapOf<Foo, Int>(), val zy: Pair<Char, String>, val pu: Foo){

suspend private fun  aablv(a: Double, b: Foo, c: UShort, d: Collection<UShort>): Pair<Foo, Foo> = TODO()

val wovyb: Float = TODO()
private  class E<T: Foo, S> (val dm: T): MutableSet <ULong>{

override val size:  kotlin.Int
    get() = TODO()

override fun add(element: kotlin.ULong): kotlin.Boolean = TODO()

override fun addAll(elements: kotlin.collections.Collection<kotlin.ULong>): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun contains(element: kotlin.ULong): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.ULong>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.ULong> = TODO()

override fun remove(element: kotlin.ULong): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<kotlin.ULong>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<kotlin.ULong>): kotlin.Boolean = TODO()

fun  xhesj(a: Foo, b: Double, c: Foo, d: UShort): Double = TODO()

val gmrym: UShort = TODO()

}
}
}


