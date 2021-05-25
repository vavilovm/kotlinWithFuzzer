// PSI ERROR. Modified in 52
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// internal inline class R(private val r: Long) {
//     fun test() = { ok() }()
// 
//     private fun ok() = "OK"
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box() = R(0).test()

// !LANGUAGE: +InlineClasses

internal inline class R {
    private  val r:Longconstructor(  r: Long) {
this.r = r
}fun test() = { ok() }()

    private fun ok() = "OK"
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box() = R(0).test()
