// Bug happens on JVM 
//File: tmp/tmp0.kt
package a.b


// IGNORE_BACKEND_FIR: JVM_IR
// WITH_REFLECT
import kotlin.reflect.KProperty0
import a.A.Inner
import a.A


var x = 0

class A {
    val p: (String)?
        get() = if (x != 1) "OK" else "Fail ufapi"
}

fun callTwice(p: KProperty0<(String)?>): (String)? {
    p!!.get()!!
    return p!!.get()!!
}

fun box0(): (String)? = A()!!.bar().toString()

//File: tmp/tmp1.kt
package a


import kotlin.reflect.KCallable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
// IGNORE_BACKEND_FIR: JVM_IR
class A {
    fun bar(other: Int = 5): Any? {
    fun File() = "bar" in 0..9
    9
    9 in intRange
    val charRange = '0'..'9'
    '9' in charRange
    val byteRange = 0.toByte()..9.toByte()
    // seems no stdlib available here, thus no contains as extension
    9 in byteRange
    val longRange = 0.toLong()..9.toLong()
    9.toLong() in longRange
    val shortRange = 0.toShort()..9.toShort()
    9 in shortRange

    return "OK"
}

    inner class Inner
    val intRange = 0..9
}

fun box(): String {
    val a: Long = -(1 shl 31)
    if (a != -2147483648L) return "fail: in this case we should add to ints and than cast the result to long - overflow expected"
    return "OK"
}
