// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class C() {
    fun box(): Int {
        fun local(i: Int = 1): Int {
            return i
        }
        return local()
    }
}

fun box(): String {
    return if (C().box() != 1) "fail" else "OK"
}
