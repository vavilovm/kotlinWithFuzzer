// EXECUTION DIFFERENT. Modified in 73.
// Original:
// OK
// 
// new:
// THEN
// ctor: null
// 
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_REFLECT
// package test
// 
// open class C {
//     val l: Any = {}
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val javaClass = C().l.javaClass
//     val enclosingConstructor = javaClass.getEnclosingConstructor()
//     if (enclosingConstructor?.getDeclaringClass()?.getName() != "test.C") {
// println("""THEN""");
// return "ctor: $enclosingConstructor"
// }
// 
//     val enclosingClass = javaClass.getEnclosingClass()
//     if (enclosingClass?.getName() != "test.C") {
// println("""THEN""");
// return "enclosing class: $enclosingClass"
// }
// 
//     val declaringClass = javaClass.getDeclaringClass()
//     if (declaringClass != null) {
// println("""THEN""");
// return "anonymous function has a declaring class: $declaringClass"
// }
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM

// WITH_REFLECT
package test

open class C {
    val l: Any by lazy { {} }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val javaClass = C().l.javaClass
    val enclosingConstructor = javaClass.getEnclosingConstructor()
    if (enclosingConstructor?.getDeclaringClass()?.getName() != "test.C") {
println("""THEN""");
return "ctor: $enclosingConstructor"
}

    val enclosingClass = javaClass.getEnclosingClass()
    if (enclosingClass?.getName() != "test.C") {
println("""THEN""");
return "enclosing class: $enclosingClass"
}

    val declaringClass = javaClass.getDeclaringClass()
    if (declaringClass != null) {
println("""THEN""");
return "anonymous function has a declaring class: $declaringClass"
}

    return "OK"
}

