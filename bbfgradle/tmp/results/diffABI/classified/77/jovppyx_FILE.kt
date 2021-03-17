// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class A

fun box(): String {
    var result = "Fail"

    fun A.ext() { result = "OK" }

    val f = A::ext
    f(A())
    return result
}
