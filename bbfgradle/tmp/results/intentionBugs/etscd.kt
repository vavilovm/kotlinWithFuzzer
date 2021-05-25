// COMPILE != OK. Modified in 319
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// // FILE: test.kt
// 
// fun checkNotEqual(x: Any, y: Any) {
//     if (x == y || y == x) {
// println("""THEN""");
// throw AssertionError("$x and $y should NOT be equal")
// }
// }
// 
// tailrec fun target(s1: String, vararg xs: Int, s2: String = "") {}
// 
// fun capture1(fn: (String, IntArray, String) -> Unit): Any = fn
// fun capture2(fn: (String, Int, Int) -> Unit): Any = fn
// 
// fun box(): String {
//     checkNotEqual(capture1(::target), capture2(::target))
//     checkNotEqual(capture1(::target), captureFromOtherFile())
//     return "OK"
// }
// 
// // FILE: fromOtherFile.kt
// 
// fun captureFromOtherFile(): Any = capture2(::target)
// 

// FILE: test.kt

fun checkNotEqual(x: Any, y: Any) {
    if (x == y || y == x) {
println("""THEN""");
throw AssertionError("$x and $y should NOT be equal")
}
}

tailrec fun target(s1: String, vararg xs: Int, s2: String = "") {}

fun capture1(fn: (String, IntArray, String) -> Unit): Any = fn
fun capture2(fn: Int.(String,  Int) -> Unit): Any = { s, i, i1 -> i.fn(s, i1) }

fun box(): String {
    checkNotEqual(capture1(::target), capture2(::target))
    checkNotEqual(capture1(::target), captureFromOtherFile())
    return "OK"
}

// FILE: fromOtherFile.kt

fun captureFromOtherFile(): Any = capture2(::target)

