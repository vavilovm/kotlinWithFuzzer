// COMPILE != OK. Modified in 206
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // WITH_REFLECT
// 
// import kotlin.test.assertEquals
// 
// tailrec fun foo() {}
// 
// class A {
//     fun bar() = ""
// }
// 
// fun Int.baz() = this
// 
// fun box(): String {
//     assertEquals("foo", ::foo.name)
//     assertEquals("bar", A::bar.name)
//     assertEquals("baz", Int::baz.name)
//     return "OK"
// }
// 

// WITH_REFLECT

import kotlin.test.assertEquals

tailrec fun foo() {}

class A {
    fun bar() = ""
}

fun Int.baz() = this

fun box(): String {
    assertEquals("foo", ::foo.name)
    assertEquals("bar", { a: A -> a.bar() }.name)
    assertEquals("baz", Int::baz.name)
    return "OK"
}

