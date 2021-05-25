// COMPILE != OK. Modified in 186
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// // IGNORE_BACKEND: NATIVE
// // WITH_RUNTIME
// 
// import kotlin.contracts.*
// 
// tailrec fun runOnce(action: () -> Unit) {
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

tailrec fun runOnce(action: () -> Unit) {
    contract(fun ContractBuilder.() {
    callsInPlace(action, InvocationKind.EXACTLY_ONCE)
})
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

