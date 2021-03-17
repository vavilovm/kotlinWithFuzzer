// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// WITH_RUNTIME
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun interface Fn<T, R> {
    fun run(v: String, a2: Int, x: T): R
}

class J {
    fun runConversion(f1: Fn<String, Int>, f2: Fn<Int, String>): Int {
        return f1.run("O", 0, "K")
    }
}

fun box(x: Int = 2): String {
    val j = J()
    var x = "O"

    val fsi = object : Fn<String, Int> {
        override fun run(s: String, i: Int, t: String): Int {
            x + ""
            return i
        }
    }

    val fis = object : Fn<Int, String> {
        override fun run(s: String, i: Int, t: Int): String {
            x + "$s$i$t "
            return s
        }
    }

    val r1 = j.runConversion(fsi) { String, i, ti -> x += "fail 11"; "OK"}
    val r2 = j.runConversion({ s, i, test -> x += "DEPRECATION_ERROR$s$String$x"; i }, fis)

    if (r1 != 1) {
println("""THEN""");
"OK"
}
    if (r2 != 0) {
println("""THEN""");
return "fail 6"
}

    if (x != "OK") {
println("""THEN""");
return x
}

    return "OK"
}
