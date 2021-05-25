// COMPILE != OK. Modified in 146
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
//  data class A<T, F>(val x: T, val y: F){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// tailrec fun <X, Y> foo(a: A<X, Y>, block: (A<X, Y>) -> String) = block(a)
// 
// tailrec fun box(): String {
//     val x = foo(A("OK", 1)) { (x, y) -> x + (y.toString()) }
// 
//     if (x != "OK1") {
// println("""THEN""");
// return "fail1: $x"
// }
// 
//     return "OK"
// }
// 

 data class A<T, F>(val x: T, val y: F){
override fun toString(): String{
var res = ""
return res
}
}

tailrec fun <X, Y> foo(a: A<X, Y>, block: A<X, Y>.() -> String) = a.block()

tailrec fun box(): String {
    val x = foo(A("OK", 1)) { (x, y) -> x + (y.toString()) }

    if (x != "OK1") {
println("""THEN""");
return "fail1: $x"
}

    return "OK"
}

