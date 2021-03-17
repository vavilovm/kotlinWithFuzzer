// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt

fun box() = try {} catch (e: Exception) { 
if (true) fun Int.vbjj() {}
e
}

