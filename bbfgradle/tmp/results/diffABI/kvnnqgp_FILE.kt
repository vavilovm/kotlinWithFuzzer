// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


package mbpgpgk
import kotlin.collections.*
import kotlin.reflect.*
import kotlin.sequences.*
public open class Outer private constructor(val p: Outer?) {
    object Inner: Outer(null)
    object Other: Outer(Inner)
    object Another: Outer(Other)
}

fun box(): String =TODO()




internal interface Beo : KProperty2<Outer, Pair<Outer, Outer>, List<ArrayDeque<Long>>>, MutableSet<List<Outer>>{

override fun invoke(p1: Outer, p2: kotlin.Pair<Outer, Outer>): kotlin.collections.List<kotlin.collections.ArrayDeque<kotlin.Long>> = TODO()

override fun add(element: kotlin.collections.List<Outer>): kotlin.Boolean = TODO()

override fun contains(element: kotlin.collections.List<Outer>): kotlin.Boolean = TODO()

val dccr: UShort 

var xgla: ArrayDeque<Outer> 

var pxad: String 

var ektl: Outer 

val dyfm: Outer 

val UByte.kgxw: Outer 
get() = TODO()


val Outer.vtte: Short 
get() = TODO()


var kiwp: LinkedHashMap<Byte, List<Int>> 

val ztys: LinkedHashSet<Sequence<Outer>> 

}
