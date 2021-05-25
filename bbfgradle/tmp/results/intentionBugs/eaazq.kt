// PSI ERROR. Modified in 317
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS_IR
// // IGNORE_BACKEND: JS_IR_ES6
// // TODO: muted automatically, investigate should it be ran for JS or not
// // IGNORE_BACKEND: JS, NATIVE
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.*
// import kotlin.reflect.full.*
// import kotlin.test.assertEquals
// 
// tailrec fun foo(bar: String): Int = bar.length
// 
// class A(val c: String) {
//     fun foz(baz: Int) {}
// 
//     fun Double.mext(mez: Long) {}
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun Int.qux(zux: String) {}
// 
// fun checkParameters(f: KFunction<*>, names: List<String?>) {
//     val params = f.parameters
//     assertEquals(names, params.map { it.name })
//     assertEquals(params.indices.toList(), params.map { it.index })
// }
// 
// fun box(): String {
//     checkParameters(::box, listOf())
//     checkParameters(::foo, listOf("bar"))
//     checkParameters(A::foz, listOf(null, "baz"))
//     checkParameters(Int::qux, listOf(null, "zux"))
// 
//     checkParameters(A::class.functions.single { it.name == "mext" }, listOf(null, null, "mez"))
// 
//     checkParameters(::A, listOf("c"))
// 
//     return "OK"
// }
// 

// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

// WITH_REFLECT

import kotlin.reflect.*
import kotlin.reflect.full.*
import kotlin.test.assertEquals

tailrec fun foo(bar: String): Int = bar.length

class A( c: String) {
    val c = cfun foz(baz: Int) {}

    fun Double.mext(mez: Long) {}
override fun toString(): String{
var res = ""
return res
}}

fun Int.qux(zux: String) {}

fun checkParameters(f: KFunction<*>, names: List<String?>) {
    val params = f.parameters
    assertEquals(names, params.map { it.name })
    assertEquals(params.indices.toList(), params.map { it.index })
}

fun box(): String {
    checkParameters(::box, listOf())
    checkParameters(::foo, listOf("bar"))
    checkParameters(A::foz, listOf(null, "baz"))
    checkParameters(Int::qux, listOf(null, "zux"))

    checkParameters(A::class.functions.single { it.name == "mext" }, listOf(null, null, "mez"))

    checkParameters(::A, listOf("c"))

    return "OK"
}

