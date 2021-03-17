// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.reflect.*
import kotlin.text.*
object OHolder {
    val O = "O"
}

typealias OHolderAlias = OHolder

class KHolder {
    companion object {
        val K = "K"
    }
}

typealias KHolderAlias = KHolder

fun box(): String = TODO()







public interface Uby : KProperty<Triple<Byte, KHolder, OHolder>>, MatchResult, List<LinkedHashMap<String, KHolder>>{

override val range:  kotlin.ranges.IntRange
override val size:  kotlin.Int
override fun contains(element: kotlin.collections.LinkedHashMap<kotlin.String, KHolder>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.collections.LinkedHashMap<kotlin.String, KHolder>> = TODO()

override fun listIterator(index: kotlin.Int): kotlin.collections.ListIterator<kotlin.collections.LinkedHashMap<kotlin.String, KHolder>> = TODO()

var svak: Short 

val ueke: KHolder 

var exld: Pair<HashSet<UInt>, KHolder> 

var dhkp: Int 

val rlso: LinkedHashSet<UByte> 

var nkql: ULong 

}


