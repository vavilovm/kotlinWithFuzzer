// PSI ERROR. Modified in 108
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_RUNTIME
// 
// class Outer {
//     open inner class Inner @JvmOverloads constructor(val s1: String, val s2: String = "OK") {
// 
//     override fun toString(): String{
// var res = ""
// return res
// }}
// }
// 
// fun box(): String {
//     val outer = Outer()
//     val c = (Outer.Inner::class.java.getConstructor(Outer::class.java, String::class.java).newInstance(outer, "shazam"))
//     return c.s2
// }
// 

// TARGET_BACKEND: JVM

// WITH_RUNTIME

class Outer {
    open inner class Inner @JvmOverloads constructor( s1: String, val s2: String = "OK") {

    val s1 = s1override fun toString(): String{
var res = ""
return res
}}
}

fun box(): String {
    val outer = Outer()
    val c = (Outer.Inner::class.java.getConstructor(Outer::class.java, String::class.java).newInstance(outer, "shazam"))
    return c.s2
}

