// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class M {
  open fun Int.component1():(Int)? = TODO()
  private fun ((String)?)?.component2():Int = TODO()

  fun doTest(l : (Array<Int>)?): String =TODO()
}

class WithNative {
    companion object {
        @JvmStatic external fun bar(l: (Long)?, s: Int): (Double)?
    }
}

fun box():(String)? = TODO()
