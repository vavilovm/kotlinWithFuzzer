// COMPILE != OK. Modified in 92
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// import kotlin.test.assertEquals
// 
// tailrec inline fun foo(x: String, block: (String) -> String) = block(x)
// 
// fun box(): String {
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

tailrec inline fun foo(x: String, block: String.() -> String) = x.block()

fun box(): String {
    val res = foo("abc") {
        fun bar(y: String) = y + "cde"
        bar(it)
    }

    assertEquals("abccde", res)

    return "OK"
}

