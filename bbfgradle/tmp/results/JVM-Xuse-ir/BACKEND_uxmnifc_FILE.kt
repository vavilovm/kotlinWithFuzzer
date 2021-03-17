// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

tailrec fun foo(m: Any = {}): Int = foo()
