// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun foo() = false
val name = "".plus((::foo)!!)
