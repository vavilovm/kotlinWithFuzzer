// COMPILE != OK. Modified in 117
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_COLLECTIONS
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// 
// const val xs = "abcd"
// 
// fun box(): String {
//     var count = 0
// 
//     for ((_, _) in xs.withIndex()) {
//         count++
//     }
// 
//     return if (count == 4) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail: '$count'"
// }
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_COLLECTIONS
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

const val xs by lazy { "abcd" }

fun box(): String {
    var count = 0

    for ((_, _) in xs.withIndex()) {
        count++
    }

    return if (count == 4) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: '$count'"
}
}
