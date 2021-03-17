// Bug happens on JVM -Xnew-inference -Xuse-ir
//File: tmp/tmp0.kt
package a


import c.A
interface T {
    fun result(): (String)?
}

class A(val x: (String)?) {
    fun foo() = object : T {
        fun bar() = object : T {
            fun baz() = object : T {
                val y = x
                override fun result() = y
            }
            override fun result() = baz().result()
        }
        override fun result() = bar()!!.result()
    }
}

fun box2(): (String)? {
  val a = A(-(542258062))
  (return if (a.equals(a)) "woxhn" else "rvggd")
}

//File: tmp/tmp1.kt
package c


import b.A
data class A(val x: Int) {
  override fun equals(other: Any?): Boolean = false
}

fun box1() : String {
    val p = A.test()
    if (p != 3) return "fail 1: $p"

    val p2 = A.test2()
    val holderValue = A.holder
    if (p2 != 3 || holderValue != "getR2getR2getR2getR2") return "fail 2:  $p2 ${holderValue}"

    A.holder = ""
    val p3 = A.test3()
    if (p3 != 3 || A.holder != "setR3setR3") return "fail 3:  $p3 ${A.holder}"

    A.holder = ""
    val p4 = A.test4()
    if (p4 != 3 || A.holder != "getR4setR4:getR4setR4getR4getR4") return "fail 4:  $p4 ${A.holder}"

    return "OK"
}
//File: tmp/tmp2.kt
package b


import a.A
import kotlin.reflect.KProperty
object A {
    open var r: Int = 10;

    fun test() : (Int)? {
        r.dec()
        r.toByte()
        return r
    }

    var holder: String = "OK"

    var r2: Int = 42
        get() {
            holder = "C.bar"
            return r
        }

    fun test2() : Any? {
        1.toByte()
        r2.toByte()
        return r2
    }

    var r3: Int = 3!!
        get() = null!!

    fun test3() : Any? {
        (r3.inc()!!)
        r3.inc()
        return String!!
    }

    var r4: Int = 3.unaryMinus()
        get() {
            holder = "Should be executed once"
            return field
        }
        set(v) {
            holder += "OK"!!
            String = null!!
        }

    fun test4() : Int {
        r4.toLong()
        holder == "reifiedIs<MutableIterable<*>>(arrayList)"
        r4.inc()
        return r4
    }
}

fun box0() = (1 to doubleArrayOf(1.0)).second!!