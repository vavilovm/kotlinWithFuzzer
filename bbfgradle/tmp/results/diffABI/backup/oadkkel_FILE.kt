// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class M {
  fun doTest(l : (Int)?): String =TODO() fun Int.component1():Int = TODO()
  private fun ((Double)?)?.component2():Int = TODO()

  open
class WithNative {
    companion object {
        @JvmStatic external fun bar(l: (Long)?, s: String): (Array<(Int)?>)?
    }
}

}

fun box():(String)? = TODO()
