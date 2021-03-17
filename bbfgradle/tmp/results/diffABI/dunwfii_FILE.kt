// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.util.AbstractMap
import kotlin.collections.*
import kotlin.reflect.*
import kotlin.sequences.*


abstract class AbstractMutableMap<K, V> : MutableMap<K, V>, AbstractMap<K, V>()

class MyMap<K, V> : AbstractMutableMap<K, V>() {
    override val size: Int
        get() = 1
    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = null!!
}

fun box(): String =
    TODO()




public interface Ife : MutableCollection<Set<MyMap<AbstractMutableMap<UByte, String>, Short>>>, Annotation{

override val size:  kotlin.Int
override fun add(element: kotlin.collections.Set<MyMap<AbstractMutableMap<kotlin.UByte, kotlin.String>, kotlin.Short>>): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.collections.Set<MyMap<AbstractMutableMap<kotlin.UByte, kotlin.String>, kotlin.Short>>>): kotlin.Boolean = TODO()

override fun remove(element: kotlin.collections.Set<MyMap<AbstractMutableMap<kotlin.UByte, kotlin.String>, kotlin.Short>>): kotlin.Boolean = TODO()

operator public fun   UShort.plus(a: MyMap<UShort, UByte>): LinkedHashSet<Long> = TODO()

val skdq: MyMap<UInt, String> 

val iope: AbstractMutableMap<LinkedHashSet<Short>, AbstractMutableMap<String, ULong>> 

val qwme: Short 

var qlvs: Short 

var nfdv: Double 

}


