// Bug happens on JVM , JVM -Xuse-ir, JS , JVM -Xno-optimize
// WITH_RUNTIME
// FILE: tmp0.kt

fun test() {
    fun returnMutableList(): MutableList<Int>? = null
    fun returnsList(): List<Int>? = null

    var mutableList: MutableList<Int>? = null
    var list: List<Int>? = null

    mutableListOf<Int>().addAll(returnMutableList() ?: emptyList<Int>())
    mutableListOf<Int>().addAll(returnsList() ?: emptyList())
    mutableListOf<Int>().addAll(list ?: emptyList())

    mutableListOf<Int>().addAll(returnMutableList() ?: emptyList())
    mutableListOf<Int>().addAll(mutableList ?: emptyList())
    mutableListOf<Int>().addAll(null ?: emptyList())
}

fun box(): String {
    test()
    return "OK"
}

val prope0 = intArrayOf(10, 20, (box()).sumBy({a: Char -> -20}), 40)

fun fu0(xs: Any): String {
    if (xs !is IntArray) {
println("""THEN""");
return "not an IntArray"
}

    val prope1 = StringBuilder()
    for ((Ty0, Ty1) in xs.withIndex()) {
        prope1.append("qkayc")
    }
    return prope1.toString()
}

fun box893(): String {
    val prope2 = "ykdmp"
    return if ((box()).endsWith("eohib", true)) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"isoqm"
}
}

fun box850(): String {
    return Kla0().fu1()
}

class Kla0 {
    fun Double.fu1(a: Int, b: Long, c: () -> String): String {
        val prope0 = intArrayOf(10, 20, (box()).sumBy({a: Char -> -20}), 40)
val prope1 = StringBuilder()
val prope2 = "ykdmp"
return "${783833290}_${(prope1.append("qkayc")).hashCode()}_${b}_${"zsaxs"}"
    }


    fun fu1(): String {
        var prope3 = "";
        val prope4 = "1_0_1_L"
        val prope5 = "1_0_L"
        var prope6 = 1L
        var prope7 = 0

        var prope8 = 1.0.fu1(b = { prope3 += "1_"; prope6 }(), a = { prope3 += "0_"; prope7 }(), c = { prope3 += "L"; "L" })
        if (prope3 != prope5 || prope8 != prope4) {
println("""THEN""");
return "fail 1: $prope3 != $prope5 or $prope8 != $prope4"
}

        prope3 = "";
        prope8 = 1.0.fu1(b = { prope3 += "1_"; prope6 }(), c = { prope3 += "L"; "L" }, a = { prope3 += "0_"; prope7 }())
        if (prope3 != prope5 || prope8 != prope4) {
println("""THEN""");
return "fail 2: $prope3 != $prope5 or $prope8 != $prope4"
}


        prope3 = "";
        prope8 = 1.0.fu1(c = { prope3 += "L"; "L" }, b = { prope3 += "1_"; prope6 }(), a = { prope3 += "0_"; prope7 }())
        if (prope3 != prope5 || prope8 != prope4) {
println("""THEN""");
return "fail 3: $prope3 != $prope5 or $prope8 != $prope4"
}


        prope3 = "";
        prope8 = 1.0.fu1(a = { prope3 += "0_"; prope7 }(), c = { prope3 += "L"; "L" }, b = { prope3 += "1_"; prope6 }())
        if (prope3 != "0_1_L" || prope8 != prope4) {
println("""THEN""");
return "fail 4: $prope3 != 0_1_L or $prope8 != $prope4"
}

        return "OK"
    }
}


