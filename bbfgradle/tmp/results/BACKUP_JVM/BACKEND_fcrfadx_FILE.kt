// Bug happens on JVM 
// FILE: tmp.kt

fun box() = try {} catch (e: Exception) { 
if (true) fun
() {}
e
}

