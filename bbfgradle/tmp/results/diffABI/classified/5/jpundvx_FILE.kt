// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun box(): String {
    class A
    fun A.foo() = "OK"
    return (A::foo)((::A)())
}
