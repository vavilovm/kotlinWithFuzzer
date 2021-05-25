// COMPILE != OK. Modified in 508
// MODIFIED by Introduce local variable intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS_IR
// // IGNORE_BACKEND: JS_IR_ES6
// // TODO: muted automatically, investigate should it be ran for JS or not
// // IGNORE_BACKEND: JS, NATIVE
// 
// // WITH_REFLECT
// 
// import kotlin.test.assertTrue
// import kotlin.test.assertFalse
// 
// private class A {
//     fun <T> nonReified(): T = null!!
//     inline fun <reified U> reified(): U = null!!
// }
// 
// fun box(): String {
//     assertFalse(A::class.members.single { it.name == "nonReified" }.typeParameters.single().isReified)
//     assertTrue(A::class.members.single { it.name == "reified" }.typeParameters.single().isReified)
//     return "OK"
// }
// 

// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

// WITH_REFLECT

import kotlin.test.assertTrue
import kotlin.test.assertFalse

private class A {
    fun <T> nonReified(): T = null!!
    inline fun <reified U> reified(): U = null!!
}

fun box(): String {
    assertFalse(A::class.members.single { it.name == "nonReified" }.typeParameters.single().isReified)
    val b = it.name == "reified"
 assertTrue(A::class.members.single { b }.typeParameters.single().isReified)
    return "OK"
}

