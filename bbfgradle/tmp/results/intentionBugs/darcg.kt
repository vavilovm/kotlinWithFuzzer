// PSI ERROR. Modified in 16
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// open class Base(val fn: () -> String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// object Test : Base(run { { Test.ok() } }) {
//     fun ok() = "OK"
// }
// 
// fun box() = Test.fn()

open class Base( fn: () -> String){
val fn = fnoverride fun toString(): String{
var res = ""
return res
}
}

object Test : Base(run { { Test.ok() } }) {
    fun ok() = "OK"
}

fun box() = Test.fn()
