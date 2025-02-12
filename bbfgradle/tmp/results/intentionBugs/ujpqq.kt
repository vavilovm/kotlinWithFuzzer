// COMPILE != OK. Modified in 408
// MODIFIED by Convert receiver to parameter intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// import kotlin.test.*
// 
// var log: String = ""
// 
// open class MyClass(val value: String) {
//     override fun toString(): String {
//         return value
//     }
// }
// 
// inline fun <L> runLogged(entry: String, action: () -> L): L {
//     log += entry
//     return action()
// }
// 
// operator fun <P: MyClass> P.provideDelegate(host: Any?, p: Any): P =
//         runLogged("tdf(${this.value});") { this }
// 
// operator fun <V> V.getValue(receiver: Any?, p: Any): V =
//         runLogged("get($this);") { this }
// 
// val testO by runLogged("O;") { MyClass("O") }
// internal val testK by runLogged("K;") { "K" }
// val testOK = runLogged("OK;") { testO.value + testK }
// 
// fun box(): String {
//     assertEquals("O;tdf(O);K;OK;get(O);get(K);", log)
//     return testOK
// }
// 

// WITH_RUNTIME

import kotlin.test.*

var log: String = ""

open class MyClass(val value: String) {
    override fun toString(): String {
        return value
    }
}

inline fun <L> runLogged(entry: String, action: () -> L): L {
    log += entry
    return action()
}

operator fun <P: MyClass> P.provideDelegate(host: Any?, p: Any): P =
        runLogged("tdf(${this.value});") { this }

fun <V> getValue(v: V, receiver: Any?, p: Any): V =
        runLogged("get($v);") { v }

val testO by runLogged("O;") { MyClass("O") }
internal val testK by runLogged("K;") { "K" }
val testOK = runLogged("OK;") { testO.value + testK }

fun box(): String {
    assertEquals("O;tdf(O);K;OK;get(O);get(K);", log)
    return testOK
}

