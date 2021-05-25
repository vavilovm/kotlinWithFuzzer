// PSI ERROR. Modified in 39
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// public class A {
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

public class A {
    inner class Inner( result: Int){
val result = resultoverride fun toString(): String{
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

