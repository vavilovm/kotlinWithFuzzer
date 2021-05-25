// COMPILE != OK. Modified in 167
// MODIFIED by Convert reference to lambda intention:
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

private val x = "O"
val y by ::x
val z by { C("K").x }

fun box(): String = y + z

