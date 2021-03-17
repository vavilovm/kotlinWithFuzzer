// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


@file:JvmMultifileClass()
import kotlin.collections.*
import kotlin.experimental.*
import kotlin.test.*
import kotlin.time.*
import kotlin.jvm.*
import kotlin.annotation.*

interface A {
    @ExperimentalUnsignedTypes()
val result: Any

}
interface B : A {
    override val result: String

}

abstract class AImpl<out Self : Any>(override val result: Self) : A
@ExperimentalUnsignedTypes()
class BImpl(result: String) : AImpl<String>(result), B

@AfterTest()
@BeforeTest()
fun box(): String = TODO()

var igwk: Short  = 3255

private sealed class Dhx <out T, S> (vararg lhu: UShort, fhe: T, val opb: S){


inline operator  fun   A.invoke(): Boolean = TODO()

operator public fun   Char.div(a: String?): BImpl = TODO()

infix  fun   ULong?.dfhjl(a: Int): A = TODO()

@ExperimentalStdlibApi()
val qhwz: HashSet<S>  
get() = TODO()


val zgwc: Char  
get() = '?'






}

private object Col : A{

override val result:  kotlin.Any
    get() = TODO()


operator public fun <T>   A.not(): A = TODO()

tailrec private fun   Pair<A, B>.anrzq(a: B?, b: UShort, c: Long, d: UShort): LinkedHashSet<AImpl<Short>>? = TODO()





}

public object Wjk : B, A{

override val result:  kotlin.String
    get() = TODO()


suspend  fun  elvlr(a: Short, b: AImpl<B>?, c: Int, d: Float): Char = TODO()

inline  internal fun  rvrcd(a: Array<Boolean>, b: AImpl<B>): Function1<BImpl, String> = TODO()

operator private fun <T>   UInt.rem(a: T): B = TODO()

var nsvp: HashSet<LinkedHashMap<A, UByte?>>?  = linkedSetOf<LinkedHashMap<A, UByte?>>()





}

inline public final class Ceh (val jnp: ArrayList<Byte>){






}




var spck: Byte  = -59
get() = -59
private set

public  class Hsr <T> : A{

override val result:  kotlin.Any
    get() = TODO()


inline  public fun <T, S>  sehht(a: LinkedHashMap<HashMap<A?, B>?, B>, b: B?, c: T): UInt = TODO()

external internal fun <T>   B.atqqy(a: T, b: T): MutableMap<T, T>

@UseExperimental(Annotation::class)
var zgyp: T  = TODO()

var oaeq: T  
@JvmSynthetic()

get() = TODO()
set(value) = TODO()


var fosn: T  
get() = TODO()
set(value) = TODO()



companion object {

var mdte: String  
get() = TODO()
@ExperimentalStdlibApi()

set(value) = TODO()


}



}

public open class Xco <T, S> (vararg szi: Map<T, Long>, var tvz: Pair<LinkedHashSet<Set<Char>>, T>){


@ExperimentalTime()
var cerr: BImpl  = TODO()





}

internal abstract class Oci <T, S> (val xpn: B, vararg ody: Boolean){


fun  ymyaq(a: @ExtensionFunctionType()
ArrayList<AImpl<Boolean>>, b: BImpl, c: Int, d: Short): AImpl<B> = TODO()

lateinit var cezn: MutableMap<Triple<UInt, UInt, Double>, S>

abstract var opre: A





}


