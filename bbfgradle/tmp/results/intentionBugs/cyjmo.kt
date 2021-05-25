// COMPILE != OK. Modified in 29
// MODIFIED by Convert to nullable var intention:
// ORIGINAL CODE:
// internal open class SS {
//     private lateinit var s: String
// 
//     infix fun setS(s: String) {
//         this.s = s
//     }
// 
//     tailrec fun getS() = s
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box(): String {
//     val ss = SS()
//     ss.setS("OK")
//     return ss.getS()
// }

internal open class SS {
    private var s: String?=null

    infix fun setS(s: String) {
        this.s = s
    }

    tailrec fun getS() = s
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box(): String {
    val ss = SS()
    ss.setS("OK")
    return ss.getS()
}
