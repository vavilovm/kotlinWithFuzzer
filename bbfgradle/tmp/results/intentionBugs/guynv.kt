// EXECUTION FAILED AFTER INTENTION pos 156
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// import kotlin.test.*
// 
// private val log = StringBuilder()
// 
// fun logged(message: String, value: Int) =
//     value.also { log.append(message) }
// 
// fun box(): String {
//     var sum = 0
//     for (i in logged("start;", 1) until logged("end;", 5)) {
//         sum = sum * 10 + i
//     }
// 
//     assertEquals(1234, sum)
// 
//     assertEquals("start;end;", log.toString())
// 
//     return "OK"
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

private fun getLog() = StringBuilder()

fun logged(message: String, value: Int) =
    value.also { getLog().append(message) }

fun box(): String {
    var sum = 0
    for (i in logged("start;", 1) until logged("end;", 5)) {
        sum = sum * 10 + i
    }

    assertEquals(1234, sum)

    assertEquals("start;end;", getLog().toString())

    return "OK"
}
