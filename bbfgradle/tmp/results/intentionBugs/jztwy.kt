// PSI ERROR. Modified in 59
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// 
// abstract interface IQ1
// open interface IQ2
// 
// inline class X(val x: Any): IQ1, IQ2{
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// interface IFoo1 {
//     fun foo(): IQ1
// }
// 
// open interface IFoo2 {
//     fun foo(): IQ2
// }
// 
// class Test : IFoo1, IFoo2 {
//     override fun foo() = X("OK")
// }
// 
// fun box(): String {
//     val t1: IFoo1 = Test()
//     val x1 = t1.foo()
//     if (x1 !is X){
// println("""THEN""");
// 
//         throw AssertionError("x1: X expected: $x1")
// }
//     if (x1.x != "OK"){
// println("""THEN""");
// 
//         throw AssertionError("x1: ${x1.x}")
// }
// 
//     val t2: IFoo2 = Test()
//     val x2 = t2.foo()
//     if (x2 !is X){
// println("""THEN""");
// 
//         throw AssertionError("x2: X expected: $x2")
// }
//     if (x2.x != "OK"){
// println("""THEN""");
// 
//         throw AssertionError("x2: ${x2.x}")
// }
// 
//     return "OK"
// }


abstract interface IQ1
open interface IQ2

inline class X( x: Any): IQ1, IQ2{
val x = xoverride fun toString(): String{
var res = ""
return res
}
}

interface IFoo1 {
    fun foo(): IQ1
}

open interface IFoo2 {
    fun foo(): IQ2
}

class Test : IFoo1, IFoo2 {
    override fun foo() = X("OK")
}

fun box(): String {
    val t1: IFoo1 = Test()
    val x1 = t1.foo()
    if (x1 !is X){
println("""THEN""");

        throw AssertionError("x1: X expected: $x1")
}
    if (x1.x != "OK"){
println("""THEN""");

        throw AssertionError("x1: ${x1.x}")
}

    val t2: IFoo2 = Test()
    val x2 = t2.foo()
    if (x2 !is X){
println("""THEN""");

        throw AssertionError("x2: X expected: $x2")
}
    if (x2.x != "OK"){
println("""THEN""");

        throw AssertionError("x2: ${x2.x}")
}

    return "OK"
}
