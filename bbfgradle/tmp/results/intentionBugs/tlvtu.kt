// PSI ERROR. Modified in 94
// MODIFIED by Convert lambda to reference intention:
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
// fun box() = R(0).test()

// !LANGUAGE: +InlineClasses

internal inline class R(private val r: Long) {
    fun test() = this::ok()

    private fun ok() = "OK"
override fun toString(): String{
var res = ""
return res
}}

fun box() = R(0).test()
