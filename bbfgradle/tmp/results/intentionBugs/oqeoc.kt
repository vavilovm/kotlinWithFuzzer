// COMPILE != OK. Modified in 50
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// package test
// 
// private class TestPackage {
//     val OK = "OK"
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String = TestPackage().OK

package test

private class TestPackage {
    fun getOK() = "OK"
override fun toString(): String{
var res = ""
return res
}}

fun box(): String = TestPackage().OK
