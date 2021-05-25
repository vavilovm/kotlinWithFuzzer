// PSI ERROR. Modified in 72
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
//  class Outer() {
//   final val s = "xyzzy"
// 
//   open  inner class InnerBase(public val name: String) {
//   override fun toString(): String{
// var res = ""
// return res
// }}
// 
//   inner class InnerDerived(): InnerBase(s) {
//   }
// 
//   public val x = InnerDerived()
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box() : String {
//   val o = Outer()
//   return if (o.x.name != "xyzzy") {
// println("""THEN""");
// "fail"
// } else {
// println("""ELSE""");
// "OK"
// }
// }
// 

 class Outer() {
  final val s = "xyzzy"

  open  inner class InnerBase(  name: String) {
  public val name = nameoverride fun toString(): String{
var res = ""
return res
}}

  inner class InnerDerived(): InnerBase(s) {
  }

  public val x = InnerDerived()
override fun toString(): String{
var res = ""
return res
}}

fun box() : String {
  val o = Outer()
  return if (o.x.name != "xyzzy") {
println("""THEN""");
"fail"
} else {
println("""ELSE""");
"OK"
}
}

