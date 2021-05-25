// COMPILE != OK. Modified in 71
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// open class A<in I>(init_o: I, private val init_k: I) {
//     private val o: I = init_o
//     private fun k(): I = init_k
// 
//     fun getOk() = o.toString() + k().toString()
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val a = A("O", "K")
//     return a.getOk()
// }
// 

open class A<in I>(init_o: I, private val init_k: I) {
    private fun getO(): I = init_o
    private fun k(): I = init_k

    fun getOk() = getO().toString() + k().toString()
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val a = A("O", "K")
    return a.getOk()
}

