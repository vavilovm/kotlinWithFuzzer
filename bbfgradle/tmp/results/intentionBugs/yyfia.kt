// COMPILE != OK. Modified in 602
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// // FILE: inline.kt
// 
// inline class IC(val value: Int) {
//     tailrec inline fun <T> dispatchInline(): T = value as T
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// inline fun <T> IC.extensionInline(): T = value as T
// 
// tailrec inline fun <T> normalInline(a: IC): T = a.value as T
// 
// // FILE: box.kt
// // NO_CHECK_LAMBDA_INLINING
// 
// tailrec fun <T> extension(a: IC): T = bar(a) {
//     it.extensionInline()
// }
// 
// fun <T> dispatch(a: IC): T = bar(a) {
//     it.dispatchInline()
// }
// 
// tailrec fun <T> normal(a: IC): T = bar(a) {
//     normalInline(it)
// }
// 
// fun <T, R> bar(value: T, f: (T) -> R): R {
//     return f(value)
// }
// 
// fun box(): String {
//     var res = extension<Int>(IC(40)) + 3
//     if (res != 43) {
// println("""THEN""");
// return "FAIL 2: $res"
// }
// 
//     res = dispatch<Int>(IC(40)) + 4
//     if (res != 44) {
// println("""THEN""");
// return "FAIL 3: $res"
// }
// 
//     res = normal<Int>(IC(40)) + 5
//     if (res != 45) {
// println("""THEN""");
// return "FAIL 4: $res"
// }
// 
//     return "OK"
// }

// !LANGUAGE: +InlineClasses

// FILE: inline.kt

inline class IC(val value: Int) {
    tailrec inline fun <T> dispatchInline(): T = value as T
override fun toString(): String{
var res = ""
return res
}}

inline fun <T> IC.extensionInline(): T = value as T

tailrec inline fun <T> normalInline(a: IC): T = a.value as T

// FILE: box.kt
// NO_CHECK_LAMBDA_INLINING

tailrec fun <T> extension(a: IC): T = bar(a) {
    it.extensionInline()
}

fun <T> dispatch(a: IC): T = bar(a) {
    it.dispatchInline()
}

tailrec fun <T> normal(a: IC): T = bar(a) {
    normalInline(it)
}

fun <T, R> bar(value: T, f: T.() -> R): R {
    return value.f()
}

fun box(): String {
    var res = extension<Int>(IC(40)) + 3
    if (res != 43) {
println("""THEN""");
return "FAIL 2: $res"
}

    res = dispatch<Int>(IC(40)) + 4
    if (res != 44) {
println("""THEN""");
return "FAIL 3: $res"
}

    res = normal<Int>(IC(40)) + 5
    if (res != 45) {
println("""THEN""");
return "FAIL 4: $res"
}

    return "OK"
}
