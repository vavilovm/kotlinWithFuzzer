// COMPILE != OK. Modified in 55
// MODIFIED by Convert receiver to parameter intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// object ExtProvider {
//     operator fun Long.get(i: Int) = this
//     tailrec operator fun Long.set(i: Int, newValue: Long) {}
// }
// 
// fun box(): String {
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
    operator fun get(l: Long, i: Int) = l
    tailrec operator fun Long.set(i: Int, newValue: Long) {}
}

fun box(): String {
    with (ExtProvider) {
        var x = 0L
        val y = get(x,0)++
        return if (y == 0L) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Failed, y=$y"
}
    }
}

