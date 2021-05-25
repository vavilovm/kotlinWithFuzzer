// COMPILE != OK. Modified in 168
// MODIFIED by Convert lambda expression to anonymous function intention:
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

tailrec inline fun foo(x: String, block: (String) -> String) = block(x)

fun box(): String {
    val res = foo("abc",fun(): String {
    fun bar(y: String) = y + "cde"
    return bar(it)
})

    assertEquals("abccde", res)

    return "OK"
}

