// COMPILE != OK. Modified in 60
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_RUNTIME
// 
// open class A {
//     @JvmField public val field = "OK";
// 
//     companion object {
//         @JvmField public val cfield = "OK";
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// object Object {
//     @JvmField val field = "OK";
// }
// 
// 
// fun box(): String {
//     var result = A().field
// 
//     if (result != "OK") {
// println("""THEN""");
// return "fail 1: $result"
// }
//     if (A.cfield != "OK") {
// println("""THEN""");
// return "fail 2: ${A.cfield}"
// }
//     if (Object.field != "OK") {
// println("""THEN""");
// return "fail 3: ${Object.field}"
// }
// 
//     return "OK"
// 
// }
// 

// TARGET_BACKEND: JVM

// WITH_RUNTIME

open class A {
    @JvmField public val field by lazy { "OK" };

    companion object {
        @JvmField public val cfield = "OK";
    }
override fun toString(): String{
var res = ""
return res
}}

object Object {
    @JvmField val field = "OK";
}


fun box(): String {
    var result = A().field

    if (result != "OK") {
println("""THEN""");
return "fail 1: $result"
}
    if (A.cfield != "OK") {
println("""THEN""");
return "fail 2: ${A.cfield}"
}
    if (Object.field != "OK") {
println("""THEN""");
return "fail 3: ${Object.field}"
}

    return "OK"

}

