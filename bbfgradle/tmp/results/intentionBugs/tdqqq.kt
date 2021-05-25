// EXECUTION FAILED AFTER INTENTION pos 139
// MODIFIED by Convert lambda to reference intention:
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

open class Base(val fn: () -> String){
override fun toString(): String{
var res = ""
return res
}
}

object Test : Base(run { Test::ok }) {
    fun ok() = "OK"
}

fun box() = Test.fn()
