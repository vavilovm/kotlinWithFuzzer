// PSI ERROR. Modified in 109
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// inline infix fun <T> T.runInlineExt(fn: T.() -> String) = fn()
// 
// inline class R(private val r: String) {
//     fun test() = runInlineExt { r }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box() = R("OK").test()

// !LANGUAGE: +InlineClasses

inline infix fun <T> T.runInlineExt(fn: T.() -> String) = fn()

inline class R(  r: String) {
    private val r = rfun test() = runInlineExt { r }
override fun toString(): String{
var res = ""
return res
}}

fun box() = R("OK").test()
