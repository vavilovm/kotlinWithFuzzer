// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class A

fun box(): String {
    fun A.foo() = "OK"
    return (A::foo)(A())
}
