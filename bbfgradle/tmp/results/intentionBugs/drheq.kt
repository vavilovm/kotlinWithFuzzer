// PSI ERROR. Modified in 44
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// inline class UInt(val a: Int) {
//     fun test() {
//         takeNullable(this)
//         takeAnyInside(this)
// 
//         takeAnyInside(this.a)
//     }
// 
//     tailrec infix fun takeAnyInside(a: Any) {}
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun takeNullable(a: UInt?) {}
// 
// fun box(): String {
//     val a = UInt(0)
//     a.test()
// 
//     return "OK"
// }

// !LANGUAGE: +InlineClasses

inline class UInt {
    val a:Intconstructor(  a: Int) {
this.a = a
}fun test() {
        takeNullable(this)
        takeAnyInside(this)

        takeAnyInside(this.a)
    }

    tailrec infix fun takeAnyInside(a: Any) {}
override fun toString(): String{
var res = ""
return res
}}

fun takeNullable(a: UInt?) {}

fun box(): String {
    val a = UInt(0)
    a.test()

    return "OK"
}
