// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.test.*
open class Foo(val x: () -> String){
override fun toString(): String{
var res = ""
return res
}
}

class Outer {
    val s = "OK"

    inner class Inner : Foo({ s })
override fun toString(): String{
var res = ""
res += s.toString()
return res
}}

fun box() = Outer().Inner().x()

fun box250(): String {
    var prope0 = 0u
    val prope1 = 1u..3u
    for (i: UInt? in prope1) {
        prope0 = fu0(prope0, i)
    }
    return if (prope0 == 6u) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $prope0"
}
}

fun fu0(i: UInt, z: UInt?): UInt {
    return i + z!!
}

fun box776(): String {
    val prope2 = mutableListOf<UInt>()
    for (i in ((1u..10u).reversed() step 2).reversed() step 3) {
        prope2 += i
    }
    assertEquals(listOf(2u, 5u, 8u), prope2)

    val prope3 = mutableListOf<ULong>()
    for (i in ((1uL..10uL).reversed() step 2L).reversed() step 3L) {
        prope3 += i
    }
    assertEquals(listOf(2uL, 5uL, 8uL), prope3)

    return "OK"
}


