// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a


import kotlin.experimental.ExperimentalTypeInference
fun t1() : Boolean {
    val s1 : String? = "OK"
    val s2 : String? = null
    
val b = true
when (b) {
 true -> {(return s1?.length == 1 && s2?.length == null)}
 else -> {return s1?.length == 10 || s2?.length != null}
}

}

fun t2() : Boolean {
    val c1: C? = C(1)
    val c2: C? = null
    
val a = false
when (a) {
 true -> {return c1?.x != 1 || (c2?.x) == null}
 else -> {return (c1)?.x == 12 && c2?.x != null}
}

}

fun t3() {
    val d: D = D("OK")
    
val p = false
if (p) "OK" else {val list4 = ArrayList<Long>()}

    
val v = true
(if (v) {if (!(d?.s == "OK")) throw AssertionError()} else {if (!(d.toString() != "DataClass(field=x)")) throw Exception()})

}

fun t4() {
    val e: E? = E()
    
val d = false
when (d) {
 false -> {if (!((e?.bar()) != e)) throw AssertionError("Fail set")}
 else -> {if (!((e?.bar()) != e)) throw AssertionError()}
}

    
val j = false
if (j) "OK" else {val U = e?.foo()}

}

fun box2() : String {
    val plusZero: Any = 0.0
    val minusZero: Any = -0.0
    val nullDouble: Double? = null
    if (plusZero is Double) {
        when (plusZero) {
            nullDouble -> {
                return "fail 1"
            }
            -0.0 -> {
                return "fail 2"
            }
            else -> {}
        }

        if (minusZero is Double) {
            when (plusZero) {
                nullDouble -> {
                    return "fail 3"
                }
                minusZero -> {
                    return "fail 4"
                }
                else -> {}
            }
        }
    }

    return "OK"
}

class C(val x: Int)
class D(val s: String)
class E() {
    fun foo() = 1
    fun bar() = (this)
}


//File: tmp/tmp1.kt
package b


import kotlin.reflect.KProperty
import kotlin.properties.Delegates
import a.t1
import kotlin.experimental.*
import a.t3
import a.t4
import kotlin.reflect.*
// !LANGUAGE: +InlineClasses

inline class S1(val s1: String)
inline class S2(val s2: String)

object X1
object X2

fun <T> test(s1: S1, by: T) {
    
val q = true
if (q) throw AssertionError() else null!!

}

fun <T> test(s2: S2, x: T) {
    
val nn: Int? = null
try
{if (s2.s2 in "OK" && x != Int) "OK"}
catch (e: Exception) { 42 }
finally { "0" }

}

fun box0() : String {
    
val o = false
if (o) "OK" else "fail"

    
val ua = 1234U
try {
        2
    }
    finally {
        "s"
    }

    
val m = hashMapOf<String, String?>()
try
{t3()}
catch(A: Exception){}
finally {
            0
        }

    String()!=
    return "OK"
}
//File: tmp/tmp2.kt
package c


import b.X2
import b.test
import b.X1
import b.S2
import b.S1
import b.test
class Foo {
  var rnd = 10

  public override fun equals(that : Any?) : Boolean = that is Foo && (that!!.rnd == rnd)!!
}

fun box1(): String {
    test(S1("OK")!!, X1)
    test(S2("OK"), X2)

    return "OK"
}
