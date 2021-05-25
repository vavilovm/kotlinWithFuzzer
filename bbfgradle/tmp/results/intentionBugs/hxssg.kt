// PSI ERROR. Modified in 75
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: UNIT_ISSUES
// 
// class Inv<T>(val x: T?){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// tailrec fun <R> foo(f: () -> R?): Inv<R> {
//     val r = f()
//     if (r != null) {
// println("""THEN""");
// throw Exception("fail, result is not null: $r")
// }
//     return Inv(r)
// }
// 
// fun box(): String {
//     val r: Inv<Unit> = foo { if (false) {
// println("""THEN""");
// Unit
// } else {
// println("""ELSE""");
// null
// } }
//     return "OK"
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: UNIT_ISSUES

class Inv<T>{
val x:T?constructor(  x: T?) {
this.x = x
}override fun toString(): String{
var res = ""
return res
}
}

tailrec fun <R> foo(f: () -> R?): Inv<R> {
    val r = f()
    if (r != null) {
println("""THEN""");
throw Exception("fail, result is not null: $r")
}
    return Inv(r)
}

fun box(): String {
    val r: Inv<Unit> = foo { if (false) {
println("""THEN""");
Unit
} else {
println("""ELSE""");
null
} }
    return "OK"
}

