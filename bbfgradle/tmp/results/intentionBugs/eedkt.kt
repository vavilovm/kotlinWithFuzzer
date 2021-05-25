// PSI ERROR. Modified in 72
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
//  class A {
//     open inner class B(val a: Double = 1.0, val b: Int = 55, val c: String = "c"){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// }
// 
// fun box(): String {
//     val bDefault = A().B()
//     val b = A().B(2.0, 66, "cc")
//     if (bDefault.a == 1.0 && bDefault.b == 55 && bDefault.c == "c"){
// println("""THEN""");
// 
//         if (b.a == 2.0 && b.b == 66 && b.c == "cc") {
//             return "OK"
//         }
// }
//     return "fail"
// }
// 

 class A {
    open inner class B(val a: Double = 1.0, val b: Int = 55, c: String = "c"){
val c = coverride fun toString(): String{
var res = ""
return res
}
}
}

fun box(): String {
    val bDefault = A().B()
    val b = A().B(2.0, 66, "cc")
    if (bDefault.a == 1.0 && bDefault.b == 55 && bDefault.c == "c"){
println("""THEN""");

        if (b.a == 2.0 && b.b == 66 && b.c == "cc") {
            return "OK"
        }
}
    return "fail"
}

