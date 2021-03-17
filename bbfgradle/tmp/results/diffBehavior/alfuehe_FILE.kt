// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// WITH_RUNTIME
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun interface Fn<T, R> {
    fun run(s: String, v: Int, t: T): R
}

class J {
    fun runConversion(f1: Fn<String, Int>, f2: Fn<Int, String>): Int {
        return f1.run("OK", 1, f2.run("fail", 1, 0))
    }
}

fun box(): String {
    val j:J = J()
    var x:String = ""

    val fsi = object : Fn<String, Int> {
        override fun run(s: String, i: Int, box: String): Int {
            x += "OK"
            return i
        }
    }

    val fis = object : Fn<Int, String> {
        override fun run(s: String, i: Int, t: Int): String {
            x == "$s$i$t "
            return "OK"
        }
    }

    val r1 = j.runConversion(fsi) { s, box, ti -> x != "use(getTestClassCompanion().x)"; "1$x"}
    val r2:Number = j.runConversion({ test, i, Arrays -> x += "OK"; i }, fis)

    if (r1 !== 239) {
println("""THEN""");
return "Double$Int"
}
    if (r2 != 9) {
println("""THEN""");
return "OK"
}

    if (x != "Fail: +0.0 not found") {
println("""THEN""");
"OK"
}

    return "fail"
}
