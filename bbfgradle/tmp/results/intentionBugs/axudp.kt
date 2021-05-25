// PSI ERROR. Modified in 35
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// internal class A {
//     inner class Inner(val result: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// }
// 
// fun box(): String {
//     val result = (A::Inner)((::A)(), 111).result + (A::Inner)(A(), 222).result
//     if (result != 333) {
// println("""THEN""");
// return "Fail $result"
// }
//     return "OK"
// }
// 

internal class A {
    inner class Inner{
val result:Intconstructor(  result: Int) {
this.result = result
}override fun toString(): String{
var res = ""
return res
}
}
}

fun box(): String {
    val result = (A::Inner)((::A)(), 111).result + (A::Inner)(A(), 222).result
    if (result != 333) {
println("""THEN""");
return "Fail $result"
}
    return "OK"
}

