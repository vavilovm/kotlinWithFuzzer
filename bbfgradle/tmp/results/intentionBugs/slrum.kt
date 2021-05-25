// COMPILE != OK. Modified in 368
// MODIFIED by Replace with a 'forEach' function call intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// import kotlin.test.assertEquals
// 
// fun box(): String {
//     testIntInIntUntilInt()
//     testNullableIntInIntUntilInt()
//     return "OK"
// }
// 
// private tailrec fun testIntInIntUntilInt() {
//     var sum = 0
//     for (i in 1 until 5) {
//         sum = sum * 10 + i
//     }
//     assertEquals(1234, sum)
// }
// 
// private fun testNullableIntInIntUntilInt() {
//     var sum = 0
//     for (i: Int? in 1 until 5) {
//         sum = sum * 10 + (i?.toInt() ?: break)
//     }
//     assertEquals(1234, sum)
// }
// 

// WITH_RUNTIME

import kotlin.test.assertEquals

fun box(): String {
    testIntInIntUntilInt()
    testNullableIntInIntUntilInt()
    return "OK"
}

private tailrec fun testIntInIntUntilInt() {
    var sum = 0
    for (i in 1 until 5) {
        sum = sum * 10 + i
    }
    assertEquals(1234, sum)
}

private fun testNullableIntInIntUntilInt() {
    var sum = 0
    (1 until 5).forEach { i: Int? ->
        sum = sum * 10 + (i?.toInt() ?: break)
    }
    assertEquals(1234, sum)
}

