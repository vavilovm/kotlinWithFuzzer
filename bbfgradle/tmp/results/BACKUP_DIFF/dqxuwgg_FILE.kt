// Bug happens on JVM , JS 
// FILE: tmp0.kt


import kotlin.reflect.KProperty0
fun foo(block: (String, String, String) -> String): String = block("O", "fail", "K")

fun box() = foo { x, _, y -> x + y }

var prope0 = 0

class Kla0 {
    val prope1: String
        get() = if (prope0 == 1) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail $prope0"
}
override fun toString(): String{
var res = ""
res += prope1.toString()
return res
}}

fun fu0(prope1: KProperty0<String>): String {
    prope1.get()
    return prope1.get()
}

fun box618(): String {
    return fu0(({ prope0++; Kla0() }())::prope1)
}

inline class Kla1(private val direction: Int) {
    fun fu1() = fu1[direction]
    fun fu2() = fu2[direction]

    companion object Kla2 {
        private val fu1 = intArrayOf(0, 1, 0, -1)
        private val fu2 = intArrayOf(-1, 0, 1, 0)
    }
override fun toString(): String{
var res = ""
res += direction.toString()
return res
}}

fun box940(): String {
    val prope2 = arrayOf(Kla1(0), Kla1(1), Kla1(2), Kla1(3))
    val prope3 = intArrayOf(0, 1, 0, -1)
    val prope4 = intArrayOf(-1, 0, 1, 0)
    for (i in 0 .. 3) {
        if (prope2[i].fu1() != prope3[i]) {
println("""THEN""");
throw AssertionError()
}
        if (prope2[i].fu2() != prope4[i]) {
println("""THEN""");
throw AssertionError()
}
    }

    return "OK"
}

class Kla3(val result: String){
override fun toString(): String{
var res = ""
res += result.toString()
return res
}
}

fun box455() = (::Kla3)("OK").result

fun fu17(): Int {
    var prope11 = 0
    loop@ for (i in 1..10) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu18(): Int {
    var prope11 = 0
    val prope12: Byte = 1
    val prope13: Byte = 10
    loop@ for (i in prope12..prope13) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu19(): Int {
    var prope11 = 0
    val prope12: Long = 1
    val prope13: Long = 10
    loop@ for (i in prope12..prope13) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu20(): Int {
    val prope14 = ArrayList<Int>()
    prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0)
    prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0)
    var prope11 = 0
    loop@ for (i in prope14) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu21(): Int {
    val prope14 = ArrayList<Byte>()
    prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0)
    prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0)
    var prope11 = 0
    loop@ for (i in prope14) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu22(): Int {
    val prope14 = ArrayList<Long>()
    prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0)
    prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0); prope14.add(0)
    var prope11 = 0
    loop@ for (i in prope14) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu23(): Int {
    val prope14 = ArrayList<Double>()
    prope14.add(0.0); prope14.add(0.0); prope14.add(0.0); prope14.add(0.0); prope14.add(0.0)
    prope14.add(0.0); prope14.add(0.0); prope14.add(0.0); prope14.add(0.0); prope14.add(0.0)
    var prope11 = 0
    loop@ for (i in prope14) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu24(): Int {
    val prope14 = ArrayList<Any>()
    prope14.add(0.0); prope14.add(0.0); prope14.add(0.0); prope14.add(0.0); prope14.add(0.0)
    prope14.add(0.0); prope14.add(0.0); prope14.add(0.0); prope14.add(0.0); prope14.add(0.0)
    var prope11 = 0
    loop@ for (i in prope14) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu25(): Int {
    val prope14 = arrayOfNulls<String>(10)
    var prope11 = 0
    loop@ for (i in prope14) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun fu26(): Int {
    val prope14 = IntArray(10)
    var prope11 = 0
    loop@ for (i in prope14) {
        if (prope11 >= 5) {
println("""THEN""");
continue@loop
}
        prope11++
    }
    return prope11
}

fun box674(): String {
    if (fu17() != 5) {
println("""THEN""");
return "fail 1"
}
    if (fu18() != 5) {
println("""THEN""");
return "fail 2"
}
    if (fu19() != 5) {
println("""THEN""");
return "fail 3"
}
    if (fu26() != 5) {
println("""THEN""");
return "fail 4"
}
    if (fu25() != 5) {
println("""THEN""");
return "fail 5"
}
    if (fu20() != 5) {
println("""THEN""");
return "fail 6"
}
    if (fu21() != 5) {
println("""THEN""");
return "fail 7"
}
    if (fu22() != 5) {
println("""THEN""");
return "fail 8"
}
    if (fu23() != 5) {
println("""THEN""");
return "fail 9"
}
    return "OK"
}

fun fu27(b: Byte, s: String, i: Int, d: Double, li: Long): String = "$b $s $i $d $li"

fun box440(): String {
    val prope15 = fu27(1, "abc", 1, 1.0, try {
println("""TRY""");
1L
} catch (e: Exception) {
println("""CATCH e: Exception""");
10L
})
    if (prope15 != "1 abc 1 1.0 1") {
println("""THEN""");
return "Failed, test==$prope15"
}

    return "OK"
}


