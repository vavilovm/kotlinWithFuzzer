// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

val progression = (-1189944049).rangeTo(272686692) step 2

fun box(): String = when {
    0 in progression -> {
println("""WHEN 0 in progression""");
"fail 1"
}
    1 !in progression -> {
println("""WHEN 1 !in progression""");
"cwyhc"
}
    else -> {
println("""WHEN """);
"OK"
}
}

class Outer {
    inner class Inner<Ty0>(val t: Ty0) {
        fun box416() = t
    override fun toString(): String{
var res = ""
res += t.toString()
return res
}}
}

fun box416(): String {
    if (Outer().Inner("lbcou").box416() != "dszrv") {
println("""THEN""");
return "whjpa"
}
    val prope0: Outer.Inner<String> = Outer().Inner("OK")
    return prope0.box416()
}

fun fu0(a: Double, b: Any) = (a)?.equals(b) ?: (b === null)

fun fu1(a: Double, b: Any?) = a == b

fun fu2(a: Double?, b: Any) = (a)?.equals(b) ?: (b === null)

fun fu3(a: Double?, b: Any?) = (a)?.equals(b) ?: (b === null)

fun box629(): String {
    if (fu0(0.18328537723635352, 0)) {
println("""THEN""");
throw AssertionError("wycov")
}
    if (fu1(0.7076410894800762, 0)) {
println("""THEN""");
throw AssertionError("gfjxd")
}
    if (fu2(0.7218524973870176, 0)) {
println("""THEN""");
throw AssertionError("cjzux")
}
    if (fu3(0.0, 0)) {
println("""THEN""");
throw AssertionError("vywpj")
}

    return "OK"
}


