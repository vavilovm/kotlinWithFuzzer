// Different compile happens on:JVM ,JVM -Xnew-inference

class StrList : List<String?> {
    override val size: Int
        get() = throw UnsupportedOperationException()
override fun isEmpty()  = TODO()
override fun contains(o: String?) = TODO()
override fun iterator()  = TODO()
override fun containsAll(c: Collection<String?>) = TODO()
    override fun get(index: Int)  = TODO()
override fun indexOf(o: String?)  = TODO()
override fun lastIndexOf(o: String?)  = TODO()
override fun listIterator()  = TODO()
override fun listIterator(index: Int)  = TODO()
override fun subList( fromIndex: Int,toIndex: Int)  = TODO()
}
fun <E> E
.forceContains(x: String): Boolean = TODO() fun <E> E.forceContains(x: Any?): Boolean = TODO()
val strList =
StrList().forceContains(null)
