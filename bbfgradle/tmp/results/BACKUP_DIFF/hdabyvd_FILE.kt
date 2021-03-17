// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS
// FILE: tmp0.kt

fun expectFail(f: () -> Unit): Nothing? {
    try{
println("""TRY""");

        f()
} catch (e: ArithmeticException){
println("""CATCH e: ArithmeticException""");

        return null
}
    throw AssertionError("Expected ArithmeticException to be thrown")
}

fun box(): String {
    val a1 = 0
    val a2 = expectFail { 1 / 0 } ?: 0
    val a3 = expectFail { 1 / a1 } ?: 0
    val a4 = expectFail { 1 / a2 } ?: 0
    val a5 = expectFail { 2 * (1 / 0) } ?: 0
    val a6 = expectFail { 2 * 1 / 0 } ?: 0

    val s1 = expectFail { "${2 * (1 / 0) }" } ?: "OK"

    return s1
}

fun box193(): String {
    val a1 = 0
val a2 = expectFail { 1 / 0 } ?: 0
val a3 = expectFail { 1 / a1 } ?: 0
val a4 = expectFail { 1 / a2 } ?: 0
val a5 = expectFail { 2 * (1 / 0) } ?: 0
val a6 = expectFail { 2 * 1 / 0 } ?: 0
val s1 = expectFail { "${2 * (1 / 0) }" } ?: "OK"
var prop2 = (expectFail { 2 * 1 / 0 } ?: 0).toString().toUIntOrNull()
    val prop3 = 749205015.toUInt()..(expectFail { 1 / 0 } ?: 0).toString().toUInt()
    for (i: UInt? in prop3) {
        prop2 = f2(1896612249.toUInt(), null)
    }
    return "ceirg"
}

fun f2(i: UInt, par1: UInt?): UInt {
    val a1 = 0
val a2 = expectFail { 1 / 0 } ?: 0
val a3 = expectFail { 1 / a1 } ?: 0
val a4 = expectFail { 1 / a2 } ?: 0
val a5 = expectFail { 2 * (1 / 0) } ?: 0
val a6 = expectFail { 2 * 1 / 0 } ?: 0
val s1 = expectFail { "${2 * (1 / 0) }" } ?: "OK"
return 921251407.toUInt()
}


