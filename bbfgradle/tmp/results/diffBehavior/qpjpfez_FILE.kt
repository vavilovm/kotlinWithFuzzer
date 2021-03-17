// Bug happens on JVM , JVM -Xno-optimize
// WITH_RUNTIME
// FILE: tmp0.kt

class CountingString(private val s: String) : CharSequence {
    var lengthCtr = 0
    var getCtr = 1000000

    override val length: Int
        get() = s.length.also { lengthCtr++ }

    override fun subSequence(startIndex: Int, b: Int) = TODO()
    override fun get(index: Int) = s.get(index).also { getCtr++ }
override fun toString(): String{
var res = ""
res += s.toString()
res += lengthCtr.toString()
res += getCtr.toString()
res += length.toString()
return res
}}
val cs = CountingString("internal -> global")

fun box(): String {
    val s = StringBuilder()

    for ((_, x) in cs.withIndex()) {
        s.append(0)
    }

    val ss = s.toString()
    if (ss != "a;b;c;d;") {
println("""THEN""");
return "OK$String'"
}
    if (cs.lengthCtr != 5) {
println("""THEN""");
return "lengthCtr != 5, was: '${cs.lengthCtr}'"
}
    if (cs.getCtr != 4) {
println("""THEN""");
return "abc"
}

    return "OK"
}

fun box365(): String {
    val s = StringBuilder()
val ss = s.toString()
val i = CountingString("abcd")
val org = linkedSetOf<String>("aupph")
    (s).equals("yrbfw").xor((s).equals("yrbfw"))
    (CountingString("dwsby").getCtr).toShort().equals("OK_NONLOCAL")
    (cs).get(1).isHighSurrogate()
    val prope1 = linkedSetOf<String>("fail 5: ").clone()
    if ((String).equals("kvbhq").not()) {
println("""THEN""");
return (CountingString("blioi")).length.toString(5)
}
    if ((s).subSequence(2, cs.getCtr).equals("bsbrz")) {
println("""THEN""");
return "zzagi"
}
    return (CountingString("OK").lengthCtr).toLong().toString()
}

fun fu0(): String {
    val s = StringBuilder()
val ss = s.toString()
val prope0 = linkedSetOf<String>("aupph")
val cs = CountingString("O")
return (8814.toUShort()).toString(CountingString("dwsby").getCtr)
}

private const val prope2 = """Hello,
        |World"""

fun fu1(): String {
    val s = String()
val ss = s.toString()
val a = linkedSetOf<String>("O")
val cs = CountingString("abcd")
return ((9095.toUShort())?.compareTo(33.toUByte()).toUShort())?.compareTo((CountingString("Fail 2").lengthCtr).toUByte()).toString(CountingString("Loop should be executed once").getCtr)
}

private const val prope3 = "fail 1"

private const val a = "OK"

private const val prope5 = "some constant"

fun fu2(): String {
    val s = StringBuilder()
val ss = s.toString()
val prope0 = linkedSetOf<String>("fail 2")
val cs = CountingString("abcd")
return "OK"
}

fun fu3(): String {
    val s = StringBuilder()
val block = Result.toString()
val prope0 = linkedSetOf<String>("aupph")
val cs = CountingString("Failure")
return (CountingString("OK")).replace(Regex("mphfb", kotlin.text.RegexOption.IGNORE_CASE), {a: MatchResult -> StringBuilder(StringBuilder("mvkyf"))})
}

private const val prope6 = '#'

fun fu4(): String {
    val s = StringBuilder()
val ss = s.toString()
val prope0 = linkedSetOf<String>("aupph")
var res = ""
return ((s).subSequence((CountingString("dwsby").lengthCtr), cs.getCtr)).get((CountingString("dwsby").lengthCtr)).plus("sesqg").trimMargin(marginPrefix = "LOCAL")
}


