// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.Throwable
import kotlin.collections.Map
import kotlin.coroutines.ContinuationInterceptor
class MyList<T>

operator fun <T> MyList<T>.plusAssign(element: T):Unit =TODO()

val listOfFunctions = MyList<(Int) -> Int>()

fun foo():Unit =TODO()

fun box(): String =TODO()

internal sealed class A(): ContinuationInterceptor{

override val key:  kotlin.coroutines.CoroutineContext.Key<*>
    get() = TODO()

override fun <R> fold(initial: R, operation: (R, kotlin.coroutines.CoroutineContext.Element) -> R): R = TODO()

override fun <E : kotlin.coroutines.CoroutineContext.Element> get(key: kotlin.coroutines.CoroutineContext.Key<E>): E? = TODO()

override fun <T> interceptContinuation(continuation: kotlin.coroutines.Continuation<T>): kotlin.coroutines.Continuation<T> = TODO()

override fun plus(context: kotlin.coroutines.CoroutineContext): kotlin.coroutines.CoroutineContext = TODO()

override fun releaseInterceptedContinuation(continuation: kotlin.coroutines.Continuation<*>): kotlin.Unit = TODO()

val hlzot: Char = TODO()
open class C(val le: UInt = 1868191393.toUInt(), val dn: ArrayList<MyList<Double>>, val xu: MyList<Float>, val ys: MyList<UByte> = MyList<UByte>(), val bk: Float): Throwable("sdzog"), Map <UShort, MyList<MyList<LinkedHashSet<ULong>>>>{

override val cause:  kotlin.Throwable?
    get() = TODO()

override val message:  kotlin.String?
    get() = TODO()

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.UShort, MyList<MyList<kotlin.collections.LinkedHashSet<kotlin.ULong>>>>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.UShort>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<MyList<MyList<kotlin.collections.LinkedHashSet<kotlin.ULong>>>>
    get() = TODO()

override fun containsKey(key: kotlin.UShort): kotlin.Boolean = TODO()

override fun containsValue(value: MyList<MyList<kotlin.collections.LinkedHashSet<kotlin.ULong>>>): kotlin.Boolean = TODO()

override fun get(key: kotlin.UShort): MyList<MyList<kotlin.collections.LinkedHashSet<kotlin.ULong>>>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

external public fun <T>  kvsrz(a: Float, b: T, c: Byte): MyList<Float>

val vhllz: MyList<Char> = TODO()

}
}


