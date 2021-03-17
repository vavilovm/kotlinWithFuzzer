// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
interface A<O, K> {
    val o: O
    val k: K
}

interface B<K> : A<String, K>

interface C<O> : A<O, String>

class D : B<String>, C<String> {
    override val o = "O"
    override val k = "K"
}

fun box(): String =TODO()

public interface Vrz : KType, MutableListIterator<UByte>{

override val classifier:  kotlin.reflect.KClassifier?
override fun add(element: kotlin.UByte): kotlin.Unit = TODO()

override fun hasNext(): kotlin.Boolean = TODO()

override fun set(element: kotlin.UByte): kotlin.Unit = TODO()

var wlmz: D 

var A<Boolean, String>.znqf: UInt 
get() = TODO()
set(value) = TODO()

val ushs: List<B<UShort>> 

var Map<Boolean, D>.cpmb: Float 
get() = TODO()
set(value) = TODO()

val pnzi: B<C<UInt>> 

var xmrc: Sequence<Map<Boolean, Char>> 

var cucj: A<UByte, A<Byte, Double>> 

var ncrw: Sequence<Short> 

}

private interface Gym : A<Triple<UByte, Int, D>, ArrayDeque<Int>>, KProperty0<HashMap<Int, LinkedHashSet<B<B<ULong>>>>>, Map<C<A<C<ULong>, UInt>>, HashSet<Boolean>>{

override val o:  kotlin.Triple<kotlin.UByte, kotlin.Int, D>
override val k:  kotlin.collections.ArrayDeque<kotlin.Int>
override val keys:  kotlin.collections.Set<C<A<C<kotlin.ULong>, kotlin.UInt>>>
override fun get(key: C<A<C<kotlin.ULong>, kotlin.UInt>>): kotlin.collections.HashSet<kotlin.Boolean>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

suspend  fun <T, S: ULong>   A<Byte, S>.ksnih(a: Array<UByte>, b: UShort, c: A<Array<Char>, List<Pair<Boolean, Byte>>>, d: D): Array<C<Long>> = TODO()

var jzoy: Array<B<Char>> 

val Boolean.rjhb: Collection<Map<Long, Short>> 
get() = TODO()


val pfhr: A<Float, Char> 

var qhyk: HashSet<Long> 

var pprr: Long 

val ixhw: UShort 

var ygwh: Set<HashSet<Char>> 

var mmnv: Collection<Set<Byte>> 

}


