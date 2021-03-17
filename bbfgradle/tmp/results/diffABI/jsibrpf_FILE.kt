// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

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
    override fun listIterator(index: Int): ListIterator<T> = TODO()
    override fun subList(fromIndex: Int, toIndex: Int): List<T> = TODO()
    override fun hashCode(): Int = TODO()
    override fun equals(other: Any?): Boolean = TODO()

    open fun add(e: T): Boolean = TODO()
    internal fun remove(o: T): Boolean = TODO()
    tailrec fun addAll(c: Collection<T>): Boolean = TODO()
    public fun addAll(index: Int, c: Collection<T>): Boolean = TODO()
    public fun removeAll(c: Collection<T>): Boolean = TODO()
    protected fun retainAll(c: Collection<T>): Boolean = TODO()
    protected fun clear():Unit =TODO()
    protected fun set(index: Int, element: T): T = TODO()
    public fun add(index: Int, element: T):Unit =TODO()
    internal fun removeAt(index: Int): T = TODO()
}
    // KJS_WITH_FULL_RUNTIME
class C(val i: Int) {
}
fun baz(): Any? =TODO()

fun box():String = TODO()
