// PSI ERROR. Modified in 148
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// inline class S(val string: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// internal class Test(val x: S, val y: S = S("K")) {
//     val test = x.string + y.string
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box() = Test(S("O")).test

// !LANGUAGE: +InlineClasses

inline class S(val string: String){
override fun toString(): String{
var res = ""
return res
}
}

internal class Test( x: S, val y: S = S("K")) {
    val x = xval test = x.string + y.string
override fun toString(): String{
var res = ""
return res
}}

fun box() = Test(S("O")).test
