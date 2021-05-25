// COMPILE != OK. Modified in 65
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// private var log = ""
// 
// fun logged(value: String) =
//     value.also { log += value }
// 
// object A {
//     public var x = ""
//     var gets = ""
//     var sets = ""
// 
//     operator fun get(vararg va: String): String {
//         for (s in va) {
//             gets += s
//         }
//         log += "get;"
//         return x
//     }
// 
//     operator fun set(vararg va: String, value: String) {
//         for (s in va) {
//             sets += s
//         }
//         log += "set;"
//         x = value
//     }
// }
// 
// operator fun String.inc() = this + logged("inc;")
// 
// fun box(): String {
//     A.x = "start;"
//     val xx = A[logged("1;"), logged("2;"), logged("3;")]++
//     if (xx != "start;") {
// println("""THEN""");
// return "Failed xx: $xx"
// }
//     if (A.x != "start;inc;") {
// println("""THEN""");
// return "Failed A.x: ${A.x}"
// }
//     if (A.gets != "1;2;3;") {
// println("""THEN""");
// return "Failed A.gets: ${A.gets}"
// }
//     if (A.sets != "1;2;3;") {
// println("""THEN""");
// return "Failed A.sets: ${A.sets}"
// }
//     if (log != "1;2;3;get;inc;set;") {
// println("""THEN""");
// return "Failed log: $log"
// }
//     return "OK"
// }
// 

private var log = ""

fun logged(value: String) =
    value.also(fun() {
    log += value
})

object A {
    public var x = ""
    var gets = ""
    var sets = ""

    operator fun get(vararg va: String): String {
        for (s in va) {
            gets += s
        }
        log += "get;"
        return x
    }

    operator fun set(vararg va: String, value: String) {
        for (s in va) {
            sets += s
        }
        log += "set;"
        x = value
    }
}

operator fun String.inc() = this + logged("inc;")

fun box(): String {
    A.x = "start;"
    val xx = A[logged("1;"), logged("2;"), logged("3;")]++
    if (xx != "start;") {
println("""THEN""");
return "Failed xx: $xx"
}
    if (A.x != "start;inc;") {
println("""THEN""");
return "Failed A.x: ${A.x}"
}
    if (A.gets != "1;2;3;") {
println("""THEN""");
return "Failed A.gets: ${A.gets}"
}
    if (A.sets != "1;2;3;") {
println("""THEN""");
return "Failed A.sets: ${A.sets}"
}
    if (log != "1;2;3;get;inc;set;") {
println("""THEN""");
return "Failed log: $log"
}
    return "OK"
}

