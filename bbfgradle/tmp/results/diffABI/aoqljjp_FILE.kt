// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class Container<T>
fun <Z> foo():Unit =TODO()

fun box():Int = TODO()

// TARGET_BACKEND: JVM
class MyIterator<T>(val v: T): Iterator<T> {
    override fun next(): T = TODO()
    override fun hasNext(): Boolean = TODO()

    public fun remove():(Unit)? =TODO()
}
