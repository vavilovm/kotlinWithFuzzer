// COMPILE != OK. Modified in 140
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: COROUTINES
// // WITH_RUNTIME
// // KJS_WITH_FULL_RUNTIME
// 
// public class A {
//     final val s: Sequence<String> = sequence {
//         val a = {}
//         yield("OK")
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box(): String = A().s.single()

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: COROUTINES
// WITH_RUNTIME
// KJS_WITH_FULL_RUNTIME

public class A {
    final fun getS(): Sequence<String> = sequence {
        val a = {}
        yield("OK")
    }
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box(): String = A().s.single()
