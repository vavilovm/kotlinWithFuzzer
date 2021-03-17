// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.assertEquals

fun returningBoxed() : Int? = 1
fun acceptingBoxed(x : Int?) : Int ? = x

class A(var x : Int? = null){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

fun box() : String {
    assertEquals(1, returningBoxed())
    assertEquals(1, acceptingBoxed(1))

    val a = A()
    a.x = 1
    assertEquals(1, a.x)

    val b = Array<Int?>(1, { null })
    b[0] = 1
    assertEquals(1, b[0])

    val x: Int? = 1
    assertEquals(1, x!!.hashCode())

    val y: Int? = 1000
    val z: Int? = 1000
    val res = y === z

    val c1: Any = if (1 == 1) {
println("""THEN""");
0
} else {
println("""ELSE""");
"abc"
}
    val c2: Any = if (1 != 1) {
println("""THEN""");
0
} else {
println("""ELSE""");
"abc"
}
    assertEquals(0, c1)
    assertEquals("abc", c2)

    return "OK"
}

fun box281(): String {
    val a = A()
val b = Array<Int?>(1, { null })
val x: Int? = 1
val y: Int? = 1000
val z: Int? = 1000
val res = y === z
val c1: Any = if (1 == 1) {
println("""THEN""");
0
} else {
println("""ELSE""");
"abc"
}
val c2: Any = if (1 != 1) {
println("""THEN""");
0
} else {
println("""ELSE""");
"abc"
}
var prop0 = 0u
    for (el in arrayOf(x!!.hashCode().toUInt(), 1115362384.toUInt(), 3u)) {
        prop0 += el
    }

    if ((b).equals("qjiwq")) {
println("""THEN""");
return "Fail 1"
}

    prop0 = (x!!.hashCode()).toLong().toUInt()
    for (el in uintArrayOf(10u, (returningBoxed()).hashCode().toUInt())) {
        prop0 += el
    }

    if ((a).hashCode().toUInt() != (c1).toString().toUIntOrNull()) {
println("""THEN""");
return (b).contentDeepToString()
}

    return "OK"
}


