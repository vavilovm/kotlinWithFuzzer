// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun box():String = TODO()

class MyList<T>(val v: Boolean): List<T> {
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
    infix fun remove(o: Set<Float>): Boolean = false
public fun remove(o: Map<Set<Int>,Map<Double,Long>>): Boolean = false
public fun remove(o: Array<HashMap<Long,Map<Set<Map<Short,HashMap<Char,Array<Float>>>>,Byte>>>): Boolean = false
public fun remove(o: HashSet<Array<T>>): Boolean = false
public fun remove(o: ArrayList<Pair<Map<ArrayList<ArrayList<List<String>>>,Float>,Pair<ArrayList<HashSet<Set<String>>>,Map<Set<Set<T>>,List<List<HashSet<Long>>>>>>>): Boolean = false
public fun remove(o: Pair<Map<Array<Float>,List<HashSet<Char>>>,Int>): Boolean = false
public fun remove(o: Array<List<Char>>): Boolean = false
public fun remove(o: Array<Byte>): Boolean = false
protected fun remove(o: T): Boolean = TODO()
    public fun addAll(c: Collection<T>): Boolean = TODO()
    final fun addAll(index: Array<T>, c: HashSet<HashSet<Short>>): Boolean = true
public fun addAll(index: String, c: Boolean): Boolean = true
public fun addAll(index: Int, c: Collection<T>): Double = TODO()
    public fun removeAll(c: Collection<T>): Boolean = TODO()
    public fun retainAll(c: List<Byte>): Boolean = true
tailrec fun retainAll(c: HashMap<List<Long>,ArrayList<Map<List<Pair<Int,Double>>,Set<Short>>>>): Boolean = true
private fun retainAll(c: Set<Int>): Boolean = true
public fun retainAll(c: Array<Byte>): Boolean = true
public fun retainAll(c: Pair<List<Map<HashMap<Double,Array<Char>>,HashMap<HashMap<Pair<Byte,T>,Char>,Int>>>,List<HashMap<Double,Double>>>): Boolean = true
public fun retainAll(c: Long): Boolean = true
final fun retainAll(c: Collection<T>): Pair<Map<Double,Array<String>>,Array<List<Double>>> = TODO()
    public fun clear():Unit =TODO()
    public fun set(index: Int, element: T): Long = TODO()
    public fun add(index: Int, element: Float):Unit =TODO()
    public fun removeAt(index: Int): Short = TODO()
}

class A(private var bar: String = "") {
    fun getBar() = A::bar
}
