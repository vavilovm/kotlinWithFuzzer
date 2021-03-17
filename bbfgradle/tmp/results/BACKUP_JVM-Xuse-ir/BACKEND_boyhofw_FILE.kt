// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Foo(val value: Int)
val a =
Foo(TODO()).value++
