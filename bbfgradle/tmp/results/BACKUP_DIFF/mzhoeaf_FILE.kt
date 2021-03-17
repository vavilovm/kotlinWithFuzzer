// Bug happens on JVM , JVM -Xuse-ir, JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*

fun box(): String {
    val intList = mutableListOf<Int>()
    for (i in Int.MIN_VALUE until Int.MAX_VALUE step Int.MAX_VALUE) {
        intList += i
    }
    assertEquals(listOf(Int.MIN_VALUE, -1, Int.MAX_VALUE - 1), intList)

    val longList = mutableListOf<Long>()
    for (i in Long.MIN_VALUE until Long.MAX_VALUE step Long.MAX_VALUE) {
        longList += i
    }
    assertEquals(listOf(Long.MIN_VALUE, -1L, Long.MAX_VALUE - 1), longList)

    return "OK"
}

fun fu0(vararg s: String) = s[1]

fun box284(): String =
    (Int).toString()

inline class Kla0(val x: Any?){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

interface Kla1 {
    fun fu1(): Any
}

interface Kla2 : Kla1 {
    fun fu2(): Any
    override fun fu1(): Kla0
}

class Kla3 : Kla2 {
    override fun fu2(): Kla0 = Kla0("O")
    override fun fu1(): Kla0 = Kla0("K")
}

fun box343(): String {
    val intList = mutableListOf<Int>()
val longList = mutableListOf<Long>()
val prope0: Kla2 = Kla3()
    val prope1 = "uwjga"
    if ((Int.MIN_VALUE until Int.MAX_VALUE).toString().startsWith("xgrut", false)){
println("""THEN""");

        throw AssertionError(((Int)).MAX_VALUE.toString(109733017))
}

    val prope2: Kla1 = Kla3()
    val prope3 = prope0.fu1()
    if (prope3 !is Kla0){
println("""THEN""");

        throw AssertionError()
}

    return (Int.MIN_VALUE).toDouble().toString()
}

fun box886(): String {
    val intList = mutableListOf<Int>()
val longList = mutableListOf<Long>()
val prope0: Kla2 = Kla3()
val prope1 = "uwjga"
val prope2: Kla1 = Kla3()
val prope3 = prope0.fu1()
return Kla4().fu3((Long).toString())
}

class Kla4() {
    val prope4 : (str : String) -> String = {a: String -> "lxjvd"}

    fun fu3(str : String): String {
        val intList = mutableListOf<Int>()
val longList = mutableListOf<Long>()
val prope0: Kla2 = Kla3()
val prope1 = "uwjga"
val prope2: Kla1 = Kla3()
val prope3 = prope0.fu1()
return (Int.MIN_VALUE).toChar().toString();
    }
override fun toString(): String{
var res = ""
return res
}}


