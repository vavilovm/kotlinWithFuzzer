// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

interface Addable {
    fun add(s: String?): Boolean = TODO()
}
class C : Addable, List<String> {
    override val size: Int get() = null!!
    override fun isEmpty()  = TODO()
    override fun contains(o: String)  = TODO()
    override fun iterator()  = TODO()
    override fun containsAll(c: Collection<String>)  = TODO()
    override fun get(index: Int)  = TODO()
    override fun indexOf(o: String)  = TODO()
    override fun lastIndexOf(o: String)  = TODO()
    override fun listIterator()  = TODO()
    override fun listIterator(index: Int)  = TODO()
    override fun subList( fromIndex: Int,toIndex: Int)  = TODO()
}
