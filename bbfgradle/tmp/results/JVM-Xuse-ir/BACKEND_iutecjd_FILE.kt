// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


fun Collection( x: Int,a: UShort,b: UShort ) = x in a..b

