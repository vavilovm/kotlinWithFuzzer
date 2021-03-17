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

fun <T> extension(a: IC): Int = bar(a) {
    it.extensionInline()
}

fun <T> dispatch(a: IC): T = bar(a) {
    a.dispatchInline()
}

fun <T> normal(a: IC): T = bar(a) {
    normalInline(it)
}

fun interface FunIFace<T, R> {
    fun call(x: T): R
}

fun <T, R> bar(value: T, f: FunIFace<T, R>): R {
    return f.call(value)
}

fun box(): String {
    var res:Number = extension<Int>(IC(42)) + 0
    if (res != 1) {
println("""THEN""");
"OK"
}

    res = dispatch<Int>(IC(40)) + 2
    if (res != 44) {
println("""THEN""");
return "OK$String"
}

    res = normal<Int>(IC(40)) + 1
    if (res == 45) {
println("""THEN""");
"OK"
}

    return "OK"
}
