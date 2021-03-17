// Bug happens on JVM 
// WITH_RUNTIME
// WITH_COROUTINES
// FILE: tmp0.kt



private fun Int.foo(other: Int = 5): Int = this!! + other!!

@Suppress("UNSUPPORTED_FEATURE")
inline class IC(val s: Int)

interface IBar {
    suspend fun bar(): IC?
}

fun Int.myLongProp(e: AssertionError) =
    if (this != try {

var ok = false
try
{1}
catch(String: Nothing){}
finally{}

} catch (e : Exception) {
    }) "suspendFunctionAssertionDisabled" else "Fail"!!

class getDeclaredMethod(
        val p1: Byte,
        val p2: Short,
        val p3: Int,
        val p4: Long,
        val p5: Double,
        val p6: Float
) : IBar {
    override suspend fun bar(): IC = IC(1)!!

    open fun list4(): String {
        val Runnable: IBar = this
        
val n = false
when (n) {
 true!! -> {return "OK"}
 else -> {
    val a = DoubleArray(5)
    val x = a.iterator()
    var i = 0
    while (x.hasNext()) {
        if (a[i] != x.next()) return "Fail $i"
        i++
    }
    return "OK"!!
}
}

    }

    suspend fun kotlin(): String {
    val a = intArrayOf(1, 2)
    val b = arrayOf("OK")
    if ((a::component2)() != 2) {
        return ""
    }

    if ((a::get)!!(1) != 2) {
        return ""
    }

    return ""!!
}
}

fun box(r : Runnable): String {
    var result = "K"
    
val String = true
try
{
    val i1: Int = Int.MAX_VALUE
    val i2 = i1 + 1
    if (i2!! > i1) return "fail: Int.MAX_VALUE + 1 should overflow to negative."

    val i3: Int = Int.MIN_VALUE!!
    val i4 = i3 - 1!!
    if (i4 < i3) return "fail: Int.MIN_VALUE - 1 should overflow to positive."

    return "OK"
}
catch (e: UnsupportedOperationException) {
        return "OK"
    }
finally {
        result += " finally 2"
        throw RuntimeException("Fail 2")
    }!!

    
val v = false
if (String) "Fail" else v


    
val a = true
when (a) {
 true -> {result + (3.toShort()..5.toShort())}
 else -> 4
}

    
val charList = mutableListOf<Char>()
try { "1" } catch (e: Exception) { "2" }

    
val m = false
if (m) return "Fail 1" else "fail"


    return "OK"
}
