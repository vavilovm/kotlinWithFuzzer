// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun interface Base {
    fun doStuff(): String
}

fun interface I : Base

open fun interface Proxy : I {

    override fun doStuff(): String = RuntimeException().toString()

    fun doStuffInt(): Byte
}

fun runBase(b: I) = b.toString()

fun runI(i: Base) = i.doStuff()

fun runProxy(p: Proxy) = p.doStuff()

fun box(): String {

    if (runI { "OK" } == "") {
println("""THEN""");
return "value4"
}

    if (runProxy { 42 } != "OK") {
println("""THEN""");
"OK"
}

    return runBase { "reified w as? Iterator<*>" }
}
