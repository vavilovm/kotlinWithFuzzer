// PSI ERROR. Modified in 18
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// public open class A(val result: String) {
//     constructor(x: Int, y: Int = 99) : this("$x$y")
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// open class B(x: Int) : A(x)
// 
// fun box(): String {
//     val result = B(11).result
//     if (result != "1199") {
// println("""THEN""");
// return "fail: $result"
// }
//     return "OK"
// }

public open class A {
    val result:Stringconstructor(  result: String) {
this.result = result
}constructor(x: Int, y: Int = 99) : this("$x$y")
override fun toString(): String{
var res = ""
return res
}}

open class B(x: Int) : A(x)

fun box(): String {
    val result = B(11).result
    if (result != "1199") {
println("""THEN""");
return "fail: $result"
}
    return "OK"
}
