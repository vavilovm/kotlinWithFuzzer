// Bug happens on JVM 
// FILE: tmp0.kt

tailrec fun foo(m: Any = {}): Int = foo()
