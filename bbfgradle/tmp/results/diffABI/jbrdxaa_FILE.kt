// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: -ProperVisibilityForCompanionObjectInstanceField
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.sequences.*
interface A {
    fun test():String = TODO()

    private companion object {
        fun ok():String = TODO()
    }
}

class C : A

fun box():String = TODO()




private interface Tuh : MutableSet<Sequence<Sequence<String>>>, Comparator<Int>{

override val size:  kotlin.Int
override fun add(element: kotlin.sequences.Sequence<kotlin.sequences.Sequence<kotlin.String>>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.sequences.Sequence<kotlin.sequences.Sequence<kotlin.String>>> = TODO()

override fun remove(element: kotlin.sequences.Sequence<kotlin.sequences.Sequence<kotlin.String>>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<kotlin.sequences.Sequence<kotlin.sequences.Sequence<kotlin.String>>>): kotlin.Boolean = TODO()

override fun compare(a: kotlin.Int, b: kotlin.Int): kotlin.Int = TODO()

private fun  uggcd(a: UInt): Short = TODO()

val smgu: Collection<Boolean> 

val lobc: C 

val HashSet<UShort>.nluq: ArrayList<C> 
get() = TODO()


val vgsf: UShort 

var cxsd: A 

}


