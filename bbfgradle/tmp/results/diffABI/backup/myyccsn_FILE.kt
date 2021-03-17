// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class M {
  fun doTest(l : Int): String =TODO() fun Double.l():Int = TODO()
  private fun ((Int)?)?.component2():Int = TODO()

  open
class WithNative {
    companion object {
        @JvmStatic external fun bar(component1: Int, s: String): (Array<(((String)?)?)?>)?
    }
}

}

fun box():(Long)? = TODO()
