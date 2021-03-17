// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp.kt


class L(val x: Any)
val L.xx get() = x
fun box1()   =
L(L(1L)::xx.get())::xx.toString()

