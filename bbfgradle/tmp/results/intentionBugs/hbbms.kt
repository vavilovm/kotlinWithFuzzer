// PSI ERROR. Modified in 152
// MODIFIED by Convert to secondary constructor intention:
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

inline class Foo<T>(val x: Int){
override fun toString(): String{
var res = ""
return res
}
}

open class Bar{
val y:Foo<Any>constructor(  y: Foo<Any>) {
this.y = y
}override fun toString(): String{
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
