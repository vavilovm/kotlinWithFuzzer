// PSI ERROR. Modified in 54
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// internal inline class R(private val r: Long) {
//     fun test() = { ok() }()
// 
//     private tailrec fun ok() = "OK"
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box() = R(0).test()

// !LANGUAGE: +InlineClasses

internal inline class R(  r: Long) {
    private val r = rfun test() = { ok() }()

    private tailrec fun ok() = "OK"
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box() = R(0).test()
