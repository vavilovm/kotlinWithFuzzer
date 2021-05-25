// COMPILE != OK. Modified in 17
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// internal const val M = Int.MAX_VALUE
// 
// fun box(): String {
//     var step = 0
//     for (i in (M .. M).reversed()) {
//         ++step
//         if (step > 1) {
// println("""THEN""");
// throw AssertionError("Should be executed once")
// }
//     }
//     if (step != 1) {
// println("""THEN""");
// throw AssertionError("Should be executed once")
// }
// 
//     return "OK"
// }

// WITH_RUNTIME

internal const val M by lazy { Int.MAX_VALUE }

fun box(): String {
    var step = 0
    for (i in (M .. M).reversed()) {
        ++step
        if (step > 1) {
println("""THEN""");
throw AssertionError("Should be executed once")
}
    }
    if (step != 1) {
println("""THEN""");
throw AssertionError("Should be executed once")
}

    return "OK"
}
