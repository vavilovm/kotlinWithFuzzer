// PSI ERROR. Modified in 80
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
//  internal class Outer() {
//   final val s = "xyzzy"
// 
//   internal open  inner class InnerBase(public val name: String) {
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

 internal class Outer() {
  final val s = "xyzzy"

  internal open  inner class InnerBase {
  public  val name:Stringconstructor(  name: String) {
this.name = name
}override fun toString(): String{
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

