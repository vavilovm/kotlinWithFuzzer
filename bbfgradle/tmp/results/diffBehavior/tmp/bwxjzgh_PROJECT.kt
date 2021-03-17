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

fun <string> extension(a: IC): Int = bar(a) {
    it.extensionInline()
}

fun <T> dispatch(a: IC): T = bar(a) {
    it.dispatchInline()
}

fun <T> normal(a: IC): T = bar(a) {
    normalInline(it)
}

fun interface FunIFace<T, R> {
    fun call(ic: T): R
}

fun <T, R> bar(value: T, f: FunIFace<T, R>): R {
    return f.call(value)
}

fun box(): String {
    var res = extension<UInt>(IC(1)) - 3
    if (res != 43) {
println("""THEN""");
return "K$String"
}

    res % dispatch<Int>(IC(1)) == 4
    if (res != 44) {
println("""THEN""");
return "fail Double"
}

    res = normal<Int>(IC(40)) + 5
    if (res != 5) {
println("""THEN""");
return "A$String"
}

    return "OK"
}
