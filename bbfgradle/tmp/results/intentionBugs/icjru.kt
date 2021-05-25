// COMPILE != OK. Modified in 556
// MODIFIED by Convert lambda expression to anonymous function intention:
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
// inline class IC(val s: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// internal var c: Continuation<Any>? = null
// 
// var res = "FAIL"
// 
// fun box(): String {
//     val lambda: suspend (IC, IC) -> String = { _, _ ->
//         suspendCoroutine<String> {
//             @Suppress("UNCHECKED_CAST")
//             c = it as Continuation<Any>
//         }
//     }
//     builder {
//         res = lambda(IC("_"), IC("_"))
//     }
//     c?.resume("OK")
//     return res
// }

// WITH_RUNTIME

import kotlin.coroutines.*

tailrec fun builder(c: suspend () -> Unit) {
    c.startCoroutine(Continuation(EmptyCoroutineContext) {
        it.getOrThrow()
    })
}

inline class IC(val s: String){
override fun toString(): String{
var res = ""
return res
}
}

internal var c: Continuation<Any>? = null

var res = "FAIL"

fun box(): String {
    val lambda: suspend (IC, IC) -> String = { _, _ ->
        suspendCoroutine<String> {
            @Suppress("UNCHECKED_CAST")
            c = it as Continuation<Any>
        }
    }
    builder(fun() {
    res = lambda(IC("_"), IC("_"))
})
    c?.resume("OK")
    return res
}
