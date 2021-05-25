// COMPILE != OK. Modified in 51
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// private var result = ""
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
// tailrec fun box(): String {
//     if (A.prop != "OK") {
// println("""THEN""");
// return "fail ${A.prop}"
// }
//     return result
// }

private var result = ""

object A {
    public fun getProp() = test()

    fun test(): String {
        result += "OK"
        return result
    }
}

tailrec fun box(): String {
    if (A.prop != "OK") {
println("""THEN""");
return "fail ${A.prop}"
}
    return result
}
