// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt


val element2 = 1.toFloat()
fun testR1xE1()  =
element2 in 1u.toUByte()..1u.toUByte()

