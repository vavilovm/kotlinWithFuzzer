// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

class Outer(val x: (String)?) {
    val izml = 5
inner class Inner(a: Any?) {
        val z = (x) + this

fun hpwr(b: (Boolean)?) =
    when (b) {
        false -> {
println("""WHEN false""");
mutableListOf<Int>()!!
}
        true -> {
println("""WHEN true""");
0
}
        else -> {
println("""WHEN """);
2
}
    }!!
override fun toString(): String{
var res = ""
res += z.toString()
return res
}}
val horf = "Fail boolean"
    override fun toString(): String{
var res = ""
res += x.toString()
res += izml.toString()
res += horf.toString()
return res
}}

val uvtx = (1.toShort()..3.toShort()).reversed()

typealias OI = Outer.Inner
fun box(): String =
        Outer(("NativePropertyAccessorsKt.getDefaultGetter()I")).OI(StringBuilder()).z
