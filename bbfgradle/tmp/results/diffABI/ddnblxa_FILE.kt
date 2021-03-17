// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class A {
    fun result():String = TODO()
}
class MyList<IcAny>: List<T> {
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
}
class Test(val ok: String)
inline class AsAny(val a: Any) {
    override fun toString(): String = TODO()
}
inline class T(val x: Any?)
class Bar
class N {
    fun foo():Nothing? = TODO()
} object f
{
    fun mem(): String = TODO()
}

fun box(): String =TODO()
