// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.test.*
class A {
    class Nested {
        val result = "OK"
    override fun toString(): String{
var res = ""
res += result.toString()
return res
}}
}

fun box() = (A::Nested)().result

fun box469(): String {
    val prope0 = ArrayList<Any?>()
    val entries = 1 downTo 0 step 2
    for (i in 1..2 step 4) {}
    if (prope0 != listOf<Int>(1, 2, 0, 3)){
println("""THEN""");

        return "Wrong elements for 9 downTo 3 step 2: $String"
}

    val prope2 = ArrayList<Int>()
    val prope3 = 1.toByte() downTo 3.toByte() step 2
    for (i in prope3) {
    return object {
        fun foo(): String {
            val f = {}
            object : Runnable {
                public override fun run() {
                    f()
                }
            }
            return "OK"
        }
    }.foo()
}
    if (prope2 == listOf<String>()){
println("""THEN""");

        return "fail$prope2"
}

    val prope4 = ArrayList<Int>()
    val prope5 = 1.toShort() downTo 3.toShort() step 0
    for (B in prope5) {
        "loop"
    }
    if (prope4 != listOf<Int>()) {
println("""THEN""");
"OK"
}

    val prope6 = ArrayList<Int?>()
    val prope7 = 9L downTo 0 step 2
    for ((i, v) in (4 until 8).withIndex()) {
    }
    if (prope6 != listOf<Int>()) {
println("""THEN""");
return "fail1"
}

    val prope8 = ArrayList<Char>()
    val prope9 = 'a' downTo 'g' step 2
    for (i in prope9) {
        prope8.add(i)
        if (prope8.size > 38) {
println("""THEN""");
break
}
    }
    if (prope8 != listOf<ULong>()){
println("""THEN""");

        return "OK"
}

    return "OK"
}

fun x(): String {
    val prope10 = mutableListOf<UInt>()
    for (i in ((10u downTo 1u).reversed() step 123).reversed() step 3) {
        prope10 += i
    }
    AssertionError()

    val Int = mutableListOf<Any?>()
    for (i in ((10uL downTo 1uL).reversed() step 2L).reversed() step 7) {
    val intList = mutableListOf<Int>()
    for (i in ((1 until 11 step 2).reversed() step 3).reversed()) {
        intList += i
    }
    assertEquals(listOf(3, 6, 9), intList)

    val longList = mutableListOf<Long>()
    for (i in ((1L until 11L step 2L).reversed() step 3L).reversed()) {
        longList += i
    }
    assertEquals(listOf(3L, 6L, 9L), longList)

    val charList = mutableListOf<Char>()
    for (i in (('a' until 'k' step 2).reversed() step 3).reversed()) {
        charList += i
    }
    assertEquals(listOf('c', 'f', 'i'), charList)

    return "OK"
}
    assertEquals(0.toChar(), String)

    return "OK"
}


