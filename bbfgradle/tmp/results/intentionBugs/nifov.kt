// PSI ERROR. Modified in 30
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// open class A<in I>(init_o: I, private val init_k: I) {
//     private val o: I = init_o
//     private fun k(): I = init_k
// 
//     tailrec fun getOk() = o.toString() + k().toString()
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

open class A<in I>(init_o: I, init_k: I) {
    private val init_k = init_kprivate val o: I = init_o
    private fun k(): I = init_k

    tailrec fun getOk() = o.toString() + k().toString()
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val a = A("O", "K")
    return a.getOk()
}

