// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class Props(val intArray: IntArray) {
    val size get() = intArray.size

    fun foo(): Int {
        val a = size
        return a
    }
}

fun box(): String {
    val f = Props(intArrayOf(1, 2, 3))
    if (f.foo() != 3) return "fail"

    return "OK"
}
