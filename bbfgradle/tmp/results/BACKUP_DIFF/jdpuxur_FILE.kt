// Bug happens on JVM , JS 
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.test.assertEquals
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
abstract class Your {
    abstract val your: String

    fun foo() = your
override fun toString(): String{
var res = ""
res += your.toString()
return res
}}

val my: String = "O"
    get() = object: Your() {
        override val your = field
    }.foo() + "K"

fun box() = my

fun box813(): String {
    val prope0 = mutableListOf<UInt>()
    val prope1 = UInt.MAX_VALUE downTo 0u
    for (i in prope1 step Int.MAX_VALUE) {
        prope0 += i
    }
    assertEquals(listOf(UInt.MAX_VALUE, 2147483648u, 1u), prope0)

    val prope2 = mutableListOf<ULong>()
    val prope3 = ULong.MAX_VALUE downTo 0uL
    for (i in prope3 step Long.MAX_VALUE) {
        prope2 += i
    }
    assertEquals(listOf(ULong.MAX_VALUE, 9223372036854775808uL, 1uL), prope2)

    return "OK"
}

fun box764(): String {
    val prope4 = ArrayList<Int>()
    prope4.add(1)
    var prope5 = prope4[0]
    var prope6 = prope4[0]
    prope4[0]--
    --prope4[0]
    prope5--
    --prope6
    if (prope4[0] != -1) {
println("""THEN""");
return "Fail: ${prope4[0]}"
}
    if (prope5 != 0) {
println("""THEN""");
return "Fail x: $prope5"
}
    if (prope6 != 0) {
println("""THEN""");
return "Fail y: $prope6"
}
    return "OK"
}

inline fun<reified Ty2> Array<Any>.fu0(): List<Ty2> {
    return this.filter { it is Ty2 }.map { it as Ty2 }
}

fun box551(): String {
    val prope7: Array<Any> = arrayOf(1,2,3.toDouble(), "abc", "cde")

    assertEquals(arrayListOf(1,2), prope7.fu0<Int>())
    assertEquals(arrayListOf(3.0), prope7.fu0<Double>())
    assertEquals(arrayListOf("abc", "cde"), prope7.fu0<String>())
    assertEquals(prope7.toList(), prope7.fu0<Any>())

    return "OK"
}

class Kla2 {
    val prope8: Int = 42
    val prope9 by Kla3(0)
override fun toString(): String{
var res = ""
res += prope8.toString()
res += prope9.toString()
return res
}}

inline class Kla3(val ignored: Int): ReadOnlyProperty<Kla2, Int> {
    override fun getValue(thisRef: Kla2, property: KProperty<*>): Int {
        return thisRef.prope8
    }
override fun toString(): String{
var res = ""
res += ignored.toString()
return res
}}

fun box339(): String {
    val prope10 = Kla2()
    if (prope10.prope9 != 42) {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}

fun fu1(p: Int?): Int {
    return when(p) {
        null -> {
println("""WHEN null""");
3
}
        else -> {
println("""WHEN """);
p!!
}
    }
}

fun box707(): String {
    return if (fu1(null) == 3) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}


