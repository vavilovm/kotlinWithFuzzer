// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: all
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.collections.*
interface Test<T> {
    fun test(p: T): T =TODO()
}

class TestClass : Test<String> {
    override fun test(p: String): String =TODO()
}

fun <T> execute(t: Test<T>, p: T): T =TODO()

fun box(): String =TODO()

private interface Cgj <T: TestClass> : Test<Map<TestClass, HashSet<Long>>>, List<ArrayDeque<ULong>>{

override val size:  kotlin.Int
override fun containsAll(elements: kotlin.collections.Collection<kotlin.collections.ArrayDeque<kotlin.ULong>>): kotlin.Boolean = TODO()

override fun indexOf(element: kotlin.collections.ArrayDeque<kotlin.ULong>): kotlin.Int = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun lastIndexOf(element: kotlin.collections.ArrayDeque<kotlin.ULong>): kotlin.Int = TODO()

override fun listIterator(): kotlin.collections.ListIterator<kotlin.collections.ArrayDeque<kotlin.ULong>> = TODO()

override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.collections.List<kotlin.collections.ArrayDeque<kotlin.ULong>> = TODO()

public fun  jsicw(a: Boolean, b: HashMap<TestClass, UByte>): TestClass = TODO()

var kybf: Float 

var onfa: UShort 

var tuyb: Test<Double> 

val kyyn: T 

var akbk: Map<Boolean, TestClass> 

val gcex: Test<UByte> 

val uwvu: UShort 

}


