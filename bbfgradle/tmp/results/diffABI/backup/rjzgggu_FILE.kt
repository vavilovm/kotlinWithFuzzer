// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun box(): String =TODO()

annotation class string (val x: Int) {
    companion object {
        @JvmStatic @kotlin.jvm.JvmOverloads public fun foo(o: String, k: String = "K"): String =TODO()
    }
}
