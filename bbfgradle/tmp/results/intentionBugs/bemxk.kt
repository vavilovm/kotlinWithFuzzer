// COMPILE != OK. Modified in 238
// MODIFIED by Convert to run intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.jvm.isAccessible
// 
// enum class E
// 
// tailrec fun box(): String {
//     try{
// println("""TRY""");
// 
//         val c = E::class.constructors.single()
//         c.isAccessible = true
//         c.call()
//         return "Fail: constructing an enum class should not be allowed"
// }
//     catch (e: Throwable){
// println("""CATCH e: Throwable""");
// 
//         return "OK"
// }
// }
// 

// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.jvm.isAccessible

enum class E

tailrec fun box(): String {
    try{
println("""TRY""");

        val c = E::class.constructors.single()
        this.isAccessible = true
        c.run {
        isAccessible = true
        call()}
        return "Fail: constructing an enum class should not be allowed"
}
    catch (e: Throwable){
println("""CATCH e: Throwable""");

        return "OK"
}
}

