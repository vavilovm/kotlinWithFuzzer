// PSI ERROR. Modified in 66
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// // WITH_RUNTIME
// 
// inline class Foo<T>(val x: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// open class Bar(val y: Foo<Any>){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun box(): String {
//     if (Bar(Foo<Any>(42)).y.x != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     return "OK"
// }

// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class Foo<T>( x: Int){
val x = xoverride fun toString(): String{
var res = ""
return res
}
}

open class Bar(val y: Foo<Any>){
override fun toString(): String{
var res = ""
return res
}
}

fun box(): String {
    if (Bar(Foo<Any>(42)).y.x != 42) {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}
