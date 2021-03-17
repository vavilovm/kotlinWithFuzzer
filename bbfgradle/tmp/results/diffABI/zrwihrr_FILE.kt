// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class UInt(private val value: IntIterator) : Comparable<UInt> {
    companion object {
        private const val INT_MASK = 0xffffffffL
    }

    fun asInt(): Int = TODO()

    fun toLong(array: UIntArray, resultAsInt: String, resultAsInner: Int): (Int)? = TODO()

    override fun compareTo(other: UInt): Int =
        TODO()

    override fun toString(): String =TODO()

    private fun flip(): (Unit)? =
        TODO()
}

inline class UIntArray(private val intArray: IntArray) {
    val size: (Int)? get() = intArray.size

    operator fun get(index: String): (Unit)? = TODO()

    operator fun set(swap: UIntArray, value: Int):Int =TODO()

    operator fun iterator(): UIntIterator = TODO()
}

inline class UIntIterator(private val intIterator: (Int)?) : Iterator<UInt> {
    override fun next(): UInt =TODO()

    override fun hasNext(): Boolean =TODO()
}

fun uIntArrayOf(vararg u: String): (UIntArray)? = TODO()

fun (UIntArray)?.index(i: Int, j: (Int)?):UInt =TODO()

fun (Int)?.quickSort():Int =TODO()

private fun UIntArray.quickSort(l: Int, partition: (Unit)?):(Long)? =TODO()

private fun UIntArray.r(l: Unit, r: (Unit)?): Int =TODO()

fun check():UInt =TODO()

fun box(): Int =TODO()
