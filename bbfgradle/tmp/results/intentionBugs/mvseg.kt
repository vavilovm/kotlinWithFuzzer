// COMPILE != OK. Modified in 529
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_RUNTIME
// 
// import kotlin.reflect.KCallable
// 
// private fun check(label: String, fn: Any) {
//     if (fn !is KCallable<*>){
// println("""THEN""");
// 
//         throw AssertionError("$label is not KCallable, ${fn::class.java.simpleName}")
// }
// }
// 
// tailrec fun checkVarargAsArray(label: String, fn: (IntArray) -> C) = check(label, fn)
// 
// tailrec fun withVarargs(vararg xs: Int): C = C(*xs)
// class C(vararg xs: Int)
// 
// fun box(): String {
//     checkVarargAsArray("::withVarargs", ::withVarargs)
//     checkVarargAsArray("::C", ::C)
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_RUNTIME

import kotlin.reflect.KCallable

private fun check(label: String, fn: Any) {
    if (fn !is KCallable<*>){
println("""THEN""");

        throw AssertionError("$label is not KCallable, ${fn::class.java.simpleName}")
}
}

tailrec fun checkVarargAsArray(label: String, fn: (IntArray) -> C) = check(label, fn)

tailrec fun withVarargs(vararg xs: Int): C = C(*xs)
class C(vararg xs: Int)

fun box(): String {
    checkVarargAsArray("::withVarargs", ::withVarargs)
    checkVarargAsArray("::C" ){ C(it) }

    return "OK"
}

