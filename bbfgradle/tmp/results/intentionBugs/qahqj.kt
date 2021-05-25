// PSI ERROR. Modified in 45
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
// data class Test(val s: S) {
//     constructor(x: String, s: S) : this(S(x + s.string))
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box() = Test("O", S("K")).s.string

// !LANGUAGE: +InlineClasses

inline class S( string: String){
val string = stringoverride fun toString(): String{
var res = ""
return res
}
}

data class Test(val s: S) {
    constructor(x: String, s: S) : this(S(x + s.string))
override fun toString(): String{
var res = ""
return res
}}

fun box() = Test("O", S("K")).s.string
