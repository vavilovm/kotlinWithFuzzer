// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: all-compatibility
// FILE: tmp0.kt

interface Test {
    open suspend fun foo():Int =TODO()
}
    val call: Any
        get() = ""
class A() fun TestClass(): Int =TODO()
object companion {
}
private
fun box(): Int =TODO()

