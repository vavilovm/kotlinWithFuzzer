// COMPILE != OK. Modified in 44
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// private var result = ""
// 
// object A {
//     val prop = test()
// 
//     fun test(): String {
//         result += "OK"
//         return result
//     }
// }
// 
// fun box(): String {
//     if (A.prop != "OK") {
// println("""THEN""");
// return "fail ${A.prop}"
// }
//     return result
// }

private var result = ""

object A {
    fun getProp() = test()

    fun test(): String {
        result += "OK"
        return result
    }
}

fun box(): String {
    if (A.prop != "OK") {
println("""THEN""");
return "fail ${A.prop}"
}
    return result
}
