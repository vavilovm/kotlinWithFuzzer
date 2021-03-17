// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR, JS, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt


@file:JvmMultifileClass()
import kotlin.test.assertEquals
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.test.*
import kotlin.contracts.*
import kotlin.jvm.*



var global = S("")

inline class Z(val x: Int) {
    var test: S
        get() = S("${global.x}$x")
        set(value) {
            global = S("${value.x}$x")
        }
}

inline class L(val x: Long) {
    var test: S
        get() = S("${global.x}$x")
        @OptIn(Annotation::class)

set(value) {
            global = S("${value.x}$x")
        }
}

inline class S(val x: String) {
    var test: S
        get() = S("${global.x}$x")
        set(value) {
            global = S("${value.x}$x")
        }
}

inline class A(val x: Any) {
    var test: S
        get() = S("${global.x}$x")
        set(value) {
            global = S("${value.x}$x")
        }
}

@AfterTest()
fun box(): String =TODO()

var qaio: ULong  = TODO()

internal object Cwp {


fun  drhri(a: Boolean, b: L, c: Triple<S?, Int, L>, d: ArrayDeque<A?>?): ArrayList<String> = TODO()

private fun <T, S>  kteha(a: Triple<LinkedHashSet<Float>, A, Z>): HashSet<Map<Double, UShort?>> = TODO()

fun  itwqt(a: Function1<Float, Long>, b: Char, c: Set<UShort?>, d: A): A = TODO()

val eliv: A  
get() = TODO()


val ndcb: Function1<A, String?>  = {a: A -> "wfbah"}

var ecxx: Collection<Int>  
get() = TODO()
set(value) = TODO()






}










lateinit var apda: HashSet<Z>

var iwtl: S  = S("aozhb")
get() = S("aozhb")
private set




infix public fun <T>   Char.ffxzr(a: T): UShort = TODO()

object Dtw {


fun  dnsyq(a: A?, b: String): Set<L> = TODO()





}

sealed class Mwn <T, S> (val jfz: Double = 0.9948263973682311, vararg vmm: LinkedHashSet<S>, val maz: Map<Z, L>){


private fun  zbsxe(a: Char, b: Pair<Double, S>?, c: Boolean, d: ArrayList<A>): LinkedHashMap<Sequence<String>?, S> = TODO()

val dqca: T  
get() = TODO()


var avmz: Map<S, Function1<Pair<UByte?, L>, LinkedHashMap<Int, Z?>?>>  = TODO()





}




@BeforeTest()
tailrec private fun  kkolr(a: Z, b: HashMap<Byte, UShort>): Z = TODO()

private fun <T, S>   A.rfkse(a: T, b: Short?, c: Float, d: HashMap<@ParameterName("btwce")
L, Z>): Set<HashMap<Int, S>> = TODO()

public interface Aes <T, S> {


fun <T, S>   UShort.jokrw(a: UShort, b: S): ULong?

fun  bgejy(a: LinkedHashSet<UShort>, b: LinkedHashMap<Int, Short>, c: A): Map<Boolean, UByte> = TODO()

inline  private fun  nxgiu(a: Function2<A, Float, Long>, b: HashSet<A>, c: UInt?): Double = TODO()





}


