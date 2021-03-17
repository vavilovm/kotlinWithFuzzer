// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.BaseClass
import a.Subclass
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

var order = StringBuilder()

inline fun expectOrder(at: String, expected: String, body: () -> Unit) {
    order = StringBuilder() // have to do that in order to run this test in JS
    body()
    if (order.toString() != expected) {
        throw AssertionError("$at: expected: '$expected', actual: '$order'")
    }
}

class Z(val x: Int) : Comparable<Z> {
    override fun compareTo(other: Z): Int {
        order.append("c:$x,${other.x} ")
        return x.compareTo(other.x)
    }
}

fun z(i: Int): Z {
    order.append("z:$i ")
    return Z(i)
}

fun zr(i: Int, j: Int) = z(i) .. z(j)

fun box0(): String {
    val r = Subclass().getKindValue() + Subclass().kind
    return if(r == "Subclass Subclass ") "OK" else "fail"
}
//File: tmp/tmp1.kt
package c


import b.expectOrder
import b.Z
import b.order
import b.zr
import b.z
// See also KT-6299
public open class Outer private constructor(val s: String, val f: Boolean = true) {
    class Inner: Outer("xyz")
    class Other: Outer("abc", true)
    class Another: Outer("", false)
}

fun box1(): String {
    expectOrder("#1",  "z:1 z:3 z:0 c:0,1 ") { z(0) in z(1) .. z(3) }
    expectOrder("#1a", "z:1 z:3 z:0 c:0,1 ") { z(0) in zr(1, 3) }

    expectOrder("#2",  "z:1 z:3 z:2 c:2,1 c:2,3 ") { z(2) in z(1) .. z(3) }
    expectOrder("#2a", "z:1 z:3 z:2 c:2,1 c:2,3 ") { z(2) in zr(1, 3) }

    expectOrder("#3",  "z:1 z:3 z:4 c:4,1 c:4,3 ") { z(4) in z(1) .. z(3) }
    expectOrder("#3a", "z:1 z:3 z:4 c:4,1 c:4,3 ") { z(4) in zr(1, 3) }

    expectOrder("#4",  "z:1 z:3 z:0 c:0,1 ") { z(0) !in z(1) .. z(3) }
    expectOrder("#4a", "z:1 z:3 z:0 c:0,1 ") { z(0) !in zr(1, 3) }

    expectOrder("#5",  "z:1 z:3 z:2 c:2,1 c:2,3 ") { z(2) !in z(1) .. z(3) }
    expectOrder("#5a", "z:1 z:3 z:2 c:2,1 c:2,3 ") { z(2) !in zr(1, 3) }

    expectOrder("#6",  "z:1 z:3 z:4 c:4,1 c:4,3 ") { z(4) !in z(1) .. z(3) }
    expectOrder("#6a", "z:1 z:3 z:4 c:4,1 c:4,3 ") { z(4) !in zr(1, 3) }

    return "OK"
}
//File: tmp/tmp2.kt
package a


import c.Outer.Inner
import c.Outer.Other
import c.Outer
import c.Outer.Another
abstract class BaseClass() {
    open val kind : String = "BaseClass "

    fun getKindValue() : String {
        
val q = true
when (q) {
 true -> {return ""}
 else -> {return "OK"}
}

    }
}

public class Subclass : BaseClass() {
    override val kind : String = "OK"
}

fun box2(): String {
    return if ("s" in 0..1) "OK" else "fail"
}
