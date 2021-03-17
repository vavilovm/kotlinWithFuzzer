// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt


fun box1()   =
::charArrayOf.toString()

