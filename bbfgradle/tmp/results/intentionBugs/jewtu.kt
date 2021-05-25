// COMPILE != OK. Modified in 213
// MODIFIED by Replace with a 'forEach' function call intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// 
// internal val cs: CharSequence = "abcd"
// 
// fun box(): String {
//     val s = StringBuilder()
// 
//     for ((index, x) in cs.withIndex()) {
//         if (index == 0) {
// println("""THEN""");
// continue
// }
//         if (index == 3) {
// println("""THEN""");
// break
// }
//         s.append("$index:$x;")
//     }
// 
//     val ss = s.toString()
//     return if (ss == "1:b;2:c;") {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail: '$ss'"
// }
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

internal val cs: CharSequence = "abcd"

fun box(): String {
    val s = StringBuilder()

    cs.withIndex().forEach { (index, x) ->
        if (index == 0) {
            println("""THEN""");
            return@forEach
        }
        if (index == 3) {
            println("""THEN""");
            break
        }
        s.append("$index:$x;")
    }

    val ss = s.toString()
    return if (ss == "1:b;2:c;") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: '$ss'"
}
}
