// COMPILE != OK. Modified in 47
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// package test
// 
// open class TestPackage {
//     val OK = "OK"
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String = TestPackage().OK

package test

open class TestPackage {
    fun getOK() = "OK"
override fun toString(): String{
var res = ""
return res
}}

fun box(): String = TestPackage().OK
