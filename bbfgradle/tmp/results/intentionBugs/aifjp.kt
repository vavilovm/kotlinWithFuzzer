// PSI ERROR. Modified in 156
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_COLLECTIONS
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// // IGNORE_BACKEND: NATIVE
// 
// inline class SnekDirection(val direction: Int) {
//     companion object {
//         final val Up = SnekDirection(0)
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun testUnbox() : SnekDirection {
//     val list = arrayListOf(SnekDirection.Up)
//     return list[0]
// }
// 
// tailrec fun box(): String {
//     val a = testUnbox()
//     return if (a.direction == 0) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "Fail"
// }
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_COLLECTIONS
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
// IGNORE_BACKEND: NATIVE

inline class SnekDirection {
    val direction:Intconstructor(  direction: Int) {
this.direction = direction
}companion object {
        final val Up = SnekDirection(0)
    }
override fun toString(): String{
var res = ""
return res
}}

tailrec fun testUnbox() : SnekDirection {
    val list = arrayListOf(SnekDirection.Up)
    return list[0]
}

tailrec fun box(): String {
    val a = testUnbox()
    return if (a.direction == 0) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail"
}
}
