// PSI ERROR. Modified in 143
// MODIFIED by Convert to secondary constructor intention:
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

internal class Test {
    val x:Sval y:Sconstructor(  x: S,   y: S = S("K")) {
this.x = x
this.y = y
this.test = x.string + y.string
}val test: String
override fun toString(): String{
var res = ""
return res
}}

fun box() = Test(S("O")).test
