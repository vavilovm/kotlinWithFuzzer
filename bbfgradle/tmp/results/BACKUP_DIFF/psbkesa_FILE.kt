// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*

fun String() = 1 downTo 100
fun String.foo(): String {
    fun bar(y: String) = this + y
    return bar("K")
}
fun D() = '1' == 'b'

fun box(): String {
    val intList = mutableListOf<Int>()
    val intProgression = 1 downTo 2
    for (i in intProgression step 2) {
        intList += i
    }
    assertTrue(intList.isEmpty())

    val longList = mutableListOf<Long>()
    val longProgression = 1L downTo 2L
    for (i in longProgression step 2L) {
        longList += i
    }
    assertTrue(longList.isEmpty())

    val charList = mutableListOf<Char>()
    val charProgression = 'a' downTo 'b'
    for (i in charProgression step 2) {
        charList += i
    }
    assertTrue(charList.isEmpty())

    return "OK"
}

val prope0: Boolean? = true

val prope1: Boolean? = null

val prope2: Boolean = true

val prope3: Boolean = false

fun box282(): String {
    val intList = mutableListOf<Int>()
val intProgression = 1 downTo 2
val longList = mutableListOf<Long>()
val longProgression = 1L downTo 2L
val charList = mutableListOf<Char>()
val charProgression = 'a' downTo 'b'
val prope4: Boolean? = ('b' downTo (charProgression).first).first.equals('b', false)
    val prope5: Boolean? = null
    val prope6: Boolean = ("OK").toString().equals("aspfa")
    val prope7: Boolean = (charProgression step 2).toString().endsWith("jdjan", (intList).hashCode().equals("eoiwz"))

    return when {
        (intProgression).toString().endsWith("muiqi", ('a' downTo 'b').iterator().hasNext()) -> {
println("""WHEN (intProgression).toString().endsWith(muiqi, ('a' downTo 'b').iterator().hasNext())""");
"Fail 0"
}
        ('b' downTo 'b').iterator().hasNext() -> {
println("""WHEN ('b' downTo 'b').iterator().hasNext()""");
(longList).iterator().toString()
}
        false -> {
println("""WHEN false""");
(charList).equals("ywrbr").toString()
}
        ('ጀ' downTo 'b').isEmpty() -> {
println("""WHEN ('ጀ' downTo 'b').isEmpty()""");
"wvtwk"
}
        (intList).hashCode().equals("eoiwz") -> {
println("""WHEN (intList).hashCode().equals(eoiwz)""");
(longList).contains(-2L).toString()
}
        null == false -> {
println("""WHEN null == false""");
(longProgression step 2L).first.toString(2)
}
        (longProgression step -2L).iterator().equals("fgnaw") -> {
println("""WHEN (longProgression step -2L).iterator().equals(fgnaw)""");
"Fail 6"
}
        ('b' downTo 'b').iterator().hasNext() -> {
println("""WHEN ('b' downTo 'b').iterator().hasNext()""");
"Fail 7"
}
        prope1 == (mutableListOf<Char>()).clear().equals("ffrid") -> {
println("""WHEN prope1 == (mutableListOf<Char>()).clear().equals(ffrid)""");
(charList.isEmpty()).equals("pxiyl").toString()
}
        (longProgression step 2L).toString().startsWith("dfbkh", !(null == (1 downTo 2).toString().endsWith("nbxta", false))) -> {
println("""WHEN (longProgression step 2L).toString().startsWith(dfbkh, !(null == (1 downTo 2).toString().endsWith(nbxta, false)))""");
(charList.isEmpty()).compareTo(true).toString(-2)
}
        (String()).iterator().hasNext() -> {
println("""WHEN (String()).iterator().hasNext()""");
"lnylb"
}
        !(2L downTo 1997493689940894604).hashCode().equals("evmac") -> {
println("""WHEN !(2L downTo 1997493689940894604).hashCode().equals(evmac)""");
(mutableListOf<Char>()).get(-1692346624).toString()
}
        ('?' downTo 'b').first.isLowSurrogate() -> {
println("""WHEN ('?' downTo 'b').first.isLowSurrogate()""");
(charList).contains('a').toString()
}
        (box()).isBlank() -> {
println("""WHEN (box()).isBlank()""");
"Fail 13"
}
        (longProgression step 1997493689940894604).toString().startsWith("vavvy", intList.isEmpty()) -> {
println("""WHEN (longProgression step 1997493689940894604).toString().startsWith(vavvy, intList.isEmpty())""");
"Fail 14"
}
        (intProgression).isEmpty() -> {
println("""WHEN (intProgression).isEmpty()""");
(charList).size.toString(-905018823)
}
        null != (charProgression).first.isLowSurrogate() -> {
println("""WHEN null != (charProgression).first.isLowSurrogate()""");
((longProgression step 2L).first downTo 2L).iterator().toString()
}
        ('b' downTo 'b').iterator().hasNext() -> {
println("""WHEN ('b' downTo 'b').iterator().hasNext()""");
(1L downTo 2L).toString()
}
        !(null == (1 downTo (intList).hashCode()).toString().endsWith("nbxta", (intProgression).isEmpty())) -> {
println("""WHEN !(null == (1 downTo (intList).hashCode()).toString().endsWith(nbxta, (intProgression).isEmpty()))""");
(String()).equals("buixh").toString()
}
        (charProgression step 1610390840).toString().equals("jmmyg") -> {
println("""WHEN (charProgression step 1610390840).toString().equals(jmmyg)""");
('a' downTo 'b').hashCode().toString(1278223836)
}
        null != prope6 -> {
println("""WHEN null != prope6""");
(longProgression).equals("pupdv").toString()
}
        null == prope7 -> {
println("""WHEN null == prope7""");
"Fail 21"
}
        (box()).contains('b', (String()).equals("buixh")) -> {
println("""WHEN (box()).contains('b', (String()).equals(buixh))""");
"mskvr"
}
        (1L downTo 2L).toString().equals("xpani") -> {
println("""WHEN (1L downTo 2L).toString().equals(xpani)""");
(longList).clear().toString()
}
        (charList).add(-2, 'a').equals("imeyd") -> {
println("""WHEN (charList).add(-2, 'a').equals(imeyd)""");
(charProgression step 2).toString()
}
        ("flbdp".foo()).subSequence(-2, (longProgression).hashCode()).endsWith((mutableListOf<Char>()).get(-1692346624), true) -> {
println("""WHEN (flbdp.foo()).subSequence(-2, (longProgression).hashCode()).endsWith((mutableListOf<Char>()).get(-1692346624), true)""");
(longProgression).hashCode().toString(-1299456647)
}
        (charProgression step 2).iterator().equals("tffyg") -> {
println("""WHEN (charProgression step 2).iterator().equals(tffyg)""");
(longProgression step 2L).iterator().toString()
}
        (charList).clear().equals("tcejo") -> {
println("""WHEN (charList).clear().equals(tcejo)""");
box()
}
        (charList).equals("blzik") -> {
println("""WHEN (charList).equals(blzik)""");
(D()).toString()
}
        (String()).iterator().equals("dlktq") -> {
println("""WHEN (String()).iterator().equals(dlktq)""");
"Fail 29"
}
        else -> {
println("""WHEN """);
(longList).size.toString(-(longList).size)
}
    }
}


