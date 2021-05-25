// PSI ERROR. Modified in 18
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// public open class Base<T>(val value: T){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// public class Box(): Base<Long>(-1)
// 
// tailrec fun box(): String {
//     val expected: Long? = -1L
//     return if (Box().value == expected) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail"
// }
// }

public open class Base<T>{
val value:Tconstructor(  value: T) {
this.value = value
}override fun toString(): String{
var res = ""
return res
}
}
public class Box(): Base<Long>(-1)

tailrec fun box(): String {
    val expected: Long? = -1L
    return if (Box().value == expected) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}
