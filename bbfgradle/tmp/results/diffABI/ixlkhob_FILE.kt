// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.reflect.*
inline class NullableInt(private val holder: Any?) {
    val intValue: Int get() = holder as Int
}

val prop: ArrayList<NullableInt> = arrayListOf(NullableInt(0))

fun box(): String =TODO()




private interface Jqe <T> : Comparable<Byte>, Annotation{

override fun compareTo(other: kotlin.Byte): kotlin.Int = TODO()

var aver: NullableInt 

var zlli: NullableInt 

var yndb: Byte 

var sinz: Double 

var scut: T 

}

public interface Bzb : MutableMap<NullableInt, NullableInt>, KProperty2<UInt, Short, NullableInt>{

override val size:  kotlin.Int
override val values:  kotlin.collections.MutableCollection<NullableInt>
override fun containsValue(value: NullableInt): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun putAll(from: kotlin.collections.Map<out NullableInt, NullableInt>): kotlin.Unit = TODO()

val vwyd: NullableInt 

val soax: Boolean 

var yweo: NullableInt 

val Array<NullableInt>.wlfr: UShort 
get() = TODO()


var nwxw: UByte 

var knzv: HashSet<NullableInt> 

var Double.vgzi: NullableInt 
get() = TODO()
set(value) = TODO()

val NullableInt.ctxc: NullableInt 
get() = TODO()


var pcop: Pair<ULong, ULong> 

}


