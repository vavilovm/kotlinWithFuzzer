// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

inline class InlineLong(val value: Long)
inline val Number.toInlineLong get() = InlineLong(this.toLong())

fun box(): String =TODO()

internal abstract class A<T: InlineLong, S> (val a: Long, val b: UByte, val c: T, val d: UByte, val e: Collection<InlineLong>): AbstractMutableMap <InlineLong, InlineLong>(){

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<InlineLong, InlineLong>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override fun containsKey(key: InlineLong): kotlin.Boolean = TODO()

override fun putAll(from: kotlin.collections.Map<out InlineLong, InlineLong>): kotlin.Unit = TODO()

fun   Char.uvawx(a: Int, b: InlineLong, c: Short): InlineLong = TODO()

fun  ogzqk(a: UShort): Sequence<Boolean> = TODO()

fun  qhcuk(a: Float, b: Pair<InlineLong, UShort>, c: InlineLong): Boolean = TODO()

external  fun  rcsqf(a: InlineLong, b: HashSet<InlineLong>): InlineLong

external  fun  gpcuo(a: Array<Double>, b: InlineLong, c: InlineLong): Short

}


