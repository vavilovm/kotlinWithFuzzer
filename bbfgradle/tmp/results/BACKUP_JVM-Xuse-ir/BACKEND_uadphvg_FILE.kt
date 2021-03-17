// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


fun s()  =
::byteArrayOf !is Any

