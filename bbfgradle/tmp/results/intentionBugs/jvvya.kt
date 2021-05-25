// COMPILE != OK. Modified in 44
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
//  var result = ""
// 
// object A {
//     public val prop = test()
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

 var result = ""

object A {
    public fun getProp() = test()

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
