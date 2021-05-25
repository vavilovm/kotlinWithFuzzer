// COMPILE != OK. Modified in 84
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// import kotlin.test.assertEquals
// 
// inline fun foo(x: String, block: (String) -> String) = block(x)
// 
// tailrec fun box(): String {
//     val res = foo("abc") {
//         fun bar(y: String) = y + "cde"
//         bar(it)
//     }
// 
//     assertEquals("abccde", res)
// 
//     return "OK"
// }
// 

// WITH_RUNTIME

import kotlin.test.assertEquals

inline fun foo(x: String, block: String.() -> String) = x.block()

tailrec fun box(): String {
    val res = foo("abc") {
        fun bar(y: String) = y + "cde"
        bar(it)
    }

    assertEquals("abccde", res)

    return "OK"
}

