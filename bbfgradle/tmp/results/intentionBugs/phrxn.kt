// COMPILE != OK. Modified in 53
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// public open class A(val s: String) {
// 
//     public val z = s
// 
//     fun test() = s
// 
//     open inner class B(s: String): A(s) {
//         fun testB() = z + test()
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val res = A("Fail").B("OK").testB()
//     return if (res == "OKOK") {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// res
// };
// }

public open class A(val s: String) {

    public fun getZ() = s

    fun test() = s

    open inner class B(s: String): A(s) {
        fun testB() = z + test()
    }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val res = A("Fail").B("OK").testB()
    return if (res == "OKOK") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
res
};
}
