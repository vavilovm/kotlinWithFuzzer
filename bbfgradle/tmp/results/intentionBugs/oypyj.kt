// EXECUTION DIFFERENT. Modified in 480.
// Original:
// TRY
// FINALLY
// OK
// 
// new:
// TRY
// FINALLY
// TRY
// FINALLY
// fail
// 
// MODIFIED by Add labeled return to last expression in a lambda intention:
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
    test {
        try{
println("""TRY""");

            p = 1
            return "OK" //finally from inline fun doen't split this try
} catch(e: Exception){
println("""CATCH e: Exception""");

            p = -1;
            p
} finally{
println("""FINALLY""");

            return@test p++
}

    }
    return "fail"
}

// 8 TRYCATCHBLOCK
