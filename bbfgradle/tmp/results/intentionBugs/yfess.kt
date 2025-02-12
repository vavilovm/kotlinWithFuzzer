// COMPILE != OK. Modified in 399
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// // DONT_TARGET_EXACT_BACKEND: WASM
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// import kotlin.test.*
// 
// tailrec fun box(): String {
//     assertFailsWith<IllegalArgumentException> {
//         val intProgression = 7 downTo 1
//         for (i in intProgression step 2 step 0) {
//         }
//     }
// 
//     assertFailsWith<IllegalArgumentException> {
//         val longProgression = 7L downTo 1L
//         for (i in longProgression step 2L step 0L) {
//         }
//     }
// 
//     assertFailsWith<IllegalArgumentException> {
//         val charProgression = 'g' downTo 'a'
//         for (i in charProgression step 2 step 0) {
//         }
//     }
// 
//     return "OK"
// }

// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

tailrec fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        val intProgression = 7 downTo 1
        for (i in intProgression step 2 step 0) {
        }
    }

    assertFailsWith<IllegalArgumentException>(fun() {
    val longProgression = 7L downTo 1L
    for (i in longProgression step 2L step 0L) {
    }
})

    assertFailsWith<IllegalArgumentException> {
        val charProgression = 'g' downTo 'a'
        for (i in charProgression step 2 step 0) {
        }
    }

    return "OK"
}
