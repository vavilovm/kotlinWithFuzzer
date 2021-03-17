// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

var x = 0

class A {
    fun f() = if (x == 1) "OK" else "Fail $x"
}

fun callTwice(f: () -> String): String {
    f()
    return f()
}

fun box(): String {
    return callTwice(({ x++; A() }())::f)
}
