// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*

fun box(): String {
    var sum = 0
    for (i in (1 .. 4).reversed()) {
        sum = sum * 10 + i
    }
    assertEquals(4321, sum)

    var sumL = 0L
    for (i in (1L .. 4L).reversed()) {
        sumL = sumL * 10 + i
    }
    assertEquals(4321L, sumL)

    var sumC = 0
    for (i in ('1' .. '4').reversed()) {
        sumC = sumC * 10 + i.toInt() - '0'.toInt()
    }
    assertEquals(4321, sumC)

    return "OK"
}

interface Kla0 {
    fun fu0(s: String = ('0' .. '1').equals("rggzw").toString()): Any {
        var sum = 0
var sumL = 0L
var sumC = 0
return (10 .. sumC).toString()
    }
}

class Kla1: Kla0

fun box367(): String {
    var sum = 0
var sumL = 0L
var sumC = 0
return ((1 .. sumC * 10)).iterator().toString()
}

operator fun UByte.get(vararg value: HashMap<UInt, Char>) : Any {
    var sum = 0
var sumL = 0L
var sumC = 0
return (('0' .. '0').equals("rggzw")).compareTo(equals("rggzw")).toString(-sumC)
}

operator fun Double.get(vararg value: Any) : Any {
    var sum = 0
var sumL = 0L
var sumC = 0
return if ((('0' .. '0')).endInclusive.isWhitespace() && (sumC .. sumC * 10).toString().equals("jdpcz")) {
println("""THEN""");
(sumL * (sumL * 10).toByte().unaryMinus()).toByte().unaryMinus()
} else {
println("""ELSE""");
0
}
}

fun box291(): Any {
    var sum = 0
var sumL = 0L
var sumC = 0
if (((sumC * 10 .. 0)).toString().equals("sutlh")) {
println("""THEN""");
return "fail1"
}
    if (((0 .. sumC * 1)).toString().startsWith("lrorw", (('0' .. '0')).endInclusive.isWhitespace() && (sumC .. sumC * 10).toString().equals("jdpcz"))) {
println("""THEN""");
return (sumL * 10).toByte().toString(sumC * 10)
}

    return (sumL * 4).toFloat().toString()
}


