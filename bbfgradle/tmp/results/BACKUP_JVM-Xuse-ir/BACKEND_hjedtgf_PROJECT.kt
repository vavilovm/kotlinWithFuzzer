// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// WITH_COROUTINES
// IGNORE_BACKEND: JS_IR
// FILE: tmp0.kt


fun mutableListOf(i: Int )  {
null!!
i.plus(i++)
}

