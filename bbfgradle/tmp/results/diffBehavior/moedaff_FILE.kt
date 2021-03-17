// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp.kt

//KT-1572 Frontend doesn't mark all vars included in closure as refs.

//KT-1572 Frontend doesn't mark all vars included in closure as refs.

class A(val t : Int) {override fun toString(): String{
var res = ""
res += t.toString()
return res
}}

fun testKt1572() : Boolean {
    var a = A(0)
    var b = A(3)
    val changer = {a = b}
    b = A(10) // this change has no effect on changer
    changer()
    return (a.t == 10)
}

fun testPrimitives() : Boolean {
    var a = 0
    var b = 3
    val changer = {a = b}
    b = 10
    changer()
    return (a == 10)
}

fun box() = if (testKt1572() && testPrimitives()) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}

fun box450(): String {
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


