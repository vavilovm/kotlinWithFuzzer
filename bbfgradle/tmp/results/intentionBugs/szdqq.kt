// PSI ERROR. Modified in 14
// MODIFIED by Convert to secondary constructor intention:
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

 inline class Z {
    val s:Stringconstructor(  s: String) {
this.s = s
}private val Int.s: Int get() = 42
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

