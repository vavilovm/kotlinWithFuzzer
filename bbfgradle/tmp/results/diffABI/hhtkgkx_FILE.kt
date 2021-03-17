// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

annotation class Anno(val x: Array<String> = emptyArray())

@Anno fun test1():Int = TODO()
@Anno(arrayOf("K")) fun test2():Int = TODO()

fun box(): String =TODO()

open class A<T: Triple<Anno, String, Sequence<Anno>>, S> (val a: Triple<List<Float>, UByte, S>, val b: String, val c: S, val d: ArrayList<T>): AbstractMutableMap <Anno, Array<Anno>>(){

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<Anno, kotlin.Array<Anno>>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<Anno>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<kotlin.Array<Anno>>
    get() = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsKey(key: Anno): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.Array<Anno>): kotlin.Boolean = TODO()

override fun get(key: Anno): kotlin.Array<Anno>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun put(key: Anno, value: kotlin.Array<Anno>): kotlin.Array<Anno>? = TODO()

override fun putAll(from: kotlin.collections.Map<out Anno, kotlin.Array<Anno>>): kotlin.Unit = TODO()

override fun remove(key: Anno): kotlin.Array<Anno>? = TODO()

tailrec internal fun  inpme(a: Array<Anno>, b: Int, c: Int, d: Byte): Byte = TODO()

tailrec private fun <T>  tzhgm(a: Array<Map<Float, Anno>>, b: Pair<Float, LinkedHashSet<String>>): Char = TODO()

internal fun  acvpk(a: Char, b: LinkedHashMap<UShort, Anno>, c: Float): Anno = TODO()

inline  private fun  jstni(a: UByte, b: Anno, c: Anno, d: Anno): String = TODO()

fun   String.rtgan(a: ArrayDeque<UByte>, b: Double, c: LinkedHashMap<Collection<Anno>, Double>, d: Double): Anno = TODO()

}


