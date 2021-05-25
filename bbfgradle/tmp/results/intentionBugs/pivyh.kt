// COMPILE != OK. Modified in 73
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// inline fun myRun(x: () -> String) = x()
// 
// class C {
//     internal open val x = myRun { { "OK" }() }
// 
//     constructor(y: Int)
//     constructor(y: String)
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String = C("").x
// 

inline fun myRun(x: () -> String) = x()

class C {
    internal open fun getX() = myRun { { "OK" }() }

    constructor(y: Int)
    constructor(y: String)
override fun toString(): String{
var res = ""
return res
}}

fun box(): String = C("").x

