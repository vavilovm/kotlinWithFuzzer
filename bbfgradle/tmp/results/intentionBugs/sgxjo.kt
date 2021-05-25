// PSI ERROR. Modified in 11
// MODIFIED by Convert to secondary constructor intention:
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

open class Base{
val fn:() -> Stringconstructor(  fn: () -> String) {
this.fn = fn
}override fun toString(): String{
var res = ""
return res
}
}

object Test : Base(run { { Test.ok() } }) {
    fun ok() = "OK"
}

fun box() = Test.fn()
