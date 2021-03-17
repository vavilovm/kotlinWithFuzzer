// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun box(): String {
    val o = "O"
    fun ok() = o + "K"
    class OK {
        val ok = ok()
    }
    return OK().ok
}
