// EXECUTION FAILED AFTER INTENTION pos 153
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
//     for (i in (logged("start;", 9) downTo logged("end;", 0) step logged("step2;", 2)).reversed() step logged("step3;", 3)) {
//         sum = sum * 10 + i
//     }
// 
//     assertEquals(147, sum)
// 
//     assertEquals("start;end;step2;step3;", log.toString())
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
    for (i in (logged("start;", 9) downTo logged("end;", 0) step logged("step2;", 2)).reversed() step logged("step3;", 3)) {
        sum = sum * 10 + i
    }

    assertEquals(147, sum)

    assertEquals("start;end;step2;step3;", getLog().toString())

    return "OK"
}
