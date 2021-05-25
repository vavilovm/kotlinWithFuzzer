// PSI ERROR. Modified in 26
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// public open class Base<T>(val value: T){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// class Box(): Base<Long>(-1)
// 
// fun box(): String {
//     val expected: Long? = -1L
//     return if (Box().value == expected) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail"
// }
// }

public open class Base<T>( value: T){
val value = valueoverride fun toString(): String{
var res = ""
return res
}
}
class Box(): Base<Long>(-1)

fun box(): String {
    val expected: Long? = -1L
    return if (Box().value == expected) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}
