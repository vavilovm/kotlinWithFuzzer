// PSI ERROR. Modified in 50
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// 
// interface IQ1
// interface IQ2
// 
// public inline class X(val x: Any): IQ1, IQ2{
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// public interface IFoo1 {
//     fun foo(): IQ1
// }
// 
// interface IFoo2 {
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


interface IQ1
interface IQ2

public inline class X: IQ1, IQ2{
val x:Anyconstructor(  x: Any) {
this.x = x
}override fun toString(): String{
var res = ""
return res
}
}

public interface IFoo1 {
    fun foo(): IQ1
}

interface IFoo2 {
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
