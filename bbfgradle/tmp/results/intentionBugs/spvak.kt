// COMPILE != OK. Modified in 213
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// tailrec inline fun test(s: ()->Int){
//     var i = 0;
//     i = s()
//     try{
// println("""TRY""");
// 
//         i = i + 10
// } finally{
// println("""FINALLY""");
// 
//         i
// }
// }
// 
// fun box() : String {
//     var p: Int = 1
//     test {
//         try{
// println("""TRY""");
// 
//             p = 1
//             return "OK" //finally from inline fun doen't split this try
// } catch(e: Exception){
// println("""CATCH e: Exception""");
// 
//             p = -1;
//             p
// } finally{
// println("""FINALLY""");
// 
//             p++
// }
// 
//     }
//     return "fail"
// }
// 
// // 8 TRYCATCHBLOCK

tailrec inline fun test(s: ()->Int){
    var i = 0;
    i = s()
    try{
println("""TRY""");

        i = i + 10
} finally{
println("""FINALLY""");

        i
}
}

fun box() : String {
    var p: Int = 1
    test(fun(): Int {
    return try {
        println("""TRY""");

        p = 1
        return "OK" //finally from inline fun doen't split this try
    } catch (e: Exception) {
        println("""CATCH e: Exception""");

        p = -1;
        p
    } finally {
        println("""FINALLY""");

        p++
    }
})
    return "fail"
}

// 8 TRYCATCHBLOCK
