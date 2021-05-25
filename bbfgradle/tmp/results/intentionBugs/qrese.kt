// PSI ERROR. Modified in 191
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// import kotlin.coroutines.*
// 
// fun builder(c: suspend () -> Unit) {
//     c.startCoroutine(Continuation(EmptyCoroutineContext) {
//         it.getOrThrow()
//     })
// }
// 
// inline class IC(val s: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// tailrec fun box(): String {
//     var res = "FAIL"
//     val lambda: suspend (IC, IC) -> String = { a, b ->
//         a.s + b.s
//     }
//     builder {
//         res = lambda(IC("O"), IC("K"))
//     }
//     return res
// }

// WITH_RUNTIME

import kotlin.coroutines.*

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(Continuation(EmptyCoroutineContext) {
        it.getOrThrow()
    })
}

inline class IC( s: String){
val s = soverride fun toString(): String{
var res = ""
return res
}
}

tailrec fun box(): String {
    var res = "FAIL"
    val lambda: suspend (IC, IC) -> String = { a, b ->
        a.s + b.s
    }
    builder {
        res = lambda(IC("O"), IC("K"))
    }
    return res
}
