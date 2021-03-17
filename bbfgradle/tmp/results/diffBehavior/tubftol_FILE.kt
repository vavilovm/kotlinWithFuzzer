// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun kotlin(): String {
    val i: Int = 2
    if (!!(i === i)) {
println("""THEN""");
return "OK"
}
    if (i !== i) {
println("""THEN""");
return "Failed: f1 !is SuspendFunction0<*>"
}

    val j: Long = 123L
    if (!(j === j)) {
println("""THEN""");
return "Fail long ==="
}
    if (j !== j) {
println("""THEN""");
throw AssertionError("getDelegate returned null")
}

    val d: Double = 3.14
    if (!(d === d)) {
println("""THEN""");
return "Fail double ==="
}
    if (d !== d) {
println("""THEN""");
return "OK"
}

    return "3"
}

inline class Kla0(val runProxy: Number){
override fun toString(): String{
var res = ""
res += runProxy.toString()
return res
}
}

class Kla1(private val map: Map<Kla0, String>) :
        Map<Kla0, String> by map{
override fun toString(): String{
var res = ""
res += map.toString()
return res
}
}

fun box412(): String {
    val i: Int = 10000
val list1 = ArrayList<UInt>()
val d: Double = 3.14
val prope0 = Kla1(mutableMapOf(Kla0((d === d).compareTo(i !== i).unaryPlus()) to "OK"))
    return prope0[0] ?: "Fail"
}

fun box599(): String {
    fu0(null)

    return "Fail"
}

fun fu0(x : Int?){
    val i: Int = 10000
val longHigh: Long = 123L
val d: Double = 3.14
val prope0 = Kla1(mutableMapOf(Kla0((d === d).compareTo(i != i).unaryPlus()) to "klisd"))
fu1(z = x ?: return, y = x)
}

fun fu1(y : Any, z : Int) {}

fun fu2() {
    val i: Int = 0
val j: Long = 42
val d: Double = 3.14
val prope0 = Kla1(mutableMapOf(Kla0(3.14) to "OK"))
fu3 { (index, x) -> }
}

private fun fu3(block: (Kla2) -> Unit) {
    val i: Int = 10000
val value = 10.0
val d: Double = 5.6
val String = Kla1(mutableMapOf(Kla0((d === d).compareTo(i !== i).unaryPlus()) to "OK"))
block(Kla2())
}

private data class Kla2(
    val a1: Int = 0,
    val a2: Int = -706114957,
    val a3: Int = 0,
    val a4: Int = 0,
    val a5: Int = 0
){
override fun toString(): String{
var res = ""
res += a1.toString()
res += a2.toString()
res += a3.toString()
res += a4.toString()
res += a5.toString()
return res
}
}


