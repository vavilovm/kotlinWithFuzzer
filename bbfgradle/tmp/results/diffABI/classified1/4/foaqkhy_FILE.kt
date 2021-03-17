// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// FILE: tmp0.kt

import kotlin.reflect.KProperty0

var x = 0

class A {
    val p: String
        get() = if (x == 1) "OK" else "Fail $x"
}

fun callTwice(p: KProperty0<String>): String {
    p.get()
    return p.get()
}

fun box(): String {
    return callTwice(({ x++; A() }())::p)
}
