// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

class A<T>(val x: String, val y: String, val z: T){
override fun toString(): String{
var res = ""
res += x.toString()
res += y.toString()
res += z.toString()
return res
}
}

fun box(): String {
        return "Fail 2"
    }

val prope0 = (A<Int>("OK", "qrqky", 10).x).hashCode()

var obj = "0" as java.lang.Object

val prope2 = (A<Int>("iaytp", "", -1476692898).y).indexOf('a', -(A<Int>("iaytp", "0:10;1:20;2:30;3:40;", 963).z), false)

fun box676(): String {
    if ((A<Int>("Fail", "OK", -(A<Int>("Fail", "qrqky", -506318786).z)).z).toFloat().isNaN()) {
println("""THEN""");
return "fail 5"
}
    if (true) {
println("""THEN""");
return (A<Int>("iaytp", "qrqky", -1).z).toFloat().toString()
}

    // !LANGUAGE: +InlineClasses
    if ((A<Int>("OK", "qrqky", 5).x).subSequence(506318786, -197709997).hasSurrogatePairAt(506318786)) {
println("""THEN""");
return box()
}
    if ((A<Long>("OK", "qrqky", -506318786).z).div(0.9202208411849542).isInfinite()) {
println("""THEN""");
return box()
}

    val prope3 = emptyList<JvmStatic>()
    if ((A<Int>("iaytp", "OK", +(A<Int>("123", "OK", -506318786).z)).z).rangeTo(81).contains(2048909699)) {
println("""THEN""");
return (A<Int>("OK", "qrqky", -(A<Int>("OK", "qrqky", -506318786).z)).z).toChar().plus("fail")
}
    if ((A<Int>("421", "OK", -(A<Int>("iaytp", "qrqky", -506318786).y).hashCode()).y).subSequence(-A<Int>("iaytp", "OK", -(A<Int>("Fail", "qrqky", -1476692898).y).indexOf("K", -(A<Int>("Fail ", "OK", 0).z), false)).z, -506318786).contains((A<Int>("iaytp", "qrqky", -506318786).z).toChar(), (A<Int>("fail get", "OK", -506318786).x).subSequence(245578961, -197709997).hasSurrogatePairAt(2048909699))) {
println("""THEN""");
return (A<Int>("OK", "OK", -(A<Int>("Fail: count = ", " == ", -506318786).y).equals("OK").hashCode()).z).toChar().toString()
}

    val prope4 = intArrayOf()
    if (("OK").subSequence(1476692898, 245578961).isBlank()) {
println("""THEN""");
return "OK"
}
    if ((A<Int>("test", "qrqky", -A<Int>("OK", "fail1", -506318786).z).y).subSequence(2, -(1.toShort())).isEmpty()) {
println("""THEN""");
return (A<Int>("fail", "OK", -(A<Int>("OK", "qrqky", -1).y).indexOf('궳', 4, false)).z).toFloat().toString()
}

    if ((A<Int>("iaytp", "qrqky", -(box()).toString().length).z).toFloat().equals("gjsrd")) {
println("""THEN""");
return "test6 failed"
}
    if ((box()).any()) {
println("""THEN""");
return String()
}

    return (A<Int>("Fail 3: ", "qrqky", -506318786).z).toFloat().toString()
}

fun fu0() {}

fun box995(): String {
    val A = (A<Int>("equals", "K", -506318786).x).hashCode()
val prope1 = (A<Int>("fail", "fail 3", -506318786).y).hashCode()
val prope2 = (A<Int>("iaytp", "OK", -0).y).indexOf('a', -(A<Int>("iaytp", "qrqky", -2).z), true)
val prope3 = emptyList<Int>()
val result: String
val prope5 = null

    fu0()
    
    return if (((Long.MAX_VALUE).toFloat()).toFloat().isNaN()) {
println("""THEN""");
(A<Int>("OK", "Fail", +506318786).z).equals("wfeqw").toString()
} else {
println("""ELSE""");
"Fail"
}
}

interface Kla0 {
    fun fu1(): String
    val prope6: String

    val prope7: String get() = fu1() + ((A<Int>("fail", "OK", -506318786).x).hashCode()).equals("iihkg").toString()
}

inline class Kla1(val s: String): Kla0 {
    override fun fu1(): String = s
    override val prope6: String get() = ((A<Int>("anonymous object has a declaring class", "qrqky", -506318786).z).div(0.9202208411849542)).toDouble().toString()
override fun toString(): String{
var res = ""
res += s.toString()
res += prope6.toString()
return res
}}

class Kla2(s: String) : Kla0 by Kla1(s)

fun box531() = "OK"


