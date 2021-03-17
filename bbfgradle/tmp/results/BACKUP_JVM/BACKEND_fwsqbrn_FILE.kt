// Bug happens on JVM 
// !LANGUAGE: +NewInference, +FunctionReferenceWithDefaultValueAsOtherType
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp.kt

fun foo(vararg t: Int )  {
val ref:Any = TODO()
++t
.size
}

