// PSI ERROR. Modified in 13
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// open class A(val value: String) {
//     fun component1() = value
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// open interface B {
//     operator fun component1(): Any
// }
// 
// public class C(value: String) : A(value), B
// 
// fun box(): String {
//     val c = C("OK")
//     val b: B = c
//     val a: A = c
//     if (b.component1() != "OK") {
// println("""THEN""");
// return "Fail 1"
// }
//     if (a.component1() != "OK") {
// println("""THEN""");
// return "Fail 2"
// }
//     return c.component1()
// }
// 

open class A( value: String) {
    val value = valuefun component1() = value
override fun toString(): String{
var res = ""
return res
}}

open interface B {
    operator fun component1(): Any
}

public class C(value: String) : A(value), B

fun box(): String {
    val c = C("OK")
    val b: B = c
    val a: A = c
    if (b.component1() != "OK") {
println("""THEN""");
return "Fail 1"
}
    if (a.component1() != "OK") {
println("""THEN""");
return "Fail 2"
}
    return c.component1()
}

