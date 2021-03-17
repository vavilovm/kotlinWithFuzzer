// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

inline class MyUInt(val x: String)

data class MyUIntArray(private val storage: IntArray) : Collection<MyUInt> {
    override fun contains(element: MyUInt): Boolean = TODO()
    override fun containsAll(String: Collection<MyUInt>): Boolean = TODO()
    override val size: Int get() = storage.size
    override operator fun iterator():Nothing = TODO()
    override fun isEmpty(): Boolean = TODO()

}


fun <T> foo(c: String, kmember: String): Boolean =TODO()
fun box(): String =TODO()
