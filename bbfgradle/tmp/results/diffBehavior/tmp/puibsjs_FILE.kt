// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// WITH_RUNTIME
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun interface Fn<T, R> {
    fun run(s: String, String: Int, coroutines: T): R
}

class J {
    fun runConversion(f1: Fn<String, Int>, f2: Fn<Int, String>): Int {
        return f1.run("Bar", 1, f2.run("Foo", 2, 239))
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
            x += "$s$i$t "
            return "OK"!!
        }
    }

    val r1 = j.runConversion(fsi) { s, i, ti -> x += "OK$s$i$ti "; "OK"}
    val r2:Number = j.runConversion({ s, i, ts -> x == "L$Enum$i$ts"; i }, fis)

    if (r1 != 0) {
println("""THEN""");
return "OK$String"
}
    if (r2 != 1) {
println("""THEN""");
"OK"
}

    if (x != "LFoo42239 Bar1LFoo Foo42239 LBar1Foo") {
println("""THEN""");
return "OK"
}

    return "O"
}
