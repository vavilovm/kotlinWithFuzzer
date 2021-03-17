// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


package idmgtjy
import kotlin.reflect.*
import kotlin.collections.*
object Foo {
    var a: Int = 42
    var d by Delegate(0)
}

var setterInvoked = 0

inline class Delegate(val ignored: Int) {

    operator fun getValue(thisRef: Any?, prop: Any?):Int = TODO()

    operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int):Unit =TODO()
}


fun box(): String =TODO()

internal interface Myd <T, S> : KMutableProperty2<Delegate, ULong, ArrayDeque<LinkedHashMap<Double, Boolean>>>, MutableSet<Delegate>{

override fun get(receiver1: Delegate, receiver2: kotlin.ULong): kotlin.collections.ArrayDeque<kotlin.collections.LinkedHashMap<kotlin.Double, kotlin.Boolean>> = TODO()

override fun invoke(p1: Delegate, p2: kotlin.ULong): kotlin.collections.ArrayDeque<kotlin.collections.LinkedHashMap<kotlin.Double, kotlin.Boolean>> = TODO()

override fun containsAll(elements: kotlin.collections.Collection<Delegate>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<Delegate> = TODO()

override fun remove(element: Delegate): kotlin.Boolean = TODO()

fun  owdbz(a: UInt): Int = TODO()

val ptsa: Char 

var Foo.rgnl: LinkedHashSet<Char> 
get() = TODO()
set(value) = TODO()

val HashMap<UByte, Delegate>.gpnq: UShort 
get() = TODO()


var zzvf: T 

val hiyz: S 

val gion: ArrayList<S> 

val ucqn: UShort 

}
