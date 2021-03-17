// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KProperty
import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.contracts.*


object Delegate {
    operator fun getValue(thiz: Any?, property: KProperty<*>): String =TODO()
}

class C {
    val a by Delegate

    fun test(): String =TODO()
}

val x by Delegate

fun box(): String =TODO()










public interface Kce : KProperty2<HashMap<Int, Delegate>, Byte, C>, Grouping<Delegate, HashSet<Int>>{

override fun keyOf(element: Delegate): kotlin.collections.HashSet<kotlin.Int> = TODO()

override fun sourceIterator(): kotlin.collections.Iterator<Delegate> = TODO()

val String.cagm: C 
get() = TODO()


var kqsx: UShort 

val Float.xsnr: Set<C> 
get() = TODO()


val wnas: UByte 

val xhgp: Float 

var myvc: C 

}







internal interface Ckk : MutableList<Delegate>, MutableMap<HashSet<UByte>, C>{

override fun add(index: kotlin.Int, element: Delegate): kotlin.Unit = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsAll(elements: kotlin.collections.Collection<Delegate>): kotlin.Boolean = TODO()

override fun remove(element: Delegate): kotlin.Boolean = TODO()

override fun removeAt(index: kotlin.Int): Delegate = TODO()

override fun retainAll(elements: kotlin.collections.Collection<Delegate>): kotlin.Boolean = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.collections.HashSet<kotlin.UByte>>
override fun containsKey(key: kotlin.collections.HashSet<kotlin.UByte>): kotlin.Boolean = TODO()

override fun containsValue(value: C): kotlin.Boolean = TODO()

override fun put(key: kotlin.collections.HashSet<kotlin.UByte>, value: C): C? = TODO()

private fun  jedxa(a: UByte, b: Long): LinkedHashMap<Char, HashSet<UByte>> = TODO()

var elkw: C 

var UByte.eynw: Delegate 
get() = TODO()
set(value) = TODO()

val cpde: Delegate 

var bmhr: Sequence<Delegate> 

val usmb: String 

val Map<Boolean, UInt>.cpwx: C 
get() = TODO()


}


