// COMPILE != OK. Modified in 164
// MODIFIED by Convert lambda expression to anonymous function intention:
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

inline class R(private val r: String) {
    fun test() = runInlineExt(fun(): String {
    return r
})
override fun toString(): String{
var res = ""
return res
}}

fun box() = R("OK").test()
