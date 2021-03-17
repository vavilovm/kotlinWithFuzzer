// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.collections.*
inline class A(val x: Any? = null)

var i = 0

fun set1(): A =TODO()

fun test1(n: Int): A =TODO()

fun set1Boxed(): Any? = TODO()
fun test1Boxed(n: Int): Any? = TODO()

fun box(): String =TODO()

public interface Rpw <T: A, S> : KMutableProperty0<UInt>, MutableCollection<LinkedHashSet<A>>{

override fun containsAll(elements: kotlin.collections.Collection<kotlin.collections.LinkedHashSet<A>>): kotlin.Boolean = TODO()

override fun remove(element: kotlin.collections.LinkedHashSet<A>): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<kotlin.collections.LinkedHashSet<A>>): kotlin.Boolean = TODO()

val Int.hcmk: Int 
get() = TODO()


val HashSet<UShort>.gjdb: T 
get() = TODO()


val UShort.xieh: S 
get() = TODO()


val ixeo: S 

var Triple<Pair<Long, A>, A, A>.nkqr: S 
get() = TODO()
set(value) = TODO()

val hljl: Int 

var lknn: ULong 

val pktl: ArrayList<T> 

}


