// COMPILE != OK. Modified in 222
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // WITH_REFLECT
// 
// import kotlin.test.assertEquals
// 
// tailrec fun foo() {}
// 
// class A {
//     tailrec fun bar() = ""
// }
// 
// tailrec fun Int.baz() = this
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
    tailrec fun bar() = ""
}

tailrec fun Int.baz() = this

fun box(): String {
    assertEquals("foo", ::foo.name)
    assertEquals("bar", { a: A -> a.bar() }.name)
    assertEquals("baz", Int::baz.name)
    return "OK"
}

