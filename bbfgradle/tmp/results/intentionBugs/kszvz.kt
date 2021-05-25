// PSI ERROR. Modified in 95
// MODIFIED by Convert lambda to reference intention:
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

internal inline class R(private val r: Long) {
    fun test() = this::ok()

    private tailrec fun ok() = "OK"
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box() = R(0).test()
