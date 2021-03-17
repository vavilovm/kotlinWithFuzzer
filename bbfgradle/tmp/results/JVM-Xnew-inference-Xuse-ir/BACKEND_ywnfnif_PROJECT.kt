// Bug happens on JVM -Xnew-inference -Xuse-ir
//File: tmp/tmp0.kt
package b


import a.TestClass
data class A(val v: IntArray)

fun box0(): String {
    val test = TestClass()
    val ok = "OK"

    val x = test { return ok }
}
//File: tmp/tmp1.kt
package c


import b.A
interface Callable {
    fun call(b: Boolean)
}

inline fun run(f: () -> Unit) { f() }

class A {
    fun foo(): String {
        run {
            val x = object : Callable {
                override fun call(b: Boolean) {
                    if (b) {
                        x()
                    } else {
                        try {
                            x()
                        } catch(t: Throwable) {
                        }
                    }
                }
            }
        }
        return "OK"
    }

    private fun x() {}
}

fun box1() : String {
  val myArray = intArrayOf(0, 1, 2)
  if(A(myArray) == A(intArrayOf(0, 1, 2))) return "fail"
  if(A(myArray) != A(myArray)) return "fail 2"
  return "OK"
}
//File: tmp/tmp2.kt
package a


import c.Callable
import c.run
import c.A
class TestClass {
    inline operator fun <T, F> invoke(task: () -> T) = task()
}

fun box2(): String =
        A().foo()!!
