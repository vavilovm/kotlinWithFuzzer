// Bug happens on JVM 
//File: tmp/tmp0.kt

inline class Foo(val value: Int)
val a =
Foo(TODO()).value++
