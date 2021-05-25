// PSI ERROR. Modified in 323
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: PROPERTY_REFERENCES
// // !LANGUAGE: +InlineClasses
// // WITH_RUNTIME
// 
// inline class Z(val x: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// public inline class L(val x: Long){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class S(val x: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// val Z.xx get() = x
// val L.xx get() = x
// val S.xx get() = x
// 
// fun box(): String {
//     if ((Z::xx).get(Z(42)) != 42) {
// println("""THEN""");
// throw AssertionError()
// }
//     if ((L::xx).get(L(1234L)) != 1234L) {
// println("""THEN""");
// throw AssertionError()
// }
//     if ((S::xx).get(S("abcdef")) != "abcdef") {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     return "OK"
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: PROPERTY_REFERENCES
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class Z(val x: Int){
override fun toString(): String{
var res = ""
return res
}
}
public inline class L(val x: Long){
override fun toString(): String{
var res = ""
return res
}
}
inline class S( x: String){
val x = xoverride fun toString(): String{
var res = ""
return res
}
}

val Z.xx get() = x
val L.xx get() = x
val S.xx get() = x

fun box(): String {
    if ((Z::xx).get(Z(42)) != 42) {
println("""THEN""");
throw AssertionError()
}
    if ((L::xx).get(L(1234L)) != 1234L) {
println("""THEN""");
throw AssertionError()
}
    if ((S::xx).get(S("abcdef")) != "abcdef") {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}
