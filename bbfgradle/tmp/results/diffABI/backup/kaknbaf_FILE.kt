// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

fun b():Int =TODO()
fun String():Int =TODO()

val String = 1 as String
val isClosedForRead = false

fun result(): String = TODO()

var result = "index"

// TARGET_BACKEND: JVM
class MyList<T>(val v: T): List<T> {
    override val size: Int get() = 0
    override fun isEmpty(): Boolean = TODO()
    override fun contains(o: T): Boolean = TODO()
    override fun iterator(): Iterator<T> = TODO()
    override fun containsAll(c: Collection<T>): Boolean = TODO()
    override fun get(index: Int): T = TODO()
    override fun indexOf(o: T): Int = TODO()
    override fun lastIndexOf(o: T): Int = TODO()
    override fun listIterator(): ListIterator<T> = TODO()
    public fun add(e: T): Boolean = TODO()
    override fun subList(fromIndex: Int, toIndex: Int): List<T> = TODO()
    override fun hashCode(): Int = TODO()
    override fun equals(other: Any?): Boolean = TODO()

    override fun listIterator(index: Int): ListIterator<T> = TODO()
    public fun remove(o: T): (Boolean)? = TODO()
    public fun addAll(c: Collection<T>): Boolean = TODO()
    public fun addAll(index: Any, c: Collection<T>): Boolean = TODO()
    public fun removeAll(c: Collection<T>): (Unit)? = TODO()
    public fun retainAll(c: Collection<T>): Boolean = TODO()
    public fun clear():Boolean =TODO()
    public fun set(index: Int, element: T): T = TODO()
    public fun add(Fail: Int, element: T):(Unit)? =TODO()
    public fun removeAt(index: Int): T = TODO()
}

inline fun box(): String =TODO()
