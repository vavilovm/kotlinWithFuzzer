// COMPILE != OK. Modified in 107
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// // KT-4423 Enum with function not compiled
// 
// private enum class Sign(val str: String, val func: (x: Int, y: Int) -> Int){
//     plus("+", { x, y -> x + y }),
// 
//     mult("*", { x, y -> x * y }) {
//         override fun toString() = "${func(4,5)}"
//     }
// }
// 
// fun box(): String {
//     val sum = Sign.plus.func(2, 3)
//     if (sum != 5) {
// println("""THEN""");
// return "Fail 1: $sum"
// }
// 
//     val product = Sign.mult.toString()
//     if (product != "20") {
// println("""THEN""");
// return "Fail 2: $product"
// }
// 
//     return "OK"
// }
// 

// KT-4423 Enum with function not compiled

private enum class Sign(val str: String, val func: Int.(x: Int ) -> Int){
    plus("+", { x, y -> x + y }),

    mult("*", { x, y -> x * y }) {
        override fun toString() = "${func(4,5)}"
    }
}

fun box(): String {
    val sum = Sign.plus.func(2, 3)
    if (sum != 5) {
println("""THEN""");
return "Fail 1: $sum"
}

    val product = Sign.mult.toString()
    if (product != "20") {
println("""THEN""");
return "Fail 2: $product"
}

    return "OK"
}

