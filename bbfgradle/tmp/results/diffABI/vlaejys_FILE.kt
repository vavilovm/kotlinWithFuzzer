// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.jvm.*


open class B

class A {

    companion object {
        @JvmStatic
        fun <T: B> a(s: T) : T =TODO()
    }
}

fun box(): String =TODO()

private interface Pov : Map<ULong, List<Boolean>>, MutableList<Short>{

override val keys:  kotlin.collections.Set<kotlin.ULong>
override val values:  kotlin.collections.Collection<kotlin.collections.List<kotlin.Boolean>>
override fun get(key: kotlin.ULong): kotlin.collections.List<kotlin.Boolean>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun add(index: kotlin.Int, element: kotlin.Short): kotlin.Unit = TODO()

override fun addAll(elements: kotlin.collections.Collection<kotlin.Short>): kotlin.Boolean = TODO()

override fun contains(element: kotlin.Short): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.Short> = TODO()

override fun listIterator(): kotlin.collections.MutableListIterator<kotlin.Short> = TODO()

override fun remove(element: kotlin.Short): kotlin.Boolean = TODO()

val kahc: A 

var drqw: UByte 

var sorv: Sequence<Double> 

val tbck: UInt 

var B.nawv: Long 
get() = TODO()
set(value) = TODO()

var zgiq: UShort 

var List<Float>.dzwy: HashMap<String, Map<A, Short>> 
get() = TODO()
set(value) = TODO()

}


