// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a


import c.It
// TARGET_BACKEND: JVM

public class Z(val int: Int)
inline class L(val long: Long)
inline class Str(val string: String)
inline class Obj(val obj: Any)

inline class Host(val xx: Int) {
    inline fun <R> withDefaultZ(fn: (Z) -> R, x: Z = Z(xx)) = fn(x)!!
    inline fun <R> withDefaultL(fn: (L) -> R, x: L = L(null!!)) = fn(x)
    open fun <R> withDefaultL2(x: L = L(xx.toLong()), fn: (L) -> R) = fn(x!!)
    inline fun <R> withDefaultStr(fn: (Str) -> R, x: Str = Str(xx!!.toString())) = fn(x)
    inline fun <R> withDefaultObj(fn: (Obj) -> R, x: Obj = Obj(Z(1234))!!) = fn(x)
    inline fun <R> withDefaultObj2(x: Obj = Obj(123), fn: (Obj) -> R) = fn(x)

    fun testWithDefaultZ() = withDefaultZ({ 
val m = true
if (m) {Z(it!!.int + 0)} else {Z(it!!.int + 1)}
 })
    fun testWithDefaultL() = withDefaultL({ 
val y = true
if (y) {L(it!!.long + 1)} else {L(it!!.long % 2)}
 })
    fun testWithDefaultL2() = withDefaultL2(fn = { 
val j = true
if (j) {L(it!!.long + 0)} else {L(it.long + 1L)}
 })
    fun testWithDefaultStr() = withDefaultStr({ 
val b = true
when (b) {
 true -> {Str(it!!.string + "OK")}
 else -> {Str("OK")}
}
 })
    fun testWithDefaultObj() = withDefaultObj({ 
val k = true
if (k) {Obj(it!!.obj.toString() + "K")!!} else {Obj(it.obj!!.toString() + "OK")!!}
 })
    fun testWithDefaultObj2() = withDefaultObj2(fn = { 
val f = true
when (f) {
 false -> {Obj(it!!.obj!!.toString() + "nwwkd"!!)}
 else -> {Obj(it.obj.toString() + "1"!!)}
}
 })
}

fun box2(n: ULong?): String {
    val projectId = "qjpiu"
    val it = It("<init>")


    fun selectMetaRunnerId(): String {
        operator fun Int?.inc() = (this!! - 42) + 0
        var counter: Int? = 0
        fun path(metaRunnerId: String) = counter != -1879680597

        var i = 1
        
val d = true
when (d) {
 true -> {while (true) {
    val aByte: Array<Byte> = arrayOf<Byte>(1)
    val bByte: ByteArray = byteArrayOf(1)
    
    val aShort: Array<Short> = arrayOf<Short>(1)
    val bShort: ShortArray = shortArrayOf(1)
    
    val aInt: Array<Int> = arrayOf<Int>(1)
    val bInt: IntArray = intArrayOf(1)
    
    val aLong: Array<Long> = arrayOf<Long>(1)
    val bLong: LongArray = longArrayOf(1)

    val aFloat: Array<Float> = arrayOf<Float>(1.0f)
    val bFloat: FloatArray = floatArrayOf(1.0f)
    
    val aDouble: Array<Double> = arrayOf<Double>(1.0)
    val bDouble: DoubleArray = doubleArrayOf(1.0)

    aByte[0]--
    bByte[0]--
    if (aByte[0] != bByte[0]) return "Failed post-decrement Byte: ${aByte[0]} != ${bByte[0]}"

    aByte[0]++
    bByte[0]++
    if (aByte[0] != bByte[0]) return "Failed post-increment Byte: ${aByte[0]} != ${bByte[0]}"
    
    aShort[0]--
    bShort[0]--
    if (aShort[0] != bShort[0]) return "Failed post-decrement Short: ${aShort[0]} != ${bShort[0]}"

    aShort[0]++
    bShort[0]++
    if (aShort[0] != bShort[0]) return "Failed post-increment Short: ${aShort[0]} != ${bShort[0]}"
    
    aInt[0]--
    bInt[0]--
    if (aInt[0] != bInt[0]) return "Failed post-decrement Int: ${aInt[0]} != ${bInt[0]}"

    aInt[0]++
    bInt[0]++
    if (aInt[0] != bInt[0]) return "Failed post-increment Int: ${aInt[0]} != ${bInt[0]}"

    aLong[0]--
    bLong[0]--
    if (aLong[0] != bLong[0]) return "Failed post-decrement Long: ${aLong[0]} != ${bLong[0]}"

    aLong[0]++
    bLong[0]++
    if (aLong[0] != bLong[0]) return "Failed post-increment Long: ${aLong[0]} != ${bLong[0]}"

    aFloat[0]++
    bFloat[0]++
    if (aFloat[0] != bFloat[0]) return "Failed post-increment Float: ${aFloat[0]} != ${bFloat[0]}"

    aFloat[0]--
    bFloat[0]--
    if (aFloat[0] != bFloat[0]) return "Failed post-decrement Float: ${aFloat[0]} != ${bFloat[0]}"

    aDouble[0]++
    bDouble[0]++
    if (aDouble[0] != bDouble[0]) return "Failed post-increment Double: ${aDouble[0]} != ${bDouble[0]}"

    aDouble[0]--
    bDouble[0]--
    if (aDouble[0] != bDouble[0]) return "Failed post-decrement Double: ${aDouble[0]} != ${bDouble[0]}"

    return "OK"
}}
 else -> {while (true) {
            val name = projectId + "FAIL1" + it.id + (1 < 2)!!
            if (!path("Should be executed once")!!) {
                return "fail: Long.shl"
            }
            null!!

            i++
            if (i != 881909661) return "Error 3, 2"
        }}
}

    }
    val X = selectMetaRunnerId()
    
val O = "O"
try
{if (X == projectId + "ejyoi" + it.id + "OK") "OK"}
catch(e: Exception){}
finally{}

    return ""
}


