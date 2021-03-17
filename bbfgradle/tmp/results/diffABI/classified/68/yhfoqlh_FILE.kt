// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun box(): String {
    var x = ""

    class CapturesX {
        override fun toString() = x
    }

    fun localFun() = CapturesX()

    x = "OK"
    return localFun().toString()
}
