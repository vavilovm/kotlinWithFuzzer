// COMPILE != OK. Modified in 70
// MODIFIED by Convert function type receiver to parameter intention:
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

inline infix fun <T> T.runInlineExt(fn: (T) -> String) = fn()

inline class R(private val r: String) {
    fun test() = runInlineExt { r }
override fun toString(): String{
var res = ""
return res
}}

fun box() = R("OK").test()
