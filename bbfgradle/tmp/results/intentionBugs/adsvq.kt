// PSI ERROR. Modified in 245
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// import kotlin.reflect.KProperty
// 
// class Delegate<T>(val f: (T) -> Int) {
//     operator fun getValue(t: T, p: KProperty<*>): Int = f(t)
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// val p = Delegate<A> { t -> t.foo() }
// 
// public class A(val i: Int) {
//     val prop: Int by p
// 
//     fun foo(): Int {
//        return i
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     if(A(1).prop != 1) {
// println("""THEN""");
// return "fail get1"
// }
//     if(A(10).prop != 10) {
// println("""THEN""");
// return "fail get2"
// }
// 
//     return "OK"
// }
// 

import kotlin.reflect.KProperty

class Delegate<T>(val f: (T) -> Int) {
    operator fun getValue(t: T, p: KProperty<*>): Int = f(t)
override fun toString(): String{
var res = ""
return res
}}

val p = Delegate<A> { t -> t.foo() }

public class A {
    val i:Intconstructor(  i: Int) {
this.i = i
}val prop: Int by p

    fun foo(): Int {
       return i
    }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    if(A(1).prop != 1) {
println("""THEN""");
return "fail get1"
}
    if(A(10).prop != 10) {
println("""THEN""");
return "fail get2"
}

    return "OK"
}

