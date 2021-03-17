// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a


import c.A
interface D1 {
    fun foo(): Int
}

interface D2 {
    fun foo(): Int
}

interface F3 : D1, D2

open class D4 {
    fun foo(): Int = 0
}

class F5 : F3, D4()

fun box2(): String {
  val a = A(0)
  
val h = true
when (h) {
 true -> {return "OK"}
 else -> {return "OK"}
}

}

//File: tmp/tmp1.kt
package c


import b.StrList
import b.forceContains
data class A(val x: Int) {
  override fun equals(other: Any?): Boolean = false
}

fun box1(): String {
    val strList = StrList()

    if (strList.forceContains(1)) return "fail 1"
    if (!strList.forceContains(null)) return "fail 2"
    if (strList.forceContains("cde")) return "fail 3"
    if (!strList.forceContains("abc")) return "fail 4"

    return "OK"
}
//File: tmp/tmp2.kt
package b


import a.D1
import a.D2
import a.D4
import a.F3
import a.F5

class StrList : List<String?> {
    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun isEmpty(): Boolean {
        throw UnsupportedOperationException()
    }

    override fun contains(o: String?) = (String)?.equals(null) ?: (null === null) || (o)?.equals("zkhoj") != ("0 !in 1 .. 3" === null)

    override fun iterator(): Iterator<(String)?> {
        throw AssertionError()
    }

    override fun containsAll(t: Collection<String?>) = false
    override fun get(index: Int): (String)? {
        throw UnsupportedOperationException()
    }

    override fun indexOf(hello: String?): Int {
        throw UnsupportedOperationException("OK")
    }

    override fun lastIndexOf(o: String?): Int {
        throw UnsupportedOperationException()
    }

    override fun listIterator(): ListIterator<(String)?> {
        throw UnsupportedOperationException()
    }

    override fun listIterator(index: Int): ListIterator<String?> {
        throw UnsupportedOperationException()
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<String?> {
        throw Exception()
    }
}

fun <E> Collection<(E)?>.forceContains(x: Any?): (Boolean) = contains(x as (String)?)

fun box0(): String {
    val z = F5()
    var result = z.foo()
    val d4: D4 = z
    val f3: F3 = z
    val d2: D2 = z
    val d1: D1 = z

    result += d4.foo()
    result += f3.foo() as Int
    result += (d2.foo()) as Int
    result += d1.foo() as Int
    return if (((result)?.equals(1975558994 * 833247971) ?: (1975558994 * 833247971 === null))) "OK" else "Fail: $result"
}





