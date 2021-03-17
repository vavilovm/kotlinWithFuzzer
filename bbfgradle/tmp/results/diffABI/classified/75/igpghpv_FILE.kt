// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun box(): String {
    var x = ""

    class CapturesX {
        override fun toString() = x
    }

    fun outerFun1(): CapturesX {
        fun localFun() = CapturesX()
        return localFun()
    }

    x = "OK"
    return outerFun1().toString()
}
