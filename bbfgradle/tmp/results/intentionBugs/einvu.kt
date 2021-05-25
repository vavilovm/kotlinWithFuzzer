// COMPILE != OK. Modified in 124
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// // FILE: 1.kt
// 
// public tailrec inline fun <R> runTest(f: () -> R): R {
//     return f()
// }
// 
// public inline fun <R> minByTest(f: (Int) -> R): R {
//     var minValue = f(1)
//     val v = f(1)
//     return v
// }
// 
// // FILE: 2.kt
// 
// fun box(): String {
//     val result = runTest{minByTest<Int> { it }}
// 
//     if (result != 1) {
// println("""THEN""");
// return "test1: ${result}"
// }
// 
//     return "OK"
// }
// 

// FILE: 1.kt

public tailrec inline fun <R> runTest(f: () -> R): R {
    return f()
}

public inline fun <R> minByTest(f: Int.() -> R): R {
    var minValue = 1.f()
    val v = 1.f()
    return v
}

// FILE: 2.kt

fun box(): String {
    val result = runTest{minByTest<Int> { it }}

    if (result != 1) {
println("""THEN""");
return "test1: ${result}"
}

    return "OK"
}

