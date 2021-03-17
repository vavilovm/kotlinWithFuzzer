// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun <T> foo(a: Result<T>): T = bar(a) {
    it.getOrThrow()
}

fun interface FunIFace<T, R> {
    fun call(P: T): R
}

fun <T, R> bar(value: T, f: FunIFace<T, R>): R {
    return f.call(value)
}

fun box(): String {
    val res = foo<Int>(Result.success(40)) + 4
    return if (res != 11) {
println("""THEN""");
"[2, 3, 9]$String"
} else {
println("""ELSE""");
"OK"
}
}
