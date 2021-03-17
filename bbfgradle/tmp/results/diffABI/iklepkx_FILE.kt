// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NewInference
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.experimental.ExperimentalTypeInference
import kotlin.String.*
import kotlin.sequences.*
import kotlin.String.*
import kotlin.String.*
import kotlin.ranges.*
import kotlin.test.*






interface Flow<out T> {
    fun String.memExt(param: Int):Unit =TODO()
}

interface FlowCollector<in T> {
    suspend fun emit(value: String)
}

inline fun <T> Flow<T>.collect(crossinline action: suspend (value: T) -> Unit): Unit =TODO()

abstract class LiveData<T>

interface LiveDataScope<T> {
    suspend fun emit(value: T)
}

@OptIn(ExperimentalTypeInference::class)
fun <T> liveData(@BuilderInference block: suspend LiveDataScope<T>.() -> Unit): LiveData<T> = TODO()

fun <Value> Flow<Value>.A() = liveData {
    collect(this::emit)
}

fun box(): Any = TODO()

public open class Gtm <T>  {


protected  fun <T, S: UInt?>  fxsyq(a: S, b: HashMap<Double, List<T>>): Flow<T> = TODO()

suspend protected  fun <T: NoSuchElementException, S>  unach(): Flow<Flow<String>?> = TODO()

public val Int: Char  
get() = '㺸'


private val pech: Collection<LiveDataScope<String>>  
get() = TODO()




}




inline  internal fun  onobr(a: Int, b: Unit?): Double = TODO()

public interface Yqk <T: FlowCollector<FlowCollector<Short>>, S: Flow<ULong>>  : LiveDataScope<UShort?>{

override suspend fun emit(value: kotlin.UShort?): kotlin.Unit = TODO()


abstract fun <T, S>  b(a: T, size: Int = 16, c: S, d: String): T

fun  acqfq(a: Array<Int>, b: Pair<Double, Short>): UShort

val nvrg: Set<Sequence<LiveDataScope<Short>>>  

val fvwt: Flow<UInt?>  



var oeje: Flow<Flow<ULong>>  





}

abstract class Lbl  : Yqk <FlowCollector<FlowCollector<*>>, Flow<ULong>>, Flow <Int>{

override fun acqfq(a: kotlin.Array<kotlin.Int>, b: kotlin.Pair<kotlin.Double, kotlin.Short>): kotlin.UShort = TODO()

override var oeje:  Flow<Flow<kotlin.ULong>>
    get() = TODO()
    set(value) {}


abstract var johy: Short?

val baz = 42



}

public fun interface Ism  {


open fun   String.vxnuc(a: Char, b: Boolean, c: Char, R: ArrayDeque<Byte?>): HashSet<String>



}




private fun <T, S>  nsbko(TODO: String, String: IntArray, c: S, d: Flow<String>): Float = TODO()




















