// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp.kt

fun box()   =
arrayListOf(TODO())
.size++
