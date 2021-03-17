// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
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




private interface Dkz : MutableMap<Foo, Foo>, KClassifier{

override val keys:  kotlin.collections.MutableSet<Foo>
override val values:  kotlin.collections.MutableCollection<Foo>
override fun get(key: Foo): Foo? = TODO()

override fun putAll(from: kotlin.collections.Map<out Foo, Foo>): kotlin.Unit = TODO()

var vcam: Delegate 

var Sequence<Collection<Char>>.hilk: Short 
get() = TODO()
set(value) = TODO()

var csxf: Byte 

val UByte.wwyz: Char 
get() = TODO()


val luvz: Delegate 

var zwaz: ULong 

val lait: Double 

val Pair<HashSet<Long>, Delegate>.oath: UByte 
get() = TODO()


}


