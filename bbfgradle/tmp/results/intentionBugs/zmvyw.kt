// COMPILE != OK. Modified in 94
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND_FIR: JVM_IR
// // MODULE: lib
// // FILE: l1.kt
// 
// private val <T : CharSequence> T.z
//     get() = { x: T -> this }
// 
// // FILE: l2.kt
// 
// fun test(ok: String, fail: String) = ok.z(fail)
// 
// // MODULE: main(lib)
// // FILE: main.kt
// 
// fun box() = test("OK", "FAIL")

// IGNORE_BACKEND_FIR: JVM_IR
// MODULE: lib
// FILE: l1.kt

private fun <T : CharSequence> T.getZ()= { x: T -> this }

// FILE: l2.kt

fun test(ok: String, fail: String) = ok.(getZ())(fail)

// MODULE: main(lib)
// FILE: main.kt

fun box() = test("OK", "FAIL")
