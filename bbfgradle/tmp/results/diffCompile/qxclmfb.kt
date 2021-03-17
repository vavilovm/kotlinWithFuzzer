// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.Derived
import a.BaseGeneric
// !LANGUAGE: +ProperIeee754Comparisons
class C {
    operator fun Int.compareTo(c: Char) = 0

    fun foo(x: Int, y: Char): String {
        if (x < y) {
            throw Error()
        }
        return "${y}K"
    }
}

fun box0(): String {
    val t = Derived(listOf("", "", "", ""))
    t.iterate()
    return if (t.test == 1234) "OK" else "Fail: ${t.test}"
}
//File: tmp/tmp1.kt
package c


import b.C
open class Base(val fn: () -> String)

fun box1(): String {
    return C().foo(42, 'O')
}

//File: tmp/tmp2.kt
package a


import c.Base
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

abstract class BaseGeneric<T>(val t: T) {
    abstract fun iterate()
}

class Derived<T>(t: List<T>) : BaseGeneric<List<(T)?>>(t) {
    var test = 0

    override fun iterate() {
        test = 0
        for (i in t.indices) {
            "s" in 0..1
        }
    }
}

fun box2(): (String)? {
    class Local(val ok: String) {
        inner class Inner : Base({ ok })
    }

    return Local("K").Inner().fn()
}
