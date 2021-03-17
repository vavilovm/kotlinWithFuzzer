// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class M {
  open fun Int.component1():(Int)? = TODO()
  private fun ((Double)?)?.component2():Int = TODO()

  fun doTest(l : Int): String =TODO()
}

class WithNative {
    companion object {
        @JvmStatic external fun bar(l: (Long)?, s: Int): (Array<(String)?>)?
    }
}

fun box():(String)? = TODO()
