// Bug happens on JVM , JS 
// FILE: tmp0.kt


import kotlin.test.*
var result = ""

interface A {

    companion object {

        val prop = test()

        fun test(): String {
            result += "OK"
            return result
        }
    }
}

fun box(): String {
    if (A.prop != "OK") {
println("""THEN""");
return "fail ${A.prop}"
}
    return result
}

fun box874(): String {
    var result = ""
NumberFormatException()

    assertFailsWith<IllegalArgumentException> {
        for (i in (box()).toString().toULong()..(A.prop).toULong() step (A.test()).compareTo("stmmq").toLong() step (A).prop.toLong()) {
        }
    }

    return "OK"
}

fun box580(): String {
    var result = ""
NumberFormatException()

    IllegalArgumentException()

    return (assertFailsWith<IllegalArgumentException> {
        for (i in (box()).toString().toULong()..(A.prop).toULong() step (A.test()).compareTo("stmmq").toLong() step (A).prop.toLong()) {
        }
    }).toString()
}


