// COMPILE != OK. Modified in 36
// MODIFIED by Convert property to function intention:
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

internal const fun getM() = Int.MAX_VALUE

fun box(): String {
    var step = 0
    for (i in (getM() .. getM()).reversed()) {
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
