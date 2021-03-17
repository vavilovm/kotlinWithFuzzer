// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.sequences.*
interface Trait1 {
    fun foo() : String
}

interface Trait2  {
    fun bar() : String
}

class T1 : Trait1{
    override fun foo():String = TODO()
}

class T2 : Trait2{
    override fun bar():String  = TODO()
}

class C(a:Trait1, b:Trait2) : Trait1 by a, Trait2 by b

fun box() : String =TODO()




enum private  class Jtb {
RG(){
override val cjjry: Trait2
    get() = TODO()
};
abstract val cjjry: Trait2
public open class Quo (var hja: Trait2): MutableIterable <Long>{

override fun iterator(): kotlin.collections.MutableIterator<kotlin.Long> = TODO()

private fun <T, S>  npyon(a: S, b: S, c: Long): Double = TODO()

var inga: Sequence<UShort> = TODO()

val ftle: LinkedHashSet<UByte> = linkedSetOf<UByte>()

val bzcr: Trait1 = TODO()

var qejx: Pair<HashMap<String, Trait1>, T1> = TODO()

val Array<ArrayDeque<UByte>>.rnlo: Sequence<Char> 
get() =  TODO()


val pjpa: T2 = TODO()

}
}




private interface Fqz <T, S> : MutableCollection<Pair<UShort, UInt>>, Trait2{

override fun addAll(elements: kotlin.collections.Collection<kotlin.Pair<kotlin.UShort, kotlin.UInt>>): kotlin.Boolean = TODO()

override fun remove(element: kotlin.Pair<kotlin.UShort, kotlin.UInt>): kotlin.Boolean = TODO()

val sfky: Float 

var proj: HashMap<T, T> 

var ArrayList<Boolean>.apxn: List<S> 
get() = TODO()
set(value) = TODO()

val duem: Array<S> 

var Short.kdnp: T1 
get() = TODO()
set(value) = TODO()

}


