// PSI ERROR. Modified in 43
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // FILE: b.kt
// 
// class Foo<T>(val minus0: T, val plus0: T) {
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

class Foo<T>(val minus0: T, plus0: T) {

val plus0 = plus0override fun toString(): String{
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
