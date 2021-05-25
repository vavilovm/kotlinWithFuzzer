// PSI ERROR. Modified in 11
// MODIFIED by Convert to secondary constructor intention:
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

open class A<in I> {
    private  val init_k:Iconstructor(  init_o: I,   init_k: I) {
this.init_k = init_k
this.o = init_o
}private val o: I
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

