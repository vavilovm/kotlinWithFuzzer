// COMPILE != OK. Modified in 137
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // WITH_REFLECT
// // WITH_RUNTIME
// public class C(val x: String){
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
public class C(val x: String){
override fun toString(): String{
var res = ""
return res
}
}

private fun getX() = "O"
val y by ::getX
val z by C("K")::x

fun box(): String = y + z

