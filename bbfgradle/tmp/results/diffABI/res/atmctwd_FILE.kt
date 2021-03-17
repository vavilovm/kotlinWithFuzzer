// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// FILE: tmp0.kt

import java.util.Arrays
import kotlin.reflect.KClass
import kotlin.reflect.KFunction0
import kotlin.reflect.*
import kotlin.text.*
import kotlin.collections.*


inline fun <reified T> test(kFunction: KFunction0<Unit>, test: T.() -> Unit):Unit =TODO()

fun check(b: Boolean, message: String):Unit =TODO()

annotation class Foo(vararg val a: String = ["a", "b"])

annotation class Bar(vararg val a: KClass<*> = [Int::class])

@Foo(*["/"])
fun test1():Unit =TODO()

@Bar(*[Long::class, String::class])
fun test2():Unit =TODO()

fun box(): String =TODO()

private interface Bip <T, S> : MatchResult, MutableSet<MutableMap<Bar, Long>>{

override val groupValues:  kotlin.collections.List<kotlin.String>
override val value:  kotlin.String
override fun next(): kotlin.text.MatchResult? = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.collections.MutableMap<Bar, kotlin.Long>>): kotlin.Boolean = TODO()

override fun remove(element: kotlin.collections.MutableMap<Bar, kotlin.Long>): kotlin.Boolean = TODO()

var Bar.pbph: Bar 
get() = TODO()
set(value) = TODO()

var fekq: Array<List<Int>> 

var crki: S 

var rmet: S 

val demw: Double 

val xvfs: Char 

var Foo.yztv: S 
get() = TODO()
set(value) = TODO()

}


