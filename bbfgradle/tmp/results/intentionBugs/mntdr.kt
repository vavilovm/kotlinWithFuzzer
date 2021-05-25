// COMPILE != OK. Modified in 19
// MODIFIED by Convert property to function intention:
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

internal const fun getM() = Int.MAX_VALUE

fun box(): String {
    var step = 0
    for (i in getM() .. getM()) {
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
