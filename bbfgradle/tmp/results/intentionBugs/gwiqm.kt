// PSI ERROR. Modified in 68
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // See also KT-6299
// public abstract class Outer private constructor(val s: String, vararg i: Int) {
//     class Inner: Outer("xyz")
//     class Other: Outer("abc", 1, 2, 3)
//     class Another: Outer("", 42)
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box(): String {
//     val outer = Outer.Inner()
//     val other = Outer.Other()
//     val another = Outer.Another()
//     return "OK"
// }

// See also KT-6299
public abstract class Outer private constructor( s: String, vararg i: Int) {
    val s = sclass Inner: Outer("xyz")
    class Other: Outer("abc", 1, 2, 3)
    class Another: Outer("", 42)
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box(): String {
    val outer = Outer.Inner()
    val other = Outer.Other()
    val another = Outer.Another()
    return "OK"
}
