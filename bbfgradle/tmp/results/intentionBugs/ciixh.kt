// PSI ERROR. Modified in 50
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// public inline class Composed(val s: String) {
//     private constructor(s1: String, s2: String) : this(s1 + s2)
// 
//     companion object {
//         tailrec infix fun p1(s: String) = Composed("O", s)
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box() = Composed.p1("K").s

// !LANGUAGE: +InlineClasses

public inline class Composed {
    val s:Stringconstructor(  s: String) {
this.s = s
}private constructor(s1: String, s2: String) : this(s1 + s2)

    companion object {
        tailrec infix fun p1(s: String) = Composed("O", s)
    }
override fun toString(): String{
var res = ""
return res
}}

fun box() = Composed.p1("K").s
