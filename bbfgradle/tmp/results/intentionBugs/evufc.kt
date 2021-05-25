// PSI ERROR. Modified in 107
// MODIFIED by Convert to secondary constructor intention:
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

inline class R {
    private  val r:Stringconstructor(  r: String) {
this.r = r
}fun test() = runInlineExt { r }
override fun toString(): String{
var res = ""
return res
}}

fun box() = R("OK").test()
