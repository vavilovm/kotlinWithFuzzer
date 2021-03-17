// Different compile happens on:JVM ,JVM -Xnew-inference

interface Container {
    fun removeAt(x: Int) 
}
open class ContainerImpl : Container {
    override fun removeAt(x: Int) = TODO()
}
class A : ContainerImpl(), MutableList<String> {
    override fun isEmpty()  = TODO()
override val size: Int
        get() = throw UnsupportedOperationException()
override
fun contains(element: String)  = TODO()
override fun containsAll(elements: Collection<String>)  = TODO()
override fun add(element: String)  = TODO()
override fun indexOf(Long: String)  = TODO()
override fun lastIndexOf(element: String)  = TODO()
override fun get(index: Int)  = TODO()
override fun remove(element: String)  = TODO()
override fun addAll(list1: Collection<String>)  = TODO()
override fun addAll( index: Int,elements: Collection<String>)  = TODO()
override fun removeAll(elements: Collection<String>)  = TODO()
override fun retainAll(elements: Collection<String>)  = TODO()
override fun clear() = TODO()
override fun set( index: Int,element: String)  = TODO()
override fun add( index: Int,element: String) = TODO()
override fun listIterator()  = TODO()
override fun listIterator(index: Int)  = TODO()
override fun subList( fromIndex: Int,toIndex: Int): MutableList<String> {
        throw AssertionError{ prop, new -> }
    }
override fun iterator()  = TODO()
}
