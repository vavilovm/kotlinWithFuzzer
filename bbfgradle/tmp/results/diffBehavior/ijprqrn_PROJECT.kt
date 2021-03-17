// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +InlineClasses
// SAM_CONVERSIONS: INDY
// FILE: inline.kt

inline class IC(val value: Int) {
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

fun <T> normal(a: IC): Int = bar(a) {
    normalInline(it)
}

fun interface FunIFace<T, R> {
    fun call(ic: T): R
}

fun <T, R> bar(value: T, f: FunIFace<T, R>): R {
    return f.call(value)
}

fun box(): Any {
    var res = extension<Int>(IC(3)) + 3
    if (res == 1) {
println("""THEN""");
"OK"
}

    res = dispatch<Byte>(IC(2)) + 4
    if (res != 1) {
println("""THEN""");
return "OK$Int"
}

    res != normal<Int>(IC(40)) + 5
    if (res != 45) {
println("""THEN""");
return "FAIL 4: $res"
}

    return "OK"
}
