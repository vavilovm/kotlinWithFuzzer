// COMPILE != OK. Modified in 42
// MODIFIED by Convert to block body intention:
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
    operator fun Long.get(i: Int): Long {
        return this
    }
    operator fun set(l: kotlin.Long, i: kotlin.Int, newValue: kotlin.Long) {}
}

tailrec fun box(): String {
    with (ExtProvider) {
        var x = 0L
        val y = x.get(0)++
        return if (y == 0L) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Failed, y=$y"
}
    }
}

