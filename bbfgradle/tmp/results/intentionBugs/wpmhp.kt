// COMPILE != OK. Modified in 79
// MODIFIED by Replace with a 'forEach' function call intention:
// ORIGINAL CODE:
// // !LANGUAGE: +ProperFinally
// private var result = ""
// 
// tailrec fun test() {
//     for (z in 1..2) {
//         try{
// println("""TRY""");
// 
//             try {
//                 result += "try"
//                 break
//             } catch (fail: Throwable) {
//                 result += " catch"
//             }
// } finally{
// println("""FINALLY""");
// 
//             result += " finally"
//             throw RuntimeException()
// }
//     }
// }
// 
// fun box(): String {
//     try{
// println("""TRY""");
// 
//         test()
//         return "fail: expected exception"
// } catch (e: RuntimeException){
// println("""CATCH e: RuntimeException""");
// 
// }
// 
//     return if (result == "try finally") {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail: $result"
// }
// }

// !LANGUAGE: +ProperFinally
private var result = ""

tailrec fun test() {
    (1..2).forEach { z ->
        try{
            println("""TRY""");

            try {
                result += "try"
                break
            } catch (fail: Throwable) {
                result += " catch"
            }
        } finally{
            println("""FINALLY""");

            result += " finally"
            throw RuntimeException()
        }
    }
}

fun box(): String {
    try{
println("""TRY""");

        test()
        return "fail: expected exception"
} catch (e: RuntimeException){
println("""CATCH e: RuntimeException""");

}

    return if (result == "try finally") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $result"
}
}
