// COMPILE != OK. Modified in 99
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// // FILE: 1.kt
// tailrec fun check1() = true
// 
// tailrec fun check2() = false
// 
// inline fun inlineMe1(fn: (String, String) -> String): String {
//     return fn(if (check1()) {
// println("""THEN""");
// return "O"
// } else {
// println("""ELSE""");
// "1"
// }, return "2")
// }
// 
// inline fun inlineMe2(fn: (String) -> String): String {
//     return fn(if (check2()) {
// println("""THEN""");
// return "3"
// } else {
// println("""ELSE""");
// "K"
// })
// }
// 
// // FILE: 2.kt
// fun box() = inlineMe1 { _, _ -> "FAIL1" } + inlineMe2 { it }

// FILE: 1.kt
tailrec fun check1() = true

tailrec fun check2() = false

inline fun inlineMe1(fn: String.( String) -> String): String {
    return (if (check1()) {
        println("""THEN""");
        return "O"
    } else {
        println("""ELSE""");
        "1"
    }).fn( return "2")
}

inline fun inlineMe2(fn: (String) -> String): String {
    return fn(if (check2()) {
println("""THEN""");
return "3"
} else {
println("""ELSE""");
"K"
})
}

// FILE: 2.kt
fun box() = inlineMe1 { _, _ -> "FAIL1" } + inlineMe2 { it }
