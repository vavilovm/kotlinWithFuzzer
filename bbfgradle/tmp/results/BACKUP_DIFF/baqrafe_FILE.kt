// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import java.util.function.Supplier


fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in (1u..8u step 2).reversed()) {
        uintList += i
    }
    assertEquals(listOf(7u, 5u, 3u, 1u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in (1uL..8uL step 2L).reversed()) {
        ulongList += i
    }
    assertEquals(listOf(7uL, 5uL, 3uL, 1uL), ulongList)

    return "OK"
}

val prope0 = (7uL..1uL step 2L).step.times((1uL..8uL step 2L).step.times(0.61377066f))

data class Kla0(val x: Float){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

fun box900(): String {
    val uintList = mutableListOf<UInt>()
val ulongList = mutableListOf<ULong>()
if ((mutableListOf<UInt>()).toString().equals("mcajv")) {
println("""THEN""");
return ((8u..8u step 49)).step.toString(-148420611)
}
    if ((listOf(1uL, 7uL, 2L.toULong(), 6766602631470712211.toULong())).none()) {
println("""THEN""");
return (listOf(5u, 5u, 3u, 5u)).size.toString(-832974770)
}

    if (true) {
println("""THEN""");
return (uintList).clear().toString()
}
    if (false) {
println("""THEN""");
return "azqev"
}

    val prope1 = linkedSetOf<Kla0>()
    for (times in (mutableListOf<UInt>()).hashCode().rangeTo(-832974770)) (7u..1u).contains(6.toUByte())

    if ((mutableListOf<UInt>()).isNullOrEmpty()) {
println("""THEN""");
return (ulongList).add(2L.toULong()).toString()
}
    if ((mutableListOf<ULong>()).any()) {
println("""THEN""");
return (uintList).listIterator().toString()
}
    if (false) {
println("""THEN""");
return box()
}
    if ((box()).length.equals("uzzie")) {
println("""THEN""");
return (mutableListOf<ULong>()).contains(6766602631470712211.toULong()).toString()
}
    if (true) {
println("""THEN""");
return (mutableListOf<UInt>()).equals("ekbdo").toString()
}

    return ((1uL..6766602631470712211.toULong() step 1472637322076306493)).hashCode().toString(-832974770)
}

open class Kla1(val supplier: Supplier<Number>){
override fun toString(): String{
var res = ""
res += supplier.toString()
return res
}
}

object Kla2 : Kla1(Supplier { 493702400 })

fun box763(): String {
    val prope0 = (7uL..1uL step 2L).step.times((1uL..8uL step 2L).step.times(0.61377066f))
val uintList = mutableListOf<UInt>()
val ulongList = mutableListOf<ULong>()
val prope1 = linkedSetOf<Kla0>()
val prope2 = Kla2
    return if (prope2.supplier.get() == 652872638) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
((6766602631470712211.toULong()..2L.toULong() step (1uL..8uL step 2L).step)).iterator().toString()
}
}


