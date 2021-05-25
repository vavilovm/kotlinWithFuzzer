// COMPILE != OK. Modified in 20
// MODIFIED by Convert to nullable var intention:
// ORIGINAL CODE:
// open class SS {
//     private lateinit var s: String
// 
//     fun setS(s: String) {
//         this.s = s
//     }
// 
//     fun getS() = s
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val ss = SS()
//     ss.setS("OK")
//     return ss.getS()
// }

open class SS {
    private var s: String?=null

    fun setS(s: String) {
        this.s = s
    }

    fun getS() = s
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val ss = SS()
    ss.setS("OK")
    return ss.getS()
}
