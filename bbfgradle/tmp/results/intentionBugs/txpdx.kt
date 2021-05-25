// COMPILE != OK. Modified in 405
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // !LANGUAGE: +MultiPlatformProjects
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// // IGNORE_BACKEND_FIR: JVM_IR
// 
// import kotlin.coroutines.*
// 
// private var res = 0L
// 
// expect  suspend fun withLimit(limit: Long = 42L)
// 
// actual suspend fun withLimit(limit: Long) {
//     res = limit
// }
// 
// fun builder(c: suspend () -> Unit) {
//     c.startCoroutine(Continuation(EmptyCoroutineContext) {})
// }
// 
// fun box(): String {
//     builder {
//         withLimit()
//     }
//     return if (res == 42L) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "FAIL $res"
// }
// }
// 

// !LANGUAGE: +MultiPlatformProjects
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR

import kotlin.coroutines.*

private var res = 0L

expect  suspend fun withLimit(limit: Long = 42L)

actual suspend fun withLimit(limit: Long) {
    res = limit
}

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(Continuation(EmptyCoroutineContext) {})
}

fun box(): String {
    builder(fun() {
    withLimit()
})
    return if (res == 42L) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"FAIL $res"
}
}

