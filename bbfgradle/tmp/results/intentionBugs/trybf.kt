// COMPILE != OK. Modified in 145
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS, NATIVE
// 
// // WITH_REFLECT
// 
// import kotlin.test.assertEquals
// 
// class A
// 
// tailrec fun box(): String {
//     assertEquals("<init>", ::A.name)
//     return "OK"
// }
// 

// IGNORE_BACKEND: JS, NATIVE

// WITH_REFLECT

import kotlin.test.assertEquals

class A

tailrec fun box(): String {
    assertEquals("<init>", { A() }.name)
    return "OK"
}

