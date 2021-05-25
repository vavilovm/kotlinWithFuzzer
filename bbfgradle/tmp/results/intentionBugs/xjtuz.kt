// COMPILE != OK. Modified in 51
// MODIFIED by Convert receiver to parameter intention:
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

inline infix fun <T> runInlineExt(t: T, fn: T.() -> String) = t.fn()

inline class R(private val r: String) {
    fun test() = runInlineExt { r }
override fun toString(): String{
var res = ""
return res
}}

fun box() = R("OK").test()
