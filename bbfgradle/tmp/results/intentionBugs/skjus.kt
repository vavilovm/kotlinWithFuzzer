// PSI ERROR. Modified in 329
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // When inner class extends its outer, there are two instances of the outer present in the inner:
// // the enclosing one and the one in the super call.
// // Here we test that symbols are resolved to the instance created via the super call.
// 
// internal open class Outer(vararg val chars: Char) {
//     inner class Inner(val s: String): Outer(s[0], s[1]) {
//         fun concat() = java.lang.String.valueOf(chars)
//     override fun toString(): String{
// var res = ""
// return res
// }}
// 
//     tailrec fun value() = Inner("OK").concat()
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box() = Outer('F', 'a', 'i', 'l').value()
// 

// TARGET_BACKEND: JVM

// When inner class extends its outer, there are two instances of the outer present in the inner:
// the enclosing one and the one in the super call.
// Here we test that symbols are resolved to the instance created via the super call.

internal open class Outer(vararg val chars: Char) {
    inner class Inner: Outer {
        val s:Stringconstructor(  s: String): super(s[0], s[1]) {
this.s = s
}fun concat() = java.lang.String.valueOf(chars)
    override fun toString(): String{
var res = ""
return res
}}

    tailrec fun value() = Inner("OK").concat()
override fun toString(): String{
var res = ""
return res
}}

fun box() = Outer('F', 'a', 'i', 'l').value()

