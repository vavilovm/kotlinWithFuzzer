// PSI ERROR. Modified in 54
// MODIFIED by Move to class body intention:
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

open class C( i: Int) {
    val i = ivar status = "fail"

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

