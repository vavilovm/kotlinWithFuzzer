// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.reflect.*
import kotlin.sequences.*
interface FooTrait {
        val propertyTest: String
}

class FooDelegate: FooTrait {
        override val propertyTest: String = "OK"
}

class DelegateTest(): FooTrait by FooDelegate() {
  fun test():String = TODO()
}

fun box():String  = TODO()

internal interface Icc : Iterable<Map<FooTrait, DelegateTest>>, KProperty<FooDelegate>, FooTrait{

fun  yzwwv(a: FooTrait): FooDelegate = TODO()

val itaa: DelegateTest 

val acpe: UShort 

val UShort.abdc: Short 
get() = TODO()


var wrqz: UByte 

var Sequence<Set<Byte>>.dzyx: Long 
get() = TODO()
set(value) = TODO()

}










final class Flv : Map <UInt, ArrayDeque<DelegateTest>>, Annotation{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.UInt, kotlin.collections.ArrayDeque<DelegateTest>>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.UInt>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.collections.ArrayDeque<DelegateTest>>
    get() = TODO()

override fun containsKey(key: kotlin.UInt): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.collections.ArrayDeque<DelegateTest>): kotlin.Boolean = TODO()

override fun get(key: kotlin.UInt): kotlin.collections.ArrayDeque<DelegateTest>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()
val novtc = object {
var cnfx: Byte = TODO()

var vzqn: Set<Map<Triple<Int, DelegateTest, UByte>, ULong>> = setOfNotNull<Map<Triple<Int, DelegateTest, UByte>, ULong>>(mapOf<Triple<Int, DelegateTest, UByte>, ULong>(Pair<Triple<Int, DelegateTest, UByte>, ULong>(Triple<Int, DelegateTest, UByte>(1051747004, DelegateTest(), 121.toUByte()), 8383477523479168816.toULong())))

val hdpn: FooTrait = DelegateTest()

var Array<MutableMap<DelegateTest, FooDelegate>>.qkrs: Collection<Boolean> 
get() =  hashSetOf<Boolean>(false)
set(value) = TODO()

var voaf: Char = TODO()

val mffm: DelegateTest = DelegateTest()
}
infix  fun   UShort.kecnt(a: String): FooTrait = TODO()

var jmtm: Long = TODO()

val bcci: Pair<Float, UInt> = Pair<Float, UInt>(0.9816657f, 647126435.toUInt())

var shmk: Collection<Pair<Char, String>> = mutableSetOf<Pair<Char, String>>(Pair<Char, String>('ᭈ', "byixs"))

val oghl: Byte = 113

var jvbe: LinkedHashMap<HashSet<FooTrait>, ArrayDeque<Long>> = TODO()
inner internal  class Cvs (vararg jai: HashSet<FooDelegate>, yro: Char, bui: Int = -1466432896, val yui: LinkedHashMap<Byte, Byte> = linkedMapOf<Byte, Byte>(Pair<Byte, Byte>(118, 26))){

val Short.qban: Double 
get() =  TODO()


val wloq: Double = 0.7452500857064422

val DelegateTest.hadu: FooDelegate 
get() =  FooDelegate()


val locs: DelegateTest = TODO()

val vsaq: FooDelegate = TODO()

var vgaf: DelegateTest = TODO()

}
}


