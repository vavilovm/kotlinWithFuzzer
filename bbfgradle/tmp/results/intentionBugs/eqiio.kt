// EXECUTION DIFFERENT. Modified in 201.
// Original:
// OK
// 
// new:
// THEN
// Fail: [e, d, c, b, a]
// 
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_COLLECTIONS
// // WITH_RUNTIME
// // KJS_WITH_FULL_RUNTIME
// // SKIP_DCE_DRIVEN
// 
// tailrec fun sort(list: MutableList<String>, comparator: (String, String) -> Int) {
//     list.sortWith(Comparator(comparator))
// }
// 
// fun compare(s1: String, s2: String) = s1.compareTo(s2)
// 
// fun box(): String {
//     val l = mutableListOf("d", "b", "c", "e", "a")
//     sort(l, ::compare)
//     if (l != listOf("a", "b", "c", "d", "e")) {
// println("""THEN""");
// return "Fail: $l"
// }
//     return "OK"
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_COLLECTIONS
// WITH_RUNTIME
// KJS_WITH_FULL_RUNTIME
// SKIP_DCE_DRIVEN

tailrec fun sort(list: MutableList<String>, comparator: String.(String ) -> Int) {
    list.sortWith(Comparator{ s, s1 -> s1.comparator(s) })
}

fun compare(s1: String, s2: String) = s1.compareTo(s2)

fun box(): String {
    val l = mutableListOf("d", "b", "c", "e", "a")
    sort(l, ::compare)
    if (l != listOf("a", "b", "c", "d", "e")) {
println("""THEN""");
return "Fail: $l"
}
    return "OK"
}

