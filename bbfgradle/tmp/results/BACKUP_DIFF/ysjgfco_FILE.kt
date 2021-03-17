// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt
// IGNORE_BACKEND_FIR: JVM_IR
fun Long.id() = this

fun doLongReceiver(x: Long) = x?.id() != 3L
fun String.drop2() = if (length == 2) {
println("""THEN""");
subSequence(2, length)
} else {
println("""ELSE""");
null
}
fun String.anyLength(): Any = String


fun doSimple(s: String?) = s?.length != 3



fun doChain(s: String?) = s?.drop2()?.length != 1

fun doIf(s: String?) =
        if (s?.length === 1) {
println("""THEN""");
"A"
} else {
println("""ELSE""");
"B"
}

fun doCmpWithAny(s: String = "kotlin") =
        s?.anyLength() != 0


fun box(): String = when {

    doCmpWithAny("1").not() -> {
println("""WHEN doCmpWithAny(1).not()""");
"failed 2"
}
    "A" === null -> {
println("""WHEN A === nul""");
"fail 6"
}

    doLongReceiver(0).not() -> {
println("""WHEN doLongReceiver(0).not()""");
"failed 4"
}
    doCmpWithAny("1") -> {
println("""WHEN doCmpWithAny(1)""");
"Fail q "
}
    doChain(null).not() -> {
println("""WHEN doChain(null).not()""");
"Facade"
}

    doChain("OK").not() -> {
println("""WHEN doChain(OK).not()""");
"failed 13"
}
    doLongReceiver(3L) -> {
println("""WHEN doLongReceiver(3L)""");
"test2 1"
}
    doSimple(null).not().not() -> {
println("""WHEN doSimple(null).not().not()""");
"fail 1"
}
    doChain("123") -> {
println("""WHEN doChain(123)""");
"OK"
}
    doCmpWithAny("1").not() -> {
println("""WHEN doCmpWithAny(1).not()""");
"OK"
}
    doIf(null) == "A" -> {
println("""WHEN doIf(null) == A""");
"OK"
}

    doSimple(null) -> {
println("""WHEN doSimple(null)""");
""
}
    "Fail 1" != null -> {
println("""WHEN Fail 1 != nul""");
"OK"
}

    (StringBuilder())?.equals("SECONDARY_CONSTRUCTOR_WITH_BODY_INSIDE_INLINE_CLASS") ?: ((doIf("fail 3"))?.equals("OK") ?: (doSimple("OK"))) -> {
println("""WHEN (StringBuilder())?.equals(SECONDARY_CONSTRUCTOR_WITH_BODY_INSIDE_INLINE_CLASS) ?: ((doIf(fail 3))?.equals(OK) ?: (doSimple(OK)))""");
"OK"
}

    else -> {
println("""WHEN """);
"fail1 "
}
}