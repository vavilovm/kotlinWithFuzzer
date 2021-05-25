// COMPILE != OK. Modified in 112
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS
// 
// 
// enum class Test(vararg xs: Int) {
//     OK {
//         fun foo() {}
//     };
//     internal val xs = xs
// }
// 
// tailrec fun box(): String =
//         if (Test.OK.xs.size == 0) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "Fail"
// }

// IGNORE_BACKEND: JS


enum class Test(vararg xs: Int) {
    OK {
        fun foo() {}
    };
    internal fun getXs() = xs
}

tailrec fun box(): String =
        if (Test.OK.xs.size == 0) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail"
}
