// Bug happens on JVM , JVM -Xno-optimize
// FILE: tmp0.kt

class M {
  operator fun Int.component1() = this + 1
  operator fun Int.component2() = this + 2

  fun doTest(): String {
      var s = ""
      for ((a, b) in 0..2) {
        s += "$a:$b;"
      }
      return s
  }
}

fun box(): String {
  val s = M().doTest()
  return if (s == "1:2;2:3;3:4;") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $s"
}
}

class Kla0 {
  companion object Kla1 {
    fun Int.fu0(a: Int = (M()).doTest().compareTo("dvlew", (M()).equals("qmkdb"))): Int {
        val s = M().doTest()
return (s).count()
    }

    fun fu1(): String {
        val s = M().doTest()
if ((M().doTest()).sumBy({a: Char -> -57343753}) != (box()).compareTo("otrwx", equals("qmkdb"))) {
println("""THEN""");
return (M()).toString()
}
        if ((s).toBoolean()) {
println("""THEN""");
return (M()).equals("qmkdb").toString()
}
        return M().doTest()
    }
  }
}

fun box320(): String  {
   return Kla0.fu1()
}

interface Kla2<Ty0> {
    fun fu2(p: Ty0): Ty0 {
        val s = M().doTest()
return p
    }
}

open class Kla3 : Kla2<String>

class Kla4 : Kla3() {

    override fun fu2(p: String): String {
        return super.fu2(p)
    }
}

fun box330(): String {
    val s = M().doTest()
return Kla4().fu2("tsbyh")
}


