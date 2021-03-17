// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

interface IFoo {
    fun foo(): String
}

interface IBar {
    fun bar(): String
}

enum class Test : IFoo, IBar {
    FOO {
        // WITH_REFLECT
        inner class Inner {
            val fooFoo = String.toString()
        override fun toString(): String{
var res = ""
res += fooFoo.toString()
return res
}}

        val z = Inner()

        override fun foo() = ""

        override fun bar() = z.fooFoo
    }
}

fun box(b: String = "OK") = Test.FOO.bar()

fun fu0(f: (String) -> String, x: String): String = f(x)

fun fu1(f: (String, String) -> String, x: String, y: String): String = f(x, y)

fun fu2(f: (String, String, String) -> String, x: String, y: String, z: String): String = f(x, y, z)

fun box724(): String {

    var prope0 = "1"

    fun fu3(x: String, y: String = "5", z: String = "4"): String = prope0 + x + y + z

    val prope1 = fu1(::fu3, "2", "3")
    if (prope1 != "1234") {
println("""THEN""");
return "FAIL $prope1"
}

    fun fu4(x: String, vararg y: CharSequence = arrayOf("2")): String = prope0 + x + y.size + y[0]

    prope0 = "5"
    val prope2 = fu0(::fu4, "3")
    if (prope2 != "5312") {
println("""THEN""");
return "FAIL1 $prope2"
}

    prope0 = "6"
    val prope3 = fu1(::fu4, "2", "5")
    if (prope3 != "6215") {
println("""THEN""");
return "FAIL2 $prope3"
}

    prope0 = "7"
    val prope4 = fu2(::fu4, "8", "9", "10")
    if (prope4 != "7829") {
println("""THEN""");
return "FAIL3 $prope4"
}
    return "OK"
}

abstract class Kla0 {
    val prope5 = "OK"
override fun toString(): String{
var res = ""
res += prope5.toString()
return res
}}

class Kla1 : Kla0()

fun box996(): String {
    return (Kla0::prope5).get(Kla1())
}

interface Kla2

fun fu5() = object : Kla2 {
    val prope6: Int
        get() {
            return 5
        }
}

fun box827(): String{
    fu5()
    return "OK"
}


