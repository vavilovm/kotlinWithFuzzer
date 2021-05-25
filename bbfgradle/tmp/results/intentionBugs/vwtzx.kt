// COMPILE != OK. Modified in 50
// MODIFIED by Replace property initializer with 'when' expression intention:
// ORIGINAL CODE:
//   fun peek() = 1
// 
// tailrec fun box(): String {
//     val x = when ( val x = peek()) {
//         1 -> {
// println("""WHEN 1""");
// "OK"
// }
//         2 -> {
// println("""WHEN 2""");
// "2"
// }
//         else -> {
// println("""WHEN """);
// "other $x"
// }
//     }
//     return x
// }
// 

  fun peek() = 1

tailrec fun box(): String {
    val x:String
 when ( val x = peek()) {
        1 -> {
            println("""WHEN 1""");
            x = "OK"
        }
        2 -> {
            println("""WHEN 2""");
            x = "2"
        }
        else -> {
            println("""WHEN """);
            x = "other $x"
        }
    }
    return x
}

