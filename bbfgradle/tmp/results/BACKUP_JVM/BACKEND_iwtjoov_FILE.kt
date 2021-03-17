// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp.kt


val prop1 = UInt.toString().toULongOrNull() !in 1UL..1UL