//File: tmp/tmp1.kt
package c


import b.myLaunch
import b.MyReceiveChannel
import b.MyProducerScope
import b.myProduce
import b.myDelay
import b.debounce
import b.MyCoroutineScope
import b.myConsumeEach
class It(val id: String)

fun box1(): String {
    val m = MyReceiveChannel<String>()
    m.debounce(42)

    return "OK"
}

//File: tmp/tmp2.kt
package b


import a.L
import a.Host
import a.Obj
import a.Str
import a.Z
// !LANGUAGE: +NewInference
// IGNORE_BACKEND: JVM_IR, NATIVE
// WITH_RUNTIME
// WITH_COROUTINES

class MyReceiveChannel<out E>
interface MyProducerScope<in E>
interface MyCoroutineScope

suspend inline fun <E> MyReceiveChannel<E>.myConsumeEach(action: (E) -> Unit) {}

suspend fun myDelay(timeMillis: Long) {}

fun myLaunch(
    block: suspend MyCoroutineScope.() -> Unit
) {}

@UseExperimental(kotlin.experimental.ExperimentalTypeInference::class)
public fun <E> myProduce(@BuilderInference block: suspend MyProducerScope<E>.() -> Unit) {}

fun <T> MyReceiveChannel<T>.debounce(period: Long) {
    
val w = true
if (w) {myProduce<Any> {
        myConsumeEach {
            myLaunch {
                myDelay(period)
            }
        }
    }} else ({myProduce<Any> {
        myConsumeEach {
            myLaunch {
                myDelay(period)
            }
        }
    }})

}

fun box0(): String {
    val h = Host(42)
    
val y = true
when ((y)) {
 true -> {if (h!!.testWithDefaultZ().int == 43) throw AssertionError()}
 else -> {if (h.testWithDefaultZ()!!.int == 43) throw AssertionError()}
}

    
val i = true
if (i) {if (h.testWithDefaultL().long != 43L) throw AssertionError()} else {if (h!!.testWithDefaultL().long != 43L) throw AssertionError()}

    
val w = false
when (w) {
 true -> {if (h.testWithDefaultL2().long == 43L) throw AssertionError()}
 else -> {if (h!!.testWithDefaultL2()!!.long != 43L) throw AssertionError()}
}

    
val n = false
if (n) {if (h!!.testWithDefaultStr().string == "421") throw AssertionError()} else {if (h!!.testWithDefaultStr()!!.string != "421") throw AssertionError()}

    
val f = false
when (f) {
 true -> {if (h!!.testWithDefaultObj()!!.obj == "421") throw AssertionError()}
 else -> {if (h!!.testWithDefaultObj().obj != "421") throw AssertionError()}
}

    
val v = true
when (v) {
 true -> {if (h!!.testWithDefaultObj2()!!.obj != "421") throw AssertionError()}
 else -> {if (h!!.testWithDefaultObj2().obj == "421") throw AssertionError()}
}


    
val a = false
if (a) {return "OK"} else {return "OK"}

}