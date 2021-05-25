// PSI ERROR. Modified in 72
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// 
// abstract class BaseGeneric<T>(val t: T) {
//     abstract fun iterate()
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// private class Derived<T>(t: List<T>) : BaseGeneric<List<T>>(t) {
//     var test = 0
// 
//     override fun iterate() {
//         test = 0
//         for (i in t.indices) {
//             test = test * 10 + (i + 1)
//         }
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val t = Derived(listOf("", "", "", ""))
//     t.iterate()
//     return if (t.test == 1234) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "Fail: ${t.test}"
// }
// }
// 

// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

abstract class BaseGeneric<T>( t: T) {
    val t = tabstract fun iterate()
override fun toString(): String{
var res = ""
return res
}}

private class Derived<T>(t: List<T>) : BaseGeneric<List<T>>(t) {
    var test = 0

    override fun iterate() {
        test = 0
        for (i in t.indices) {
            test = test * 10 + (i + 1)
        }
    }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val t = Derived(listOf("", "", "", ""))
    t.iterate()
    return if (t.test == 1234) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail: ${t.test}"
}
}

