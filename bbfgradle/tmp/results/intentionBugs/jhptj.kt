// EXECUTION FAILED AFTER INTENTION pos 386
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS_IR, JS, NATIVE
// // IGNORE_BACKEND: JS_IR_ES6
// // WITH_REFLECT
// 
// package test
// 
// import kotlin.test.assertEquals
// 
// enum class E { X, Y, Z }
// 
// tailrec fun box(): String {
//     assertEquals("fun values(): kotlin.Array<test.E>", E::values.toString())
//     assertEquals(listOf(E.X, E.Y, E.Z), E::values.call().toList())
//     assertEquals("fun valueOf(kotlin.String): test.E", E::valueOf.toString())
//     assertEquals(E.Y, E::valueOf.call("Y"))
// 
//     return "OK"
// }
// 

// IGNORE_BACKEND: JS_IR, JS, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// WITH_REFLECT

package test

import kotlin.test.assertEquals

enum class E { X, Y, Z }

tailrec fun box(): String {
    assertEquals("fun values(): kotlin.Array<test.E>", E::values.toString())
    assertEquals(listOf(E.X, E.Y, E.Z), E::values.call().toList())
    assertEquals("fun valueOf(kotlin.String): test.E", { value: String -> E.valueOf(value) }.toString())
    assertEquals(E.Y, E::valueOf.call("Y"))

    return "OK"
}

