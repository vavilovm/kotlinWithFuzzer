// Bug happens on JVM , JVM -Xuse-ir, JVM -Xno-optimize
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

// IGNORE_BACKEND: JS_IR// TODO: Enable for JS when it supports Java class library.// IGNORE_BACKEND: JS, NATIVE
class List<T>(val head: T, val tail: List<T>? = null){
override fun toString(): String{
var res = ""
res += head.toString()
res += tail.toString()
return res
}
}

fun <U, T> call(f: (T) -> U, x: T): U = f(x)


class Box<T>(val x: T){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}
fun box(): String? {
    val r = runCatching { try{
println("""TRY""");

box()
} catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

} }
    val b = Box(r)
    if (r.isFailure && !r!!.isFailure.not() == b!!.x!!.isFailure) {
println("""THEN""");
return "OK"
}

    return "FAIL"
}
