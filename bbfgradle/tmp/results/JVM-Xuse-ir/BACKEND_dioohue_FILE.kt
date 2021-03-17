// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


fun arr( x: Int,a: UByte,b: UByte ) = x !in a..b

