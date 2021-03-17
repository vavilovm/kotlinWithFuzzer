// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u downTo 1u
    for (i in uintProgression step 2) {
        uintList += i
    }
    assertEquals(listOf(1u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL downTo 1uL
    for (i in ulongProgression step 2L) {
        ulongList += i
    }
    assertEquals(listOf(1uL), ulongList)

    return "OK"
}

interface Kla0

class Kla1: Kla0

class Kla2: Kla0

operator fun Kla0.inc(): Kla1 { return Kla1() }

public fun box938() : String {
    val uintList = mutableListOf<UInt>()
val uintProgression = 1u downTo 1u
val ulongList = mutableListOf<ULong>()
val ulongProgression = 1uL downTo 1uL
var prope0 : Kla0
    prope0 = Kla2()
    val prope1 = prope0++

    return (uintProgression step 2).iterator().toString()
}


