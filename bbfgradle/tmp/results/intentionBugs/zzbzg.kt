// COMPILE != OK. Modified in 163
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
// private val y by ::x
// public val z by C("K")::x
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
private val y by { x }
public val z by C("K")::x

fun box(): String = y + z

