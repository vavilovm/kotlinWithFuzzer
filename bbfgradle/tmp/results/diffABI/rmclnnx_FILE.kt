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

    public fun add(e: T): String = TODO()
    public fun remove(String: T): Boolean = TODO()
    public fun addAll(t: T): String = TODO()
    public fun addAll(index: Int, c: Collection<T>): Any? = TODO()
    public fun removeAll(c: Collection<T>): Boolean = TODO()
    public fun retainAll(c: Collection<T>): Boolean = TODO()
    public fun clear():String =TODO()
    public fun set(Boolean: Int, MyThrowable: T): String = TODO()
    public fun add(index: Int, element: T):Unit =TODO()
    public fun removeAt(): T = TODO()
}

fun box(): String =TODO()
