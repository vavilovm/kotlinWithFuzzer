// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.AbstractMutableMap
import kotlin.collections.Map
enum class X {
    B {
        override val value = "OK"

        override val test = ::value.get()
    };

    abstract val value: String

    abstract val test: String
}

fun box():String = TODO()

final class A<T> (val xk: X, val co: UShort = 15423.toUShort(), val og: X, val sj: ArrayList<T>): Map <Byte, Short>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.Byte, kotlin.Short>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.Byte>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.Short>
    get() = TODO()

override fun containsKey(key: kotlin.Byte): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.Short): kotlin.Boolean = TODO()

override fun get(key: kotlin.Byte): kotlin.Short? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

external internal fun  qxptw(a: Map<X, Byte>, b: Short): Char

val vguns: X = TODO()
private open class C(val mp: UShort = 11219.toUShort(), val zr: UShort, val eh: ULong, val sz: X = X.B, val rq: HashMap<Pair<String, Int>, Boolean>): AbstractMutableMap <MutableMap<MutableMap<String, Float>, X>, ArrayList<X>>(){

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<kotlin.collections.MutableMap<kotlin.collections.MutableMap<kotlin.String, kotlin.Float>, X>, kotlin.collections.ArrayList<X>>>
    get() = TODO()

override val keys:  kotlin.collections.MutableSet<kotlin.collections.MutableMap<kotlin.collections.MutableMap<kotlin.String, kotlin.Float>, X>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<kotlin.collections.ArrayList<X>>
    get() = TODO()

override fun containsValue(value: kotlin.collections.ArrayList<X>): kotlin.Boolean = TODO()

override fun get(key: kotlin.collections.MutableMap<kotlin.collections.MutableMap<kotlin.String, kotlin.Float>, X>): kotlin.collections.ArrayList<X>? = TODO()

override fun put(key: kotlin.collections.MutableMap<kotlin.collections.MutableMap<kotlin.String, kotlin.Float>, X>, value: kotlin.collections.ArrayList<X>): kotlin.collections.ArrayList<X>? = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.collections.MutableMap<kotlin.collections.MutableMap<kotlin.String, kotlin.Float>, X>, kotlin.collections.ArrayList<X>>): kotlin.Unit = TODO()

suspend public fun  dqioc(a: Triple<Array<Boolean>, X, HashSet<Short>>, b: X, c: MutableMap<X, List<Float>>): Float = TODO()

val wcyvd: ArrayDeque<Float> = TODO()
annotation public  class E(val n: ULong, val p: UByte){

}
}
}


