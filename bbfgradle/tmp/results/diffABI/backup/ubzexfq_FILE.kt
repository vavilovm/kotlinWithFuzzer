// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

    val listFun = { l: List<String> -> l }
// IGNORE_BACKEND_FIR: JVM_IR
// SKIP_JDK6
// TARGET_BACKEND: JVM
// FULL_JDK
class MapWithBadDefaults : HashMap<String, String>() {
    override fun getOrDefault(key: String, defaultValue: String): String =TODO()

    override fun remove(key: String, value: String): Boolean =TODO()
}
        fun Int(): Int =TODO()

fun foo():Int = TODO()

    inline class X(val x: String)
fun box():Boolean = TODO()
