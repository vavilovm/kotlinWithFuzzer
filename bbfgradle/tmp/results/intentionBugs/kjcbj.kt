// PSI ERROR. Modified in 82
// MODIFIED by Convert to secondary constructor intention:
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
    open inner class Inner  {

    val s1:Stringval s2:String@JvmOverloads  constructor(  s1: String,   s2: String = "OK") {
this.s1 = s1
this.s2 = s2
}override fun toString(): String{
var res = ""
return res
}}
}

fun box(): String {
    val outer = Outer()
    val c = (Outer.Inner::class.java.getConstructor(Outer::class.java, String::class.java).newInstance(outer, "shazam"))
    return c.s2
}

