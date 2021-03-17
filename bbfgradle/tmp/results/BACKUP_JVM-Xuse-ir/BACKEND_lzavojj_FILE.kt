// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun f0():Int = TODO()
val prop1 = (::f0)!!.single as Int
