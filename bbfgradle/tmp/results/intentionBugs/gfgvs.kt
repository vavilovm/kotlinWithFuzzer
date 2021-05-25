// COMPILE != OK. Modified in 488
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// // IGNORE_BACKEND: NATIVE
// // WITH_RUNTIME
// // KJS_WITH_FULL_RUNTIME
// 
// import kotlin.contracts.*
// 
// fun runOnce(action: () -> Unit) {
//     contract {
//         callsInPlace(action, InvocationKind.EXACTLY_ONCE)
//     }
//     action()
// }
// 
// tailrec fun o(): String {
//     var res = "FAIL1 "
//     ("O" to "").let { (a, _) ->
//         runOnce {
//             res = a
//         }
//     }
//     return res
// }
// 
// fun k(): String {
//     val res: String
//     "K".let { b ->
//         runOnce {
//             res = b
//         }
//     }
//     return res
// }
// 
// fun box(): String {
//     return o() + k()
// }
// 

// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// IGNORE_BACKEND: NATIVE
// WITH_RUNTIME
// KJS_WITH_FULL_RUNTIME

import kotlin.contracts.*

fun runOnce(action: () -> Unit) {
    contract {
        callsInPlace(action, InvocationKind.EXACTLY_ONCE)
    }
    action()
}

tailrec fun o(): String {
    var res = "FAIL1 "
    ("O" to "").let { (a, _) ->
        runOnce {
            res = a
        }
    }
    return res
}

fun k(): String {
    val res: String
    "K".let(fun(b: String) {
    runOnce {
        res = b
    }
})
    return res
}

fun box(): String {
    return o() + k()
}

