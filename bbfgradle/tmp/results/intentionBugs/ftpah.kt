// COMPILE != OK. Modified in 186
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// object ExtProvider {
//     operator fun Long.get(i: Int) = this
//     operator fun Long.set(i: Int, newValue: Long) {}
// }
// 
// tailrec fun box(): String {
//     with (ExtProvider) {
//         var x = 0L
//         val y = x[0]++
//         return if (y == 0L) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "Failed, y=$y"
// }
//     }
// }
// 

// WITH_RUNTIME

object ExtProvider {
    operator fun Long.get(i: Int) = this
    operator fun Long.set(i: Int, newValue: Long) {}
}

tailrec fun box(): String {
    with (ExtProvider,fun ExtProvider.(): Nothing {
    var x = 0L
    val y = x[0]++
    return if (y == 0L) {
        println("""THEN""");
        "OK"
    } else {
        println("""ELSE""");
        "Failed, y=$y"
    }
})
}

