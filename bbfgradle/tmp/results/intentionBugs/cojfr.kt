// PSI ERROR. Modified in 79
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// tailrec inline fun myRun(x: () -> String) = x()
// 
// class C {
//     val x = myRun { { "OK" }() }
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
    val x = myRun { fun (): String {
 return "OK"
}() }

    constructor(y: Int)
    constructor(y: String)
override fun toString(): String{
var res = ""
return res
}}

fun box(): String = C("").x

