// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.reflect.*


class ValByMapExtensionsTest {
    val map: Map<String, String> = hashMapOf("a" to "all", "b" to "bar", "c" to "code")
    val genericMap = mapOf<String, Any?>("i" to 1, "x" to 1.0)
    val mmapOut: MutableMap<String, out String> = mutableMapOf("g" to "out", "g1" to "in")
    val genericMmapOut: MutableMap<String, out Any?> = mmapOut

    val a by map
    val b: String by map
    val c: Any by map
    val d: String? by map
    val e: String by map.withDefault { "default" }
    val f: String? by map.withDefault { null }
    val g: String by mmapOut
    val g1: String by genericMmapOut

    val i: Int by genericMap
    val x: Double by genericMap

    fun doTest():Unit =TODO()
}

fun box(): String =TODO()




private interface Uxu <T: Short, S> : KMutableProperty2<Array<Pair<Short, UInt>>, ValByMapExtensionsTest, HashMap<List<UByte>, ValByMapExtensionsTest>>, MutableList<Int>, MutableIterator<String>{

override fun invoke(p1: kotlin.Array<kotlin.Pair<kotlin.Short, kotlin.UInt>>, p2: ValByMapExtensionsTest): kotlin.collections.HashMap<kotlin.collections.List<kotlin.UByte>, ValByMapExtensionsTest> = TODO()

override val size:  kotlin.Int
override fun containsAll(elements: kotlin.collections.Collection<kotlin.Int>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun remove(element: kotlin.Int): kotlin.Boolean = TODO()

override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.collections.MutableList<kotlin.Int> = TODO()

override fun hasNext(): kotlin.Boolean = TODO()

val tvcz: T 

val svqt: Int 

val ppas: Float 

val Collection<ValByMapExtensionsTest>.itca: ValByMapExtensionsTest 
get() = TODO()


val ValByMapExtensionsTest.dszk: Double 
get() = TODO()


}


