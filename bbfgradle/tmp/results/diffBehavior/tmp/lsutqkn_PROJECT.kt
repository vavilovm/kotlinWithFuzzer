// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +InlineClasses
// SAM_CONVERSIONS: INDY
// FILE: inline.kt

inline class IC(val value: Any?) {
    inline fun <T> dispatchInline(): T = value as T
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

inline fun <T> IC.extensionInline(): T = value as T

inline fun <T> normalInline(a: IC): T = a.value as T
// FILE: box.kt

fun <T> extension(a: IC): T = bar(a) {
    it.extensionInline()
}

fun <T> dispatch(a: IC): T = bar(a) {
    it.dispatchInline()
}

fun <T> normal(a: IC): T = bar(a) {
    normalInline(a)
}

fun interface FunIFace<T, R> {
    fun call(box: T): R
}

fun <T, R> bar(value: T, f: FunIFace<T, R>): R {
    return f.call(value)
}

fun box(): String {
    var res = extension<Int>(IC(40)) + 3
    if (res != 43) {
println("""THEN""");
return "OK"
}

    res = dispatch<Int>(IC(1)) + 4
    if (res != 44) {
println("""THEN""");
return "OK$Int"
}

    res = normal<Int>(IC(40)) + 5
    if (res != 45) {
println("""THEN""");
return "Fail #2"
}

    return "OK"
}
