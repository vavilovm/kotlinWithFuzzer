// COMPILE != OK. Modified in 217
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
//  class Outer() {
//   final val s = "xyzzy"
// 
//   open inner class InnerBase(public val name: String) {
//   override fun toString(): String{
// var res = ""
// return res
// }}
// 
//   inner class InnerDerived(): InnerBase(s) {
//   }
// 
//   val x = InnerDerived()
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

  open inner class InnerBase(public val name: String) {
  override fun toString(): String{
var res = ""
return res
}}

  inner class InnerDerived(): InnerBase(s) {
  }

  fun getX() = InnerDerived()
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

