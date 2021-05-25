// PSI ERROR. Modified in 369
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// import kotlin.coroutines.*
// 
// tailrec fun builder(c: suspend () -> Unit) {
//     c.startCoroutine(Continuation(EmptyCoroutineContext) {
//         it.getOrThrow()
//     })
// }
// 
// public inline class IC(val a: Any?){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// class GetResult {
//     tailrec suspend operator fun invoke() = IC("OK")
// }
// 
// inline class IC1(val a: String) {
//     tailrec suspend operator fun invoke() = IC(a)
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     var res = "FAIL 1"
//     builder {
//         val getResult = GetResult()
//         res = getResult().a as String
//     }
//     if (res != "OK") {
// println("""THEN""");
// return "FAIL 1 $res"
// }
// 
//     res = "FAIL 2"
//     builder {
//         val getResult = GetResult()
//         res = getResult.invoke().a as String
//     }
//     if (res != "OK") {
// println("""THEN""");
// return "FAIL 2 $res"
// }
// 
//     res = "FAIL 3"
//     builder {
//         res = GetResult()().a as String
//     }
//     if (res != "OK") {
// println("""THEN""");
// return "FAIL 3 $res"
// }
// 
//     res = "FAIL 4"
//     builder {
//         val getResult = IC1("OK")
//         res = getResult().a as String
//     }
//     if (res != "OK") {
// println("""THEN""");
// return "FAIL 4 $res"
// }
// 
//     res = "FAIL 5"
//     builder {
//         val getResult = IC1("OK")
//         res = getResult.invoke().a as String
//     }
//     if (res != "OK") {
// println("""THEN""");
// return "FAIL 5 $res"
// }
// 
//     res = "FAIL 6"
//     builder {
//         res = IC1("OK")().a as String
//     }
//     if (res != "OK") {
// println("""THEN""");
// return "FAIL 6 $res"
// }
//     return res
// }
// 

// WITH_RUNTIME

import kotlin.coroutines.*

tailrec fun builder(c: suspend () -> Unit) {
    c.startCoroutine(Continuation(EmptyCoroutineContext) {
        it.getOrThrow()
    })
}

public inline class IC(val a: Any?){
override fun toString(): String{
var res = ""
return res
}
}

class GetResult {
    tailrec suspend operator fun invoke() = IC("OK")
}

inline class IC1 {
    val a:Stringconstructor(  a: String) {
this.a = a
}tailrec suspend operator fun invoke() = IC(a)
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    var res = "FAIL 1"
    builder {
        val getResult = GetResult()
        res = getResult().a as String
    }
    if (res != "OK") {
println("""THEN""");
return "FAIL 1 $res"
}

    res = "FAIL 2"
    builder {
        val getResult = GetResult()
        res = getResult.invoke().a as String
    }
    if (res != "OK") {
println("""THEN""");
return "FAIL 2 $res"
}

    res = "FAIL 3"
    builder {
        res = GetResult()().a as String
    }
    if (res != "OK") {
println("""THEN""");
return "FAIL 3 $res"
}

    res = "FAIL 4"
    builder {
        val getResult = IC1("OK")
        res = getResult().a as String
    }
    if (res != "OK") {
println("""THEN""");
return "FAIL 4 $res"
}

    res = "FAIL 5"
    builder {
        val getResult = IC1("OK")
        res = getResult.invoke().a as String
    }
    if (res != "OK") {
println("""THEN""");
return "FAIL 5 $res"
}

    res = "FAIL 6"
    builder {
        res = IC1("OK")().a as String
    }
    if (res != "OK") {
println("""THEN""");
return "FAIL 6 $res"
}
    return res
}

