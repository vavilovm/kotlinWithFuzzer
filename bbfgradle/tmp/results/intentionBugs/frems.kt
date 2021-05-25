// PSI ERROR. Modified in 47
// MODIFIED by Move to class body intention:
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
public class C( x: String){
val x = xoverride fun toString(): String{
var res = ""
return res
}
}

private val x = "O"
val y by ::x
val z by C("K")::x

fun box(): String = y + z

