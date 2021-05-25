// COMPILE != OK. Modified in 17
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// const val M = Char.MIN_VALUE
// 
// fun box(): String {
//     var count = 0
//     for (i in M downTo M) {
//         ++count
//         if (count > 1){
// println("""THEN""");
// 
//             throw AssertionError("Loop should be executed once")
// }
//     }
//     if (count != 1) {
// println("""THEN""");
// throw AssertionError("Should be executed once")
// }
//     return "OK"
// }

// WITH_RUNTIME

const val M by lazy { Char.MIN_VALUE }

fun box(): String {
    var count = 0
    for (i in M downTo M) {
        ++count
        if (count > 1){
println("""THEN""");

            throw AssertionError("Loop should be executed once")
}
    }
    if (count != 1) {
println("""THEN""");
throw AssertionError("Should be executed once")
}
    return "OK"
}
