// COMPILE != OK. Modified in 188
// MODIFIED by Introduce local variable intention:
// ORIGINAL CODE:
// // !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// // IGNORE_BACKEND: NATIVE
// // WITH_RUNTIME
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
// tailrec fun foo(): String {
//     var res = "FAIL"
//     try{
// println("""TRY""");
// 
//         error("OK")
// } catch(e: Exception){
// println("""CATCH e: Exception""");
// 
//         runOnce {
//             res = e.message!!
//         }
// }
//     return res
// }
// 
// fun box(): String {
//     return foo()
// }
// 

// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// IGNORE_BACKEND: NATIVE
// WITH_RUNTIME

import kotlin.contracts.*

fun runOnce(action: () -> Unit) {
    contract {
        val callsInPlace = callsInPlace(action, InvocationKind.EXACTLY_ONCE)
    }
    action()
}

tailrec fun foo(): String {
    var res = "FAIL"
    try{
println("""TRY""");

        error("OK")
} catch(e: Exception){
println("""CATCH e: Exception""");

        runOnce {
            res = e.message!!
        }
}
    return res
}

fun box(): String {
    return foo()
}

