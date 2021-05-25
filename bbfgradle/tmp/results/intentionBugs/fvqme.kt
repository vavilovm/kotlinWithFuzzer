// COMPILE != OK. Modified in 0
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// internal const val M = Int.MAX_VALUE
// 
// fun box(): String {
//     var step = 0
//     for (i in M .. M) {
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

internal const val M by lazy { Int.MAX_VALUE }

fun box(): String {
    var step = 0
    for (i in M .. M) {
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
