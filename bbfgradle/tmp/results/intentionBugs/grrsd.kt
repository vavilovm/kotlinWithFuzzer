// PSI ERROR. Modified in 17
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// abstract class A(val value: String) {
//     operator fun component1() = value
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// internal interface B {
//     fun component1(): Any
// }
// 
// class C(value: String) : A(value), B
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

abstract class A( value: String) {
    val value = valueoperator fun component1() = value
override fun toString(): String{
var res = ""
return res
}}

internal interface B {
    fun component1(): Any
}

class C(value: String) : A(value), B

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

