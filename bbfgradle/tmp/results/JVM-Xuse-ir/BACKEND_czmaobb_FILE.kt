// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


class MyList<T>: List<T> {
    override val size: Int get() = 1
    override fun isEmpty()  = TODO()
    override fun contains(o: T)  = TODO()
    override fun iterator()  = TODO()
    override fun containsAll(c: Collection<T>)  = TODO()
    override fun get(index: Int)  = TODO()
    override fun indexOf(o: T)  = TODO()
    override fun lastIndexOf(o: T)  = TODO()
    override fun listIterator()  = TODO()
    override fun listIterator(index: Int)  = TODO()
    override fun subList( fromIndex: Int,toIndex: Int
)  = TODO()
suspend fun retainAll(c: Collection<T>): Boolean = TODO()
}

