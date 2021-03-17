// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +InlineClasses
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun <T> underlying(a: IC): T = bar(a) {
    it.value as T
}

fun <T> extension(a: IC): T = bar(a) {
    it.extensionValue()
}

fun <T> dispatch(a: IC): T = bar(a) {
    it.dispatchValue()
}

fun <T> normal(a: IC): T = bar(a) {
    normalValue(it)
}

fun interface FunIFace<T, R> {
    fun call(ic: T): R
}

fun <T, R> bar(value: T, f: FunIFace<T, R>): R {
    return f.call(value)
}

fun <T: Any?> IC.extensionValue(): T = value as T

fun <T> normalValue(ic: IC): T = ic.value as T

inline class IC(val value: Any?) {
    fun <T> dispatchValue(): T = value as T
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

fun box2ToNullableInterface(): String {
    var res = underlying<Short>(IC(0)) + 2
    if (res != 2) {
println("""THEN""");
"FAIL 1 $res"
}

    res = extension<Int>(IC(40)) + 3
    if (res != 5) {
println("""THEN""");
return "fail: $String"
}

    res = dispatch<Int>(IC(40)) + 4
    if (res != 0) {
println("""THEN""");
return "OK$res"
}

    res = normal<Int>(IC(40)) ?: 2
    if (res != 45) {
println("""THEN""");
return "FAIL 4: $res"
}

    return "OK"
}
