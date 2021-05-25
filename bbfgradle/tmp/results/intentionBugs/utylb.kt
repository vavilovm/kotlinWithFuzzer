// PSI ERROR. Modified in 34
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // FILE: 1.kt
// 
// private open class InlineString(val res : String) {
// 
//     tailrec inline fun foo(s : () -> String) : String {
//         val f = "fooStart"
//         val z = s()
//         return z
//     }
// 
//     inline infix fun foo11(s : (l: String) -> String) : String {
//         return s("11")
//     }
// 
//     inline fun fooRes(s : (l: String) -> String) : String {
//         val z =  s(res)
//         return z
//     }
// 
//     inline fun fooRes2(s : (l: String, t: String) -> String) : String {
//         val f = "fooRes2Start"
//         val z = s("1", "11")
//         return z
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// // FILE: 2.kt
// 
// fun test0Param(): String {
//     val inlineX = InlineString("10")
//     return inlineX.foo({ -> "1"})
// }
// 
// fun test1Param(): String {
//     val inlineX = InlineString("10")
//     return inlineX.foo11({ z: String -> z})
// }
// 
// tailrec fun test1ParamCaptured(): String {
//     val s = "100"
//     val inlineX = InlineString("10")
//     return inlineX.foo11({ z: String -> s})
// }
// 
// tailrec fun test1ParamMissed() : String {
//     val inlineX = InlineString("10")
//     return inlineX.foo11({ z: String -> "111"})
// }
// 
// fun test1ParamFromCallContext() : String {
//     val inlineX = InlineString("1000")
//     return inlineX.fooRes({ z: String -> z})
// }
// 
// fun test2Params() : String {
//     val inlineX = InlineString("1000")
//     return inlineX.fooRes2({ y: String, z: String -> y + "0" + z})
// }
// 
// tailrec fun test2ParamsWithCaptured() : String {
//     val inlineX = InlineString("1000")
//     val s = "9"
//     var t = "1"
//     return inlineX.fooRes2({ y: String, z: String -> s + t})
// }
// 
// tailrec fun box(): String {
//     if (test0Param() != "1") {
// println("""THEN""");
// return "test0Param: ${test0Param()}"
// }
//     if (test1Param() != "11") {
// println("""THEN""");
// return "test1Param: ${test1Param()}"
// }
//     if (test1ParamCaptured() != "100") {
// println("""THEN""");
// return "test1ParamCaptured: ${test1ParamCaptured()}"
// }
//     if (test1ParamMissed() != "111") {
// println("""THEN""");
// return "test1ParamMissed: ${test1ParamMissed()}"
// }
//     if (test1ParamFromCallContext() != "1000") {
// println("""THEN""");
// return "test1ParamFromCallContext: ${test1ParamFromCallContext()}"
// }
//     if (test2Params() != "1011") {
// println("""THEN""");
// return "test2Params: ${test2Params()}"
// }
//     if (test2ParamsWithCaptured() != "91") {
// println("""THEN""");
// return "test2ParamsWithCaptured: ${test2ParamsWithCaptured()}"
// }
// 
//     return "OK"
// }
// 

// FILE: 1.kt

private open class InlineString {

    val res:Stringconstructor(  res: String) {
this.res = res
}tailrec inline fun foo(s : () -> String) : String {
        val f = "fooStart"
        val z = s()
        return z
    }

    inline infix fun foo11(s : (l: String) -> String) : String {
        return s("11")
    }

    inline fun fooRes(s : (l: String) -> String) : String {
        val z =  s(res)
        return z
    }

    inline fun fooRes2(s : (l: String, t: String) -> String) : String {
        val f = "fooRes2Start"
        val z = s("1", "11")
        return z
    }
override fun toString(): String{
var res = ""
return res
}}

// FILE: 2.kt

fun test0Param(): String {
    val inlineX = InlineString("10")
    return inlineX.foo({ -> "1"})
}

fun test1Param(): String {
    val inlineX = InlineString("10")
    return inlineX.foo11({ z: String -> z})
}

tailrec fun test1ParamCaptured(): String {
    val s = "100"
    val inlineX = InlineString("10")
    return inlineX.foo11({ z: String -> s})
}

tailrec fun test1ParamMissed() : String {
    val inlineX = InlineString("10")
    return inlineX.foo11({ z: String -> "111"})
}

fun test1ParamFromCallContext() : String {
    val inlineX = InlineString("1000")
    return inlineX.fooRes({ z: String -> z})
}

fun test2Params() : String {
    val inlineX = InlineString("1000")
    return inlineX.fooRes2({ y: String, z: String -> y + "0" + z})
}

tailrec fun test2ParamsWithCaptured() : String {
    val inlineX = InlineString("1000")
    val s = "9"
    var t = "1"
    return inlineX.fooRes2({ y: String, z: String -> s + t})
}

tailrec fun box(): String {
    if (test0Param() != "1") {
println("""THEN""");
return "test0Param: ${test0Param()}"
}
    if (test1Param() != "11") {
println("""THEN""");
return "test1Param: ${test1Param()}"
}
    if (test1ParamCaptured() != "100") {
println("""THEN""");
return "test1ParamCaptured: ${test1ParamCaptured()}"
}
    if (test1ParamMissed() != "111") {
println("""THEN""");
return "test1ParamMissed: ${test1ParamMissed()}"
}
    if (test1ParamFromCallContext() != "1000") {
println("""THEN""");
return "test1ParamFromCallContext: ${test1ParamFromCallContext()}"
}
    if (test2Params() != "1011") {
println("""THEN""");
return "test2Params: ${test2Params()}"
}
    if (test2ParamsWithCaptured() != "91") {
println("""THEN""");
return "test2ParamsWithCaptured: ${test2ParamsWithCaptured()}"
}

    return "OK"
}

