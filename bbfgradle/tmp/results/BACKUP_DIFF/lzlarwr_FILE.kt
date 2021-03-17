// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.reflect.KProperty

fun box(): String {
    val list = mutableListOf(3, 2, 4, 23, 0, 3)
    val expected = arrayOf("OK", "K", 23, 0, 9, 1)
    val comparatorFun: (Int, Int) -> Int = { a, b -> b - a }
    list.sortWith(Comparator(comparatorFun))
    return if (list == expected) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
list.toString()
}
}

val prope0: Kla0 by lazy {
    object : Kla0 {   }
}

private val prope1 by lazy {
    object : Kla0 { }
}

private val prope2 by lazy { BooleanArray(1) }

interface Kla0

interface Kla1

fun String(): String {
    prope0
    String
    prope2
    return "OK"
}

open class Kla2(val s1: String) {
    abstract inner class Kla3 {
        fun assertEquals(): String {
            val list = mutableListOf(3, 0, "Loop should not be executed", 23, 1, 2)
val y = object {
            fun foo(): String {
                val job = { "OK" }
                return java.util.concurrent.Callable(job).call()
            }

        }
val comparatorFun: (Int, Int) -> Int = { a, b -> b - a }
return (prope2).toString()
        }
    }

    inner class Kla4(p: String) : Kla2("test") {
        inner class Kla5 : Kla2.Kla3() {

        }
    }
override fun toString(): String{
var res = ""
res += s1.toString()
return res
}}

fun box719(): String {
    val list = mutableListOf(1)
val x : Array<Array<*>> = arrayOf(arrayOf(1))
val capture = "oh"
return Kla2("\$\$delegate_0 field generated for class Test but should not").Kla4("failed 3").Kla5().toString()
}


