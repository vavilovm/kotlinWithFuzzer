// PSI ERROR. Modified in 52
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_RUNTIME
// 
// open class C(val i: Int) {
//     var status = "fail"
// 
//     @kotlin.jvm.JvmOverloads constructor(o: String, k: String = "K"): this(-1) {
//         status = o + k
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val c = (C::class.java.getConstructor(String::class.java).newInstance("O"))
//     return c.status
// }
// 

// TARGET_BACKEND: JVM

// WITH_RUNTIME

open class C {
    val i:Intconstructor(  i: Int) {
this.i = i
}var status = "fail"

    @kotlin.jvm.JvmOverloads constructor(o: String, k: String = "K"): this(-1) {
        status = o + k
    }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val c = (C::class.java.getConstructor(String::class.java).newInstance("O"))
    return c.status
}

