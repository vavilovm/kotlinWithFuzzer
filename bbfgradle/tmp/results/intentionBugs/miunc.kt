// COMPILE != OK. Modified in 220
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: IGNORED_IN_JS
// // IGNORE_BACKEND: JS_IR
// // IGNORE_BACKEND: JS_IR_ES6
// // TODO: muted automatically, investigate should it be ran for JS or not
// // IGNORE_BACKEND: JS
// 
// const val NAN = Float.NaN
// 
// data class A(val x: Float){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun box(): String {
//     if (A(+0f) == A(-0f)) {
// println("""THEN""");
// return "Fail: +0 == -0"
// }
//     if (A(+0f).hashCode() == A(-0f).hashCode()) {
// println("""THEN""");
// return "Fail: hash(+0) == hash(-0)"
// }
// 
//     if (A(NAN) != A(NAN)) {
// println("""THEN""");
// return "Fail: NaN != NaN"
// }
//     if (A(NAN).hashCode() != A(NAN).hashCode()) {
// println("""THEN""");
// return "Fail: hash(NaN) != hash(NaN)"
// }
// 
//     val s = HashSet<A>()
//     for (times in 1..5) {
//         s.add(A(3.14f))
//         s.add(A(+0f))
//         s.add(A(-0f))
//         s.add(A(-2.72f))
//         s.add(A(NAN))
//     }
// 
//     if (A(3.14f) !in s) {
// println("""THEN""");
// return "Fail: 3.14 not found"
// }
//     if (A(+0f) !in s) {
// println("""THEN""");
// return "Fail: +0 not found"
// }
//     if (A(-0f) !in s) {
// println("""THEN""");
// return "Fail: -0 not found"
// }
//     if (A(-2.72f) !in s) {
// println("""THEN""");
// return "Fail: -2.72 not found"
// }
//     if (A(NAN) !in s) {
// println("""THEN""");
// return "Fail: NaN not found"
// }
// 
//     return if (s.size == 5) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "Fail $s"
// }
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: IGNORED_IN_JS
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS

const val NAN by lazy { Float.NaN }

data class A(val x: Float){
override fun toString(): String{
var res = ""
return res
}
}

fun box(): String {
    if (A(+0f) == A(-0f)) {
println("""THEN""");
return "Fail: +0 == -0"
}
    if (A(+0f).hashCode() == A(-0f).hashCode()) {
println("""THEN""");
return "Fail: hash(+0) == hash(-0)"
}

    if (A(NAN) != A(NAN)) {
println("""THEN""");
return "Fail: NaN != NaN"
}
    if (A(NAN).hashCode() != A(NAN).hashCode()) {
println("""THEN""");
return "Fail: hash(NaN) != hash(NaN)"
}

    val s = HashSet<A>()
    for (times in 1..5) {
        s.add(A(3.14f))
        s.add(A(+0f))
        s.add(A(-0f))
        s.add(A(-2.72f))
        s.add(A(NAN))
    }

    if (A(3.14f) !in s) {
println("""THEN""");
return "Fail: 3.14 not found"
}
    if (A(+0f) !in s) {
println("""THEN""");
return "Fail: +0 not found"
}
    if (A(-0f) !in s) {
println("""THEN""");
return "Fail: -0 not found"
}
    if (A(-2.72f) !in s) {
println("""THEN""");
return "Fail: -2.72 not found"
}
    if (A(NAN) !in s) {
println("""THEN""");
return "Fail: NaN not found"
}

    return if (s.size == 5) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail $s"
}
}

