// PSI ERROR. Modified in 155
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// // WITH_RUNTIME
// 
// public inline class Z(val x: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class L(val x: Long){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// public inline class S(val x: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun Z.test() = x
// tailrec fun L.test() = x
// tailrec fun S.test() = x
// 
// fun box(): String {
//     if (Z::test.invoke(Z(42)) != 42) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (L::test.invoke(L(1234L)) != 1234L) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (S::test.invoke(S("abcdef")) != "abcdef") {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     return "OK"
// }

// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

public inline class Z(val x: Int){
override fun toString(): String{
var res = ""
return res
}
}
inline class L{
val x:Longconstructor(  x: Long) {
this.x = x
}override fun toString(): String{
var res = ""
return res
}
}
public inline class S(val x: String){
override fun toString(): String{
var res = ""
return res
}
}

fun Z.test() = x
tailrec fun L.test() = x
tailrec fun S.test() = x

fun box(): String {
    if (Z::test.invoke(Z(42)) != 42) {
println("""THEN""");
throw AssertionError()
}
    if (L::test.invoke(L(1234L)) != 1234L) {
println("""THEN""");
throw AssertionError()
}
    if (S::test.invoke(S("abcdef")) != "abcdef") {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}
