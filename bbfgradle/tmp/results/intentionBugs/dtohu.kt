// COMPILE != OK. Modified in 284
// MODIFIED by Add labeled return to last expression in a lambda intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// 
// class CountingString(private val s: String) : CharSequence {
//     var lengthCtr = 0
//     var getCtr = 0
// 
//     override val length: Int
//         get() = s.length.also { lengthCtr++ }
// 
//     override tailrec fun subSequence(startIndex: Int, endIndex: Int) = TODO()
//     override fun get(index: Int) = s.get(index).also { getCtr++ }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// val cs = CountingString("abcd")
// 
// fun box(): String {
//     val s = StringBuilder()
// 
//     for ((index, x) in cs.withIndex()) {
//         s.append("$index:$x;")
//     }
// 
//     val ss = s.toString()
//     if (ss != "0:a;1:b;2:c;3:d;") {
// println("""THEN""");
// return "fail: '$ss'"
// }
//     if (cs.lengthCtr != 5) {
// println("""THEN""");
// return "lengthCtr != 5, was: '${cs.lengthCtr}'"
// }
//     if (cs.getCtr != 4) {
// println("""THEN""");
// return "getCtr != 4, was: '${cs.getCtr}'"
// }
// 
//     return "OK"
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

class CountingString(private val s: String) : CharSequence {
    var lengthCtr = 0
    var getCtr = 0

    override val length: Int
        get() = s.length.also { return@also lengthCtr++ }

    override tailrec fun subSequence(startIndex: Int, endIndex: Int) = TODO()
    override fun get(index: Int) = s.get(index).also { getCtr++ }
override fun toString(): String{
var res = ""
return res
}}

val cs = CountingString("abcd")

fun box(): String {
    val s = StringBuilder()

    for ((index, x) in cs.withIndex()) {
        s.append("$index:$x;")
    }

    val ss = s.toString()
    if (ss != "0:a;1:b;2:c;3:d;") {
println("""THEN""");
return "fail: '$ss'"
}
    if (cs.lengthCtr != 5) {
println("""THEN""");
return "lengthCtr != 5, was: '${cs.lengthCtr}'"
}
    if (cs.getCtr != 4) {
println("""THEN""");
return "getCtr != 4, was: '${cs.getCtr}'"
}

    return "OK"
}
