// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u..7u step 7) {
        uintList += i
    }
    assertEquals(listOf(1u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL..7uL step 7L) {
        ulongList += i
    }
    assertEquals(listOf(1uL), ulongList)

    return "OK"
}

enum class Kla0 {
    Kla1,
    Kla2
}

operator fun Kla0.invoke(i: Int) = i

fun box784() = if ((7uL..(7uL..7uL).endInclusive).endInclusive.compareTo((7uL..(7uL..7uL).endInclusive).endInclusive.compareTo(5.toUByte()).toUByte()) == (box()).toString().length) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
((1uL..7uL).endInclusive..7uL).iterator().toString()
}

interface Kla3<Ty0> {
    fun <Ty1> Ty1.fu1(x: Ty0): String
}

class Kla4 : Kla3<String> {
    override fun <Ty1> Ty1.fu1(x: String) = this.toString() + x
}

fun Kla3<String>.fu0() = ((7uL..(7uL..(1uL..7uL).endInclusive).endInclusive).endInclusive.compareTo(5.toUByte())).compareTo(839680253).toString(-945445815).fu1("efwyd")

fun box790(): String {
    val uintList = mutableListOf<UInt>()
val ulongList = mutableListOf<ULong>()
val prope0: Kla3<String> = Kla4()
    return ((7uL..(7uL..7uL).endInclusive).endInclusive).toUByte().toString(5)
}


