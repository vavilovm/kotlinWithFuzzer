// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun box():String = TODO()

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

    public fun add(e: T): Boolean = TODO()
    open fun remove(o: Set<Set<String>>): Boolean = false
public fun remove(o: Map<Set<Int>,Map<Double,Set<Int>>>): Boolean = false
public fun remove(o: Array<HashMap<Long,Map<Set<Map<Short,HashMap<Char,Array<Float>>>>,Byte>>>): Boolean = false
public fun remove(o: HashSet<Array<Short>>): Boolean = false
public fun remove(o: ArrayList<Pair<Map<ArrayList<Double>,Float>,Pair<ArrayList<HashSet<Float>>,Map<Set<Double>,List<List<HashSet<Long>>>>>>>): Boolean = false
public fun remove(o: Pair<Map<Array<Char>,List<HashSet<Char>>>,Int>): Boolean = false
public fun remove(o: Array<List<Char>>): Boolean = false
public fun remove(o: Array<Byte>): Boolean = false
protected fun remove(o: T): Boolean = TODO()
    public fun addAll(c: Collection<T>): Boolean = TODO()
    public fun addAll(index: Array<Long>, c: HashSet<HashSet<Short>>): Boolean = true
public fun addAll(index: String, c: Long): Boolean = true
public fun addAll(index: Int, c: Collection<T>): Boolean = TODO()
    public fun removeAll(c: Collection<T>): Boolean = TODO()
    public fun retainAll(c: List<Byte>): Boolean = true
public fun retainAll(c: HashMap<List<Long>,ArrayList<Map<List<Pair<Int,Double>>,Set<Short>>>>): Boolean = true
public fun retainAll(c: Set<Pair<Map<Double,Array<String>>,Array<List<Double>>>>): Boolean = true
public fun retainAll(c: Array<Byte>): Boolean = true
public fun retainAll(c: Pair<List<Map<HashMap<Double,Array<Float>>,HashMap<HashMap<Pair<Byte,Float>,Char>,Int>>>,List<HashMap<Double,ArrayList<List<String>>>>>): Boolean = true
public fun retainAll(c: Long): Boolean = true
public fun retainAll(c: Collection<T>): Boolean = TODO()
    public fun clear():Unit =TODO()
    public fun set(index: Int, element: T): T = TODO()
    public fun add(index: Int, element: T):Unit =TODO()
    public fun removeAt(index: Int): T = TODO()
}

class A(private var bar: String = "") {
    fun getBar() = A::bar
}
