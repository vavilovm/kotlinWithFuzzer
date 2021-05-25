// COMPILE != OK. Modified in 214
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // WITH_REFLECT
// 
// import kotlin.test.assertEquals
// 
// fun foo() {}
// 
// class A {
//     fun bar() = ""
// }
// 
// tailrec fun Int.baz() = this
// 
// tailrec fun box(): String {
//     assertEquals("foo", ::foo.name)
//     assertEquals("bar", A::bar.name)
//     assertEquals("baz", Int::baz.name)
//     return "OK"
// }
// 

// WITH_REFLECT

import kotlin.test.assertEquals

fun foo() {}

class A {
    fun bar() = ""
}

tailrec fun Int.baz() = this

tailrec fun box(): String {
    assertEquals("foo", ::foo.name)
    assertEquals("bar", { a: A -> a.bar() }.name)
    assertEquals("baz", Int::baz.name)
    return "OK"
}

