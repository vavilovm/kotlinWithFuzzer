// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NewInference, +FunctionReferenceWithDefaultValueAsOtherType
// FILE: tmp.kt

class Outer(val o: String) {
    inner class Inner1(val i: Int, vararg v: String) {
        val result = "I1" + o + i + if (v.size == 0) {
println("""THEN""");
"E"
} else {
println("""ELSE""");
v[0]
}
    override fun toString(): String{
var res = ""
res += i.toString()
res += result.toString()
return res
}}

    inner class Inner2(val i: Int, vararg v: String = arrayOf("A")) {
        val result = "I2" + o + i + v[0]
    override fun toString(): String{
var res = ""
res += i.toString()
res += result.toString()
return res
}}
override fun toString(): String{
var res = ""
res += o.toString()
return res
}}

fun <T> use0(f: (Int) -> T) = f(11)
fun <T> use1(f: (Int, String) -> T) = f(12, "B")

fun box(): String {
    val oouter = Outer("O")

    val r1 = use0(oouter::Inner1).result
    if (r1 != "I1O11E") {
println("""THEN""");
return "Fail1: $r1"
}

    val r2 = use1(oouter::Inner1).result
    if (r2 != "I1O12B") {
println("""THEN""");
return "Fail2: $r2"
}

    val r3 = use0(oouter::Inner2).result
    if (r3 != "I2O11A") {
println("""THEN""");
return "Fail3: $r3"
}

    val r4 = use1(oouter::Inner2).result
    if (r4 != "I2O12B") {
println("""THEN""");
return "Fail4: $r4"
}

    return "OK"
}

fun fu0() {
    val oouter = Outer("O")
val r1 = use0(oouter::Inner1).result
val r2 = use1(oouter::Inner1).result
val r3 = use0(oouter::Inner2).result
val r4 = use1(oouter::Inner2).result
val prope0 = runCatching<String>({ "hejkw"})
    val prope1 = runCatching<String>({ "mbqln"})
    if (runCatching<String>({ "yovtl"}) == runCatching<String>({ "khrow"})) {
println("""THEN""");
println((use1(oouter::Inner1)).result.substring(594209961))
}
    if ((Outer("hdkks").o).all({a: Char -> (Outer("hdkks").o).all({a: Char -> true})})) {
println("""THEN""");
println((HashMap<Outer?, Outer>()).size.toString(1792527176))
}
}

interface Kla0 {
    private val prope2: String
        get() = "O"

    private fun fu1(): String {
        return "K"
    }

    companion object Kla2 {
        fun fu2(test: Kla0): String {
            return test.prope2 + test.fu1()
        }
    }
}

class Kla1 : Kla0

fun box957(): String {
    return Kla0.fu2(Kla1())
}


