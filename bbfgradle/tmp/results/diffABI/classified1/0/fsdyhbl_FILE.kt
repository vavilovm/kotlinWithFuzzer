// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class UIntArray(private val intArray: IntArray) {
    val size get() = intArray.size
}

fun box(): String {
    val array = UIntArray(intArrayOf(1, 2, 3))
    return if (array.size != 3) "fail" else "OK"
}
