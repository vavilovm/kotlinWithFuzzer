// PSI ERROR. Modified in 29
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // FILE: b.kt
// 
// private class Foo<T>(val minus0: T, val plus0: T) {
// 
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box(): String {
//     val foo = Foo<Double>(-0.0, 0.0)
//     val fooF = Foo<Float>(-0.0F, 0.0F)
// 
//     if (foo.minus0 < foo.plus0) {
// println("""THEN""");
// return "fail 0"
// }
//     if (fooF.minus0 < fooF.plus0) {
// println("""THEN""");
// return "fail 1"
// }
// 
//     if (foo.minus0 != foo.plus0) {
// println("""THEN""");
// return "fail 3"
// }
//     if (fooF.minus0 != fooF.plus0) {
// println("""THEN""");
// return "fail 4"
// }
// 
//     return "OK"
// }

// FILE: b.kt

private class Foo<T> {

val minus0:Tval plus0:Tconstructor(  minus0: T,   plus0: T) {
this.minus0 = minus0
this.plus0 = plus0
}override fun toString(): String{
var res = ""
return res
}}

tailrec fun box(): String {
    val foo = Foo<Double>(-0.0, 0.0)
    val fooF = Foo<Float>(-0.0F, 0.0F)

    if (foo.minus0 < foo.plus0) {
println("""THEN""");
return "fail 0"
}
    if (fooF.minus0 < fooF.plus0) {
println("""THEN""");
return "fail 1"
}

    if (foo.minus0 != foo.plus0) {
println("""THEN""");
return "fail 3"
}
    if (fooF.minus0 != fooF.plus0) {
println("""THEN""");
return "fail 4"
}

    return "OK"
}
