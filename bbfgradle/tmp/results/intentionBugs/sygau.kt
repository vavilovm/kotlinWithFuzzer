// COMPILE != OK. Modified in 143
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: COROUTINES
// // WITH_RUNTIME
// // KJS_WITH_FULL_RUNTIME
// 
// internal class A {
//     public val s: Sequence<String> = sequence {
//         val a = {}
//         yield("OK")
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String = A().s.single()

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: COROUTINES
// WITH_RUNTIME
// KJS_WITH_FULL_RUNTIME

internal class A {
    public fun getS(): Sequence<String> = sequence {
        val a = {}
        yield("OK")
    }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String = A().s.single()
