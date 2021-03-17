// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM
// IGNORE_BACKEND: JVM_IR
// FILE: tmp0.kt


inline class Z(val data: Int)
class Kla0 {
    fun fu0(
        p1: Int,p09: Int,p10: Int,p11: Int,p12: Int,p13: Int,p14: Int,p15: Int,e: Int,p17: Int,p18: Int,p19: Int,p20: Int,args: Int,p22: Int,p23: Int,p24: Int,p25: Int,p26: Int,p27: Int,p28: Int,p29: Z
        ): Int = TODO()
}
val prope1 = Kla0::fu0.call()

