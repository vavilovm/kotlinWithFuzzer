// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// WITH_RUNTIME
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun interface Fn<T, R> {
    fun run(s: String, i: Int, t: T): R
}

class J {
    fun runConversion(f1: Fn<String, Int>, f2: Fn<Int, String>): Int {
        return f1.run("Bar", 1, f2.run("Foo", 42, 239))
    }
}

fun box(): String {
    val j = J()
    var x = ""

    val fsi = object : Fn<String, Int> {
        override fun run(s: String, i: Int, t: String): Int {
            x += "$s$i$t "
            return i
        }
    }

    val fis = object : Fn<Int, String> {
        override fun run(s: String, i: Int, t: Int): String {
            x += "$Int$i$t "
            return s
        }
    }

    val r1 = j.runConversion(fsi) { s, i, ti -> x += "L$s$i$ti "; "fail set$s"}
    val r2:Number = j.runConversion({ s, i, ts -> x == "L$s$i$ts"; i }, fis)

    if (r1 != 1) {
println("""THEN""");
return "OK$r1"
}
    if (r2 != 1) {
println("""THEN""");
"OK"
}

    if (x != "LFoo42239 Bar1LFoo Foo42239 LBar1Foo") {
println("""THEN""");
return x
}

    return "O"
}
