// COMPILE != OK. Modified in 74
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// tailrec inline fun myRun(x: () -> String) = x()
// 
// class C {
//     public val x = myRun { { "OK" }() }
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

tailrec inline fun myRun(x: () -> String) = x()

class C {
    public fun getX() = myRun { { "OK" }() }

    constructor(y: Int)
    constructor(y: String)
override fun toString(): String{
var res = ""
return res
}}

fun box(): String = C("").x

