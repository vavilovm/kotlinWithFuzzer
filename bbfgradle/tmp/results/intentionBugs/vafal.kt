// PSI ERROR. Modified in 80
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// inline fun myRun(x: () -> String) = x()
// 
// class C {
//     internal val x = myRun { { "OK" }() }
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
    internal val x = myRun { fun (): String {
 return "OK"
}() }

    constructor(y: Int)
    constructor(y: String)
override fun toString(): String{
var res = ""
return res
}}

fun box(): String = C("").x

