// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


package rqzirsw
import kotlin.reflect.KProperty

class Delegate {
    operator fun getValue(t: F.A, p: KProperty<*>): Int = TODO()
}

class F {
    val A.prop: Int by Delegate()

    class A {
    }
    
    fun foo(): Int =TODO()
}

fun box(): String =TODO()

public open class A(val a: Long, val b: Sequence<UShort>, val c: ArrayList<Float>): AbstractMap <List<Byte>, F>(){

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.List<kotlin.Byte>, F>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.collections.List<kotlin.Byte>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<F>
    get() = TODO()

override fun containsKey(key: kotlin.collections.List<kotlin.Byte>): kotlin.Boolean = TODO()

override fun containsValue(value: F): kotlin.Boolean = TODO()

override fun get(key: kotlin.collections.List<kotlin.Byte>): F? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

inline suspend  fun <T, S>   Byte.bwpea(a: Char, b: MutableMap<F, Double>, c: HashSet<ULong>, d: F): Int = TODO()

tailrec  fun  hlkca(a: ArrayList<ULong>, b: Delegate): F = TODO()

internal fun  mzeva(a: Pair<Byte, Short>, b: Int, c: HashSet<LinkedHashMap<Long, Delegate>>): Float = TODO()

infix internal fun   Sequence<Pair<UByte, Boolean>>.ebxac(a: UShort): Float = TODO()

private fun  gocdy(a: Pair<ULong, ULong>, b: Delegate, c: Sequence<Triple<Short, Short, Boolean>>, d: ULong): Array<MutableMap<UShort, Long>> = TODO()

}
