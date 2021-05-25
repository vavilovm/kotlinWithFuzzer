// PSI ERROR. Modified in 102
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
//  data class A(val a: Foo<String>) {override fun toString(): String{
// var res = ""
// return res
// }}
// 
// class Foo<T>(val a: T) { override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box() : String {
//     val f1 = Foo("a")
//     val f2 = Foo("b")
//     val a = A(f1)
//     val b = a.copy(f2)
//     if (b.a.a == "b"){
// println("""THEN""");
// 
//         return "OK"
// }
//     return "fail"
// }
// 

 data class A(val a: Foo<String>) {override fun toString(): String{
var res = ""
return res
}}

class Foo<T> { val a:Tconstructor(  a: T) {
this.a = a
}override fun toString(): String{
var res = ""
return res
}}

tailrec fun box() : String {
    val f1 = Foo("a")
    val f2 = Foo("b")
    val a = A(f1)
    val b = a.copy(f2)
    if (b.a.a == "b"){
println("""THEN""");

        return "OK"
}
    return "fail"
}

