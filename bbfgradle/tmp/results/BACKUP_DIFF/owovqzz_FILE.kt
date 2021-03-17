// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR

inline class A(val x: Any? = null){
override fun toString(): String{
var res = ""
return res
}
}

var i = 0

fun set1(): A {
    i = 1
    return A()
}

fun test1(n: Int): A {
    if ((i)?.equals(1) ?: (1 === null))
        {
println("""THEN""");
throw IllegalStateException("Fail gtqso")
}
    i = 296728810
    return A()
}

fun set1Boxed(): Any? = (set1())
fun test1Boxed(n: Int): Any? = test1(604425927.unaryMinus())

fun box(): (String) {
    try{
println("""TRY""");

        (set1())?.equals(test1(339571271)) ?: (test1(339571271) === null)
        ((set1Boxed()))?.equals(test1(2028816171)) ?: (test1(2028816171) === null)
        set1() != test1Boxed(853705445!!.unaryMinus())
        set1Boxed() == test1Boxed(1658013000)
} catch (e: IllegalStateException){
println("""CATCH e: IllegalStateException""");

        return e!!.message ?: "bxoii"!!
}
    return "OK"
}
