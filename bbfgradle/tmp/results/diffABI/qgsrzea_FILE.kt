// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.collections.MutableMap
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
    public fun remove(o: T): Boolean = TODO()
    public fun addAll(c: Collection<T>): Boolean = TODO()
    public fun addAll(index: Int, c: Collection<T>): Boolean = TODO()
    public fun removeAll(c: Collection<T>): Boolean = TODO()
    public fun retainAll(c: Collection<T>): Boolean = TODO()
    public fun clear():Unit =TODO()
    public fun set(index: Int, element: T): T = TODO()
    public fun add(index: Int, element: T):Unit =TODO()
    public fun removeAt(index: Int): T = TODO()
}

fun box(): String =TODO()

open class A(): MutableMap <Byte, MyList<Char>>{

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.Byte, MyList<kotlin.Char>>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.Byte>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<MyList<kotlin.Char>>
    get() = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsKey(key: kotlin.Byte): kotlin.Boolean = TODO()

override fun containsValue(value: MyList<kotlin.Char>): kotlin.Boolean = TODO()

override fun get(key: kotlin.Byte): MyList<kotlin.Char>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun put(key: kotlin.Byte, value: MyList<kotlin.Char>): MyList<kotlin.Char>? = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.Byte, MyList<kotlin.Char>>): kotlin.Unit = TODO()

override fun remove(key: kotlin.Byte): MyList<kotlin.Char>? = TODO()

val eymwy: Map<MyList<MyList<Float>>, String> = TODO()

}


