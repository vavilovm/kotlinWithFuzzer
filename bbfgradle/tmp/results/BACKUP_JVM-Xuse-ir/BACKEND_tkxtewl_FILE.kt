// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
class TestClass {
    inline operator fun <T> invoke(Int: Any) = ""
}
    val test = TestClass()
val x = test {}
