// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt



fun box() = (-10.toLong() as Long?)!!.hashCode()

// IGNORE_BACKEND_FIR: JVM_IR
class A {
    var a: String = "Fail"

    init {
        open class B() {
            open fun s() : String = "O"
        }

        val o = object : B() {
            override fun s(): String = "K"
        }

        a = B().s() + o.s()
    }
override fun toString(): String{
var res = ""
return res
}}


// WITH_RUNTIME
// FILE: test.kt
fun test() {
    val result = Result.success("yes!")
    val failure = Result.failure<String>(Exception())

    if (result.isSuccess) {
println("""THEN""");
println("success")
}
    if (result.isFailure) {
println("""THEN""");
println("failure")
}
    println(result.getOrThrow())
    println(failure.getOrNull())
    println(failure.exceptionOrNull())

    println(result.hashCode())
    println(result.toString())

    println(result.getOrElse { "oops" })
    println(result.getOrDefault("oops"))
}

