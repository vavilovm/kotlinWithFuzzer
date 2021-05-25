// PSI ERROR. Modified in 12
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
//  open class A(val result: String) {
//     constructor(x: Int, y: Int = 99) : this("$x$y")
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// private class B(x: Int) : A(x)
// 
// tailrec fun box(): String {
//     val result = B(11).result
//     if (result != "1199") {
// println("""THEN""");
// return "fail: $result"
// }
//     return "OK"
// }

 open class A {
    val result:Stringconstructor(  result: String) {
this.result = result
}constructor(x: Int, y: Int = 99) : this("$x$y")
override fun toString(): String{
var res = ""
return res
}}

private class B(x: Int) : A(x)

tailrec fun box(): String {
    val result = B(11).result
    if (result != "1199") {
println("""THEN""");
return "fail: $result"
}
    return "OK"
}
