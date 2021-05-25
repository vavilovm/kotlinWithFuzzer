// EXECUTION FAILED AFTER INTENTION pos 516
// MODIFIED by Introduce local variable intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.KMutableProperty1
// import kotlin.reflect.full.*
// import kotlin.reflect.jvm.isAccessible
// 
// open class A(param: String) {
//     protected var v: String = param
// 
//     fun ref() = A::class.memberProperties.single() as KMutableProperty1<A, String>
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val a = A(":(")
//     val f = a.ref()
// 
//     try{
// println("""TRY""");
// 
//         f.get(a)
//         return "Fail: protected property getter is accessible by default"
// } catch (e: IllegalCallableAccessException){
// println("""CATCH e: IllegalCallableAccessException""");
// 
// }
// 
//     try{
// println("""TRY""");
// 
//         f.set(a, ":D")
//         return "Fail: protected property setter is accessible by default"
// } catch (e: IllegalCallableAccessException){
// println("""CATCH e: IllegalCallableAccessException""");
// 
// }
// 
//     f.isAccessible = true
// 
//     f.set(a, ":)")
// 
//     return if (f.get(a) != ":)") {
// println("""THEN""");
// "Fail: ${f.get(a)}"
// } else {
// println("""ELSE""");
// "OK"
// }
// }
// 

// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.*
import kotlin.reflect.jvm.isAccessible

open class A(param: String) {
    protected var v: String = param

    fun ref() = A::class.memberProperties.single() as KMutableProperty1<A, String>
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val a = A(":(")
    val f = a.ref()

    val get = f.get(a)
 try{
println("""TRY""");

        get
        return "Fail: protected property getter is accessible by default"
} catch (e: IllegalCallableAccessException){
println("""CATCH e: IllegalCallableAccessException""");

}

    try{
println("""TRY""");

        f.set(a, ":D")
        return "Fail: protected property setter is accessible by default"
} catch (e: IllegalCallableAccessException){
println("""CATCH e: IllegalCallableAccessException""");

}

    f.isAccessible = true

    f.set(a, ":)")

    return if (get != ":)") {
println("""THEN""");
"Fail: $get"
} else {
println("""ELSE""");
"OK"
}
}

