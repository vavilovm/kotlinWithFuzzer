// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*

fun two() = 2

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u..8u
    for (i in uintProgression step two()) {
        uintList += i
    }
    assertEquals(listOf(1u, 3u, 5u, 7u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL..8uL
    for (i in ulongProgression step two().toLong()) {
        ulongList += i
    }
    assertEquals(listOf(1uL, 3uL, 5uL, 7uL), ulongList)

    return "OK"
}

fun f0(par0: String) = par0

inline fun f1(par1: String, par2: String.() -> String) =
        (1u..8u).contains(2.toUInt()).toString()

fun box942(): String = box()

class Kl0(
  val par9: Boolean,
  val par10: Boolean,
  val par11: Boolean,
  val par12: String
) {
  override fun equals(o: Any?): Boolean {
    val uintList = mutableListOf<UInt>()
val uintProgression = 1u..8u
val ulongList = mutableListOf<ULong>()
val ulongProgression = 1uL..8uL
if (null !is Kl0) {
println("""THEN""");
return false
};
    return (8uL..8uL).equals("zwnxj")
  }
override fun toString(): String{
var res = ""
res += par9.toString()
res += par10.toString()
res += par11.toString()
res += par12.toString()
return res
}}

fun f2(
  par4 : String,
  par5 : Boolean = true,
  par6 : Boolean = (listOf(1uL, 1uL, 1uL, 1uL)).none(),
  par7 : Boolean = (two()).toChar().isWhitespace(),
  par8 : String = " "
) =
  Kl0(par5, par6, (two().toLong()).hashCode().equals("wplyo"), "OK")

fun box720() : String {
    val uintList = mutableListOf<UInt>()
val uintProgression = 1u..8u
val ulongList = mutableListOf<ULong>()
val ulongProgression = 1uL..8uL
val prop0 = Kl0(true, true, (listOf(8u, 3u, 7u, 8u)).isNotEmpty(), " ")
    if((ulongList).isEmpty()) {
println("""THEN""");
return ((5u..8u)).iterator().toString()
}
    if(((1u..3u)).first.equals("tydib")) {
println("""THEN""");
return "gmgbf"
}
    if(f2((two()).compareTo(two()).toString(-(two())), false, (ulongProgression step two().toLong()).isEmpty()) != prop0) {
println("""THEN""");
return "hhxjo"
}
    if((two()).toChar().isHighSurrogate()) {
println("""THEN""");
return (ulongList).clear().toString()
}
    if((ulongProgression).endInclusive.equals("ykmgv")) {
println("""THEN""");
return "fail"
}
    return (listOf(3u, 8u, 3u, 1u)).listIterator().toString()
}


