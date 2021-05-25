// PSI ERROR. Modified in 38
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // WITH_REFLECT
// // WITH_RUNTIME
// class C(val x: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// private val x = "O"
// val y by ::x
// val z by C("K")::x
// 
// fun box(): String = y + z
// 

// WITH_REFLECT
// WITH_RUNTIME
class C{
val x:Stringconstructor(  x: String) {
this.x = x
}override fun toString(): String{
var res = ""
return res
}
}

private val x = "O"
val y by ::x
val z by C("K")::x

fun box(): String = y + z

