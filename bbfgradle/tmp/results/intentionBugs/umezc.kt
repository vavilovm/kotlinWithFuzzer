// PSI ERROR. Modified in 43
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// inline class UInt(private val data: Int) {
//     fun result(): String = if (data == 1) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail"
// }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun f(): UInt {
//     val unull = UInt(1) ?: null
//     return nonNull(unull)
// }
// 
// fun nonNull(u: UInt?) = u!!
// 
// fun box(): String {
//     return f().result()
// }

// !LANGUAGE: +InlineClasses

inline class UInt {
    private  val data:Intconstructor(  data: Int) {
this.data = data
}fun result(): String = if (data == 1) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
override fun toString(): String{
var res = ""
return res
}}

tailrec fun f(): UInt {
    val unull = UInt(1) ?: null
    return nonNull(unull)
}

fun nonNull(u: UInt?) = u!!

fun box(): String {
    return f().result()
}
