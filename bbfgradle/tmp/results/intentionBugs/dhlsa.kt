// PSI ERROR. Modified in 52
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// inline class Composed(val s: String) {
//     private constructor(s1: String, s2: String) : this(s1 + s2)
// 
//     companion object {
//         infix fun p1(s: String) = Composed("O", s)
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box() = Composed.p1("K").s

// !LANGUAGE: +InlineClasses

inline class Composed( s: String) {
    val s = sprivate constructor(s1: String, s2: String) : this(s1 + s2)

    companion object {
        infix fun p1(s: String) = Composed("O", s)
    }
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box() = Composed.p1("K").s
