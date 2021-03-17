// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// FILE: tmp.kt

class C(val i: Int) {
  operator fun component1() = i + 1
  operator fun component2() = i + 2
}

fun doTest(l : ArrayList<C>): String {
    var s = ""
    for ((a, b) in l) {
      s += {"$a:$b;"}()
    }
    return s
}

fun box(): String {
  val l = ArrayList<C>()
  l.add(C(0))
  l.add(C(1))
  l.add(C(2))
  val s = doTest(l)
  return if (s == "1:2;2:3;3:4;") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $s"
}
}

var prope0 = ""

class Kla0 {
    fun fu1(str: String) { prope0 += str }
}

fun fu0(f: Kla0.() -> Unit) {
    val fu0 = Kla0()
    fu0.f()
}

abstract class Kla1 {
    fun <Ty0> Kla0.fu2(friend: Ty0) {
        fu1("Playing with " + friend)
    }

    abstract fun fu3(): Unit
}

class Kla2(): Kla1()  {
    override fun fu3() = fu0 {
        fu1("Time to play! ")
        fu2("my owner!")
    }
}

fun box286(): String {
    Kla2().fu3()
    if (prope0 != "Time to play! Playing with my owner!") {
println("""THEN""");
return "fail: $prope0"
}

    return "OK"
}


