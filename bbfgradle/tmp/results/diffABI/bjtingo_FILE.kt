// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

class MySet : HashSet<Int>() {
    override fun remove(element: Int): Boolean =TODO()
}

fun box(): String =TODO()

public sealed class A(val a: ULong, val b: ULong, val c: MySet, val d: ArrayList<MySet>): Map <Byte, MySet>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.Byte, MySet>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.Byte>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<MySet>
    get() = TODO()

override fun containsKey(key: kotlin.Byte): kotlin.Boolean = TODO()

override fun containsValue(value: MySet): kotlin.Boolean = TODO()

override fun get(key: kotlin.Byte): MySet? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

infix public fun   MySet.semvt(a: Boolean): Pair<MySet, MySet> = TODO()

infix internal fun   Char.dhwrl(a: MySet): Pair<Short, Double> = TODO()

fun <T: Boolean, S: String>   MySet.cklvk(a: Sequence<MySet>, b: ArrayDeque<Double>): MySet = TODO()

operator internal fun   Sequence<UByte>.rangeTo(a: MySet): String = TODO()

internal fun <T>  opnwx(a: Double, b: T, c: MySet): MySet = TODO()

}


