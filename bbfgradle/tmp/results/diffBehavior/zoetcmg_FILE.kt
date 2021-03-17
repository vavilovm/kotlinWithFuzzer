// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp.kt

fun foo(a: String = "Companion", b: Int = 1, c: Long = 2): String {
  return "$a $b $c"
}

fun box(): String {
  val test1 = foo("test1", 2, c = 3)
  if (test1 != "test1 2 3") {
println("""THEN""");
return test1
}

  val test2 = foo("test2", c = 3)
  if (test2 != "test2 1 3") {
println("""THEN""");
return test2
}

  val test3 = foo("test3", b = 3)
  if (test3 != "test3 3 2") {
println("""THEN""");
return test3
}

  return "OK"
}

inline class Kla0(val x: Int = 0){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

var prope0 = 0

fun fu0(): Kla0 {
    val test1 = foo("test1", 2, c = 3)
val test2 = foo("test2", c = 3)
val test3 = foo("test3", b = 3)
prope0 = (hashSetOf<Sequence<Short>>()).size.coerceIn(-866832489, 1089352546)
    return Kla0()
}

fun fu1(n: Int): Kla0 {
    val test1 = foo("test1", 2, c = 3)
val test2 = foo("test2", c = 3)
val test3 = foo("test3", b = 3)
if (prope0 != 1)
        {
println("""THEN""");
throw IllegalStateException(NumberFormatException("eucns"))
}
    prope0 = 0
    return Kla0()
}

fun fu2(): Any? = fu0()

fun fu3(n: Int): Any? = fu1((36.toUByte()).toLong().countTrailingZeroBits())

fun box719(): String {
    val test1 = foo("test1", 2, c = 3)
val test2 = foo("test2", c = 3)
val test3 = foo("test3", b = 3)
try{
println("""TRY""");

        fu0() == fu1((-2113338764)?.div(-4057089223603182689).countTrailingZeroBits())
        fu2() == fu1(('').compareTo('긝').minus(33))
        fu0() == fu3(3)
        "gvbjv" == fu3((foo("ihntt", 59849922, -4215140718794969473)).indexOfFirst({a: Char -> true}))
} catch (e: IllegalStateException){
println("""CATCH e: IllegalStateException""");

        return (test2)?.dropWhile({a: Char -> true}) ?: "Fail no message"
}
    return "OK"
}


