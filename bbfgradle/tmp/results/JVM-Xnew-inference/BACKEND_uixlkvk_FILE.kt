// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt

fun box1() = (String::plus)!!.toString
