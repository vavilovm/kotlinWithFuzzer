// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.reflect.*
import kotlin.test.assertEquals
import kotlin.collections.*


class C(val x: Int, var y: Int) {
    val xx: Int
        get() = x

    var yy: Int
        get() = y
        set(value) { y = value }
}

val c = C(1, 2)

val c_x = c::x
val c_xx = c::xx
val c_y = c::y
val c_yy = c::yy

fun box(): String =TODO()

public interface Rlb : MutableCollection<Set<Short>>, Grouping<Float, C>{

override fun add(element: kotlin.collections.Set<kotlin.Short>): kotlin.Boolean = TODO()

override fun addAll(elements: kotlin.collections.Collection<kotlin.collections.Set<kotlin.Short>>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.collections.Set<kotlin.Short>> = TODO()

override fun sourceIterator(): kotlin.collections.Iterator<kotlin.Float> = TODO()

var tqce: Pair<C, Long> 

val mkcf: C 

val qbpr: C 

val oivc: List<C> 

val Pair<String, C>.wfhn: HashSet<String> 
get() = TODO()


val ozov: C 

var lmvj: C 

val xmjx: C 

}


