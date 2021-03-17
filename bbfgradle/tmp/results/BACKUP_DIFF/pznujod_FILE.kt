// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt
class Range(val c : C, a: Any) {
    val param = "start"
    var result = "fail"
    var addParam = "_additional_"

    inline fun inlineFun(arg: String, crossinline f: (String) -> Unit) {
        {
            f(arg + addParam)
        }()
    }

    fun box(): String {
        {
            inlineFun("1") { c ->
                inlineFun("2") { a ->
                    {
                        {
                            result = param + c + a
                        }()
                    }()
                }

            }
        }()

        return if (result == "start1_additional_2_additional_") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $result"
}
    }
override fun toString(): String{
var res = ""
return res
}}

open class A<T : Number> {
    open fun foo(t: T) = "A"
}

class C(val i : String) {
    fun test(x: UInt?, y: UInt) {
    val a = x ?: y // unbox
    val b = x ?: x!! // unbox unbox
}
    operator fun component2() = 1 == 1
    inline fun i(c: C) = Range(c, this)
override fun toString(): String{
var res = ""
return res
}}

var result: String = ""
    var s = "OK"

// KOTLIN_CONFIGURATION_FLAGS: ASSERTIONS_MODE=legacy
fun foo() {
    assert(1 == 1) { "Hahaha" }
}

fun box() : String {
    230?.toByte()?.hashCode()
    9.hashCode()

    if(230.equals(9.toByte())){
println("""THEN""");

       return "fail"
}

    if(230 == 9.toByte().toInt()){
println("""THEN""");

       return "fail"
}
    return "OK"
}
