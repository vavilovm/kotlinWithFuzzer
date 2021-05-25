// EXECUTION FAILED AFTER INTENTION pos 495
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// import kotlin.test.*
// 
// var log: String = ""
// 
// tailrec inline fun <T> runLogged(entry: String, action: () -> T): T {
//     log += entry
//     return action()
// }
// 
// inline operator fun String.provideDelegate(host: Any?, p: Any): String =
//         runLogged("tdf($this);") { this }
// 
// operator fun String.getValue(receiver: Any?, p: Any): String =
//         runLogged("get($this);") { this }
// 
// val testO by runLogged("O;") { "O" }
// val testK by runLogged("K;") { "K" }
// val testOK = runLogged("OK;") { testO + testK }
// 
// fun box(): String {
//     assertEquals("O;tdf(O);K;tdf(K);OK;get(O);get(K);", log)
//     return testOK
// }
// 

// WITH_RUNTIME

import kotlin.test.*

var log: String = ""

tailrec inline fun <T> runLogged(entry: String, action: () -> T): T {
    log += entry
    return action()
}

inline operator fun String.provideDelegate(host: Any?, p: Any): String =
        runLogged("tdf($this);") { this }

operator fun String.getValue(receiver: Any?, p: Any): String =
        runLogged("get($this);") { this }

val testO by runLogged("O;") { "O" }
val testK by runLogged("K;") { "K" }
val testOK by lazy { runLogged("OK;") { testO + testK } }

fun box(): String {
    assertEquals("O;tdf(O);K;tdf(K);OK;get(O);get(K);", log)
    return testOK
}

