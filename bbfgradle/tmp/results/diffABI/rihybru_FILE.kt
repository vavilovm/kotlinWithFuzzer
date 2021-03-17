// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.test.assertEquals
import kotlin.collections.*
import kotlin.reflect.KFunction
import kotlin.coroutines.*
import kotlin.reflect.*
import kotlin.annotation.*




interface A<A1, box>
interface B<B1, B2> : A<Int, String>
interface C<C1> : B<String, String>
interface D : C<Int>

@Retention(AnnotationRetention.SOURCE)
annotation class SourceAnno

fun box(): Int =TODO()

suspend  fun  TODO(a: Unit, TODO: String, c: String): String = TODO()







internal object Uko  {


public  fun <T>  box(TODO: String, b: UInt, A: Function2<T, List<String>, *>): JvmField = TODO()

fun box(): String =TODO()



}










public annotation  class Int  (open val a: String = "base"){




}




inline fun  fvggd(strings: List<String?>, b: String?, c: ArrayDeque<String>): C<Boolean> = TODO()

internal fun  TODO(a: String, b: Int): Boolean = TODO()

// !LANGUAGE: +InlineClasses
inline class R(private val r: Long) {
    fun test():String = TODO()

    private fun ok():String = TODO()
}








