// EXECUTION FAILED AFTER INTENTION pos 145
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// import kotlin.test.*
// 
// val log = StringBuilder()
// 
// tailrec fun logged(message: String, value: Int) =
//     value.also { log.append(message) }
// 
// fun box(): String {
//     var sum = 0
//     for (i in (logged("start;", 1)..logged("end;", 8)).reversed() step logged("step;", 2)) {
//         sum = sum * 10 + i
//     }
// 
//     assertEquals(8642, sum)
// 
//     assertEquals("start;end;step;", log.toString())
// 
//     return "OK"
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun getLog() = StringBuilder()

tailrec fun logged(message: String, value: Int) =
    value.also { getLog().append(message) }

fun box(): String {
    var sum = 0
    for (i in (logged("start;", 1)..logged("end;", 8)).reversed() step logged("step;", 2)) {
        sum = sum * 10 + i
    }

    assertEquals(8642, sum)

    assertEquals("start;end;step;", getLog().toString())

    return "OK"
}
