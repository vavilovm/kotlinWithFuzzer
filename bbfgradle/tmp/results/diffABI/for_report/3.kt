// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

var invokeOrder: String = ""

@JvmOverloads()
@Strictfp()
fun test(x: Double = { invokeOrder += "x"; 1.0 }(), a: String, y: Long = { invokeOrder += "y"; 1 }(), b: String): String =TODO()
