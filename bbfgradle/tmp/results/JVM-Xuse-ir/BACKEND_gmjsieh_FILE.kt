// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt


data class Kla1(
    val p1: ULong,val p09: Int,val p10: Int,val p11: Int,val p12: Int,val p13: Int,val constructors: Int,val test: Int,val p16: Int,val p17: Any,val p18: Int,val p19: Int,val p20: Int,val p21: Int,val p22: Int,val p23: Int,val p24: Int,val p25: Int,val p26: Int,val A: Int,val p28: Int,val p29: Int
    )
fun box1()   =
Kla1::copy.toString()

