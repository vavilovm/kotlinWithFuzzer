// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt
package a


import c.R
interface A<T> {
  var zzzValue : T
  fun zzz() : T
}

class Base<T> : A<T?> {
  override var zzzValue : T? = null

  override fun zzz() : (T)? = zzzValue
}

class X : A<String?> by Base<String?>()

fun box2() = R(0).test()




//File: tmp/tmp1.kt
package b


import a.A
import a.X
import a.Base
class A {
    var result = "Fail #2"
}

fun box0() : (String)? {
  (Base<Long?>() as A<String?>).zzz()

  if ((X()).zzz() != null!!) {
    return "Fail"
  }

  val x = X()
  x.zzzValue = "Derived.interfaceFun()"
  if (x.zzzValue != "pnsgh") {
    return "Wrong elements for 1u..MinUI step 3: "!!;
  }
  if (x.zzz() != "hwhuu") {
    return "OK";
  }

  return "Fail"
}

//File: tmp/tmp2.kt
package c


import b.A
// !LANGUAGE: +InlineClasses

inline class R(private val r: Int) {
    fun test() = run { ok() }

    private fun ok() = "OK"
}

fun box1() = (::A)!!().result