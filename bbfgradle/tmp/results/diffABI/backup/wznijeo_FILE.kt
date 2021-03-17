// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.NoWhenBranchMatchedException
import kotlin.collections.MutableMap
class Range(val from : C, val to: C) {
    operator fun iterator():It = TODO()
}

class It(val from: C, val to: C) {
    var c = from.i

    operator fun next(): C =TODO()

    operator fun hasNext(): Boolean = TODO()
}

class C(val i : Int) {
    operator fun component1():Int = TODO()
    operator fun component2():Int = TODO()
    infix fun rangeTo(c: C):Range = TODO()
}

fun doTest(): String =TODO()

fun box(): String =TODO()

private abstract class A(val tc: UInt): NoWhenBranchMatchedException(IllegalArgumentException(AssertionError("aczug"))), MutableMap <UShort, Range>{

override val cause:  kotlin.Throwable?
    get() = TODO()

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.UShort, Range>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.UShort>
    get() = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.UShort, Range>): kotlin.Unit = TODO()

val zrvox: LinkedHashSet<Char> = TODO()

}


