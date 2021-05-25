// PSI ERROR. Modified in 16
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
//  inline class Z(val s: String) {
//     private val Int.s: Int get() = 42
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     if (Z("a").toString() == "Z(s=a)")
//         {
// println("""THEN""");
// return "OK"
// }
//     return "Fail"
// }
// 

 inline class Z( s: String) {
    val s = sprivate val Int.s: Int get() = 42
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    if (Z("a").toString() == "Z(s=a)")
        {
println("""THEN""");
return "OK"
}
    return "Fail"
}

