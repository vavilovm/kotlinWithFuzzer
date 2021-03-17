// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


 class A
val v1 = (::A)!!.hashCode

