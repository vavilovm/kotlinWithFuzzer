// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class C
val c = C()
    val m = c.javaClass.getMethod( "",1.1::class.java )
