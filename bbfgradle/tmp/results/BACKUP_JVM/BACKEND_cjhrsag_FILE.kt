// Bug happens on JVM 
//File: tmp/tmp0.kt
class TestClass {
operator fun <T> invoke(Int: Any) = ""
}
    val test = TestClass()
val x = test {}
