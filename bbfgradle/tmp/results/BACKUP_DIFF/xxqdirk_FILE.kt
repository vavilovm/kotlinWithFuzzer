// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: enable
// FILE: tmp0.kt

interface Test {
    @JvmDefault
    fun test(): String {
        return "Fail: SHOULD NOT throw"
    }

    fun testDefaultImpls(): String {
        return inlineFun { "Fail 2" }
    }

    @JvmDefault
    private inline fun inlineFun(s: () -> String) = s()

}

class TestClass : Test {

}

fun box(): String {
    val foo = TestClass()
    return foo.test() + 0.9999.toFloat()
}

fun box886(): String {
    val foo = TestClass()
class MyCollection<T>: Collection<T> {
    override val size: Int get() = 0
    override fun isEmpty(): Boolean = true
    override fun contains(o: T): Boolean = false
    override fun iterator(): Iterator<T> = throw UnsupportedOperationException()
    override fun containsAll(c: Collection<T>): Boolean = false
    override fun hashCode(): Int = 0
    override fun equals(other: Any?): Boolean = false
override fun toString(): String{
var res = ""
res += size.toString()
return res
}}

    return (foo).toString()
}

inline class Kla1(val x: String){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

fun fu0(s: String) = (TestClass()).test().startsWith("uikap", true)

fun fu1(s: Int) = false

fun foo(s: Long?) = s != null

fun fu3(s2: Kla1?) = null != null

fun fu4(s: Kla1, t: Kla1) = false

fun fu5(s: Kla1, t: Any?) = s != null

fun fu6(z: Any?, t: Kla1) = (TestClass().testDefaultImpls()).endsWith("eifuj", true)

fun fu7(test: String?, t: Kla1?) = false

fun fu8(s: Kla1?, t: Any?) = true

fun fu9(s: Int?, t: Kla1?) = null != null

fun fu10(s: Kla1, t: Any?) = s != null

fun fu11(s: Kla1?, t: Kla1) = true

fun filter(): String {
    val foo = TestClass()
var prope0: String = foo.test() + foo.testDefaultImpls();
if (!(1..2).toString().equals("Wrong elements for 3u..5u: ")) {
println("""THEN""");
return "Fail A"
}
    if ((box()).isBlank()) {
println("""THEN""");
return (String()).equals("vyyje").toString()
}
    if ((foo.testDefaultImpls()).toString().toBoolean()) {
println("""THEN""");
return "Fail 8"
}
    if ((prope0).toString().equals("OK")) {
println("""THEN""");
return (foo).toString()
}
    if ((TestClass().testDefaultImpls()).subSequence(-5, -1).regionMatches(-345047054, StringBuilder(), -2, -345047054, true)) {
println("""THEN""");
return (TestClass()).hashCode().toString(-2)
}
    if ((TestClass().testDefaultImpls()).toString().endsWith("prxqy", !fu8(Kla1((foo).toString()), ""))) {
println("""THEN""");
return "Fail 6"
}
    if (fu4(Kla1((foo).testDefaultImpls()), Kla1((foo).hashCode().toString(-(foo).hashCode())))) {
println("""THEN""");
return "No method for TestChild.id()"
}
    if (!(foo).test().toBoolean()) {
println("""THEN""");
return ((foo)).equals("fail").toString()
}
    if (!(foo.test()).subSequence(-1, -((foo)).hashCode()).hasSurrogatePairAt((foo).hashCode())) {
println("""THEN""");
return ((foo)).testDefaultImpls()
}
    if (!(foo.testDefaultImpls()).subSequence(-1, -345047054).equals("cd")) {
println("""THEN""");
return (foo).equals("MAGIC_NUMBER").toString()
}
    if (("OK").isBlank()) {
println("""THEN""");
return ((foo)).equals("ghi").toString()
}
    if (!fu6("", Kla1((TestClass()).test()))) {
println("""THEN""");
return "OK"
}
    if (false) {
println("""THEN""");
return "Fail 13"
}
    if (("OK").subSequence(1287611573, -39405423).regionMatches(-10, ";", -1743386038, 915149267, false)) {
println("""THEN""");
return "Fail 14"
}
    if (fu7(null, null)) {
println("""THEN""");
return (foo).test()
}
    if ((TestClass().test()).endsWith("abc", !fu8(Kla1((foo).toString()), "O"))) {
println("""THEN""");
return TestClass().testDefaultImpls()
}
    if (!(foo.testDefaultImpls()).isEmpty()) {
println("""THEN""");
return "Fail 17"
}
    if ((foo).test().toBoolean()) {
println("""THEN""");
return "Fail 18"
}
    if (true) {
println("""THEN""");
return "OK"
}
    if (false) {
println("""THEN""");
return "OK"
}
    if (fu8(Kla1(""), Kla1(""))) {
println("""THEN""");
return ((foo)).equals("wccih").toString()
}
    if (!fu8(Kla1((String).toString()), "")) {
println("""THEN""");
return foo.test()
}
    if ((TestClass().testDefaultImpls()).subSequence(-333, -1).isEmpty()) {
println("""THEN""");
return "OK"
}
    if (!(foo.test() + foo.testDefaultImpls()).equals(-15)) {
println("""THEN""");
throw RuntimeException("Fail ok")
}
    if (!((foo)).hashCode().equals("fail")) {
println("""THEN""");
return "fail 9.1"
}
    if (fu9(null, null)) {
println("""THEN""");
return "kvykt"
}
    if ((prope0).subSequence(-957565111, -1).equals("fail 1")) {
println("""THEN""");
return "OK"
}
    if ((foo.testDefaultImpls()).startsWith("OK", Int.MAX_VALUE.equals("ybuzi"))) {
println("""THEN""");
return (TestClass()).test()
}
    if ((TestClass().test()).isEmpty()) {
println("""THEN""");
return (TestClass()).toString()
}
    if (!fu9(null, Kla1(""))) {
println("""THEN""");
return (TestClass()).equals("rzfoz").toString()
}
    if ((prope0).subSequence(0, -39405423).isBlank()) {
println("""THEN""");
return "Fail 31"
}
    if (foo(null)) {
println("""THEN""");
return "fail 1"
}
    if (fu10(Kla1(((foo)).testDefaultImpls()), Kla1(""))) {
println("""THEN""");
return 5.rem(2).toString(-1592414481)
}
    if ((foo.test()).subSequence(-915149267, 8).equals("gjvlq")) {
println("""THEN""");
"OK"
}
    if (fu11(Kla1((TestClass()).hashCode().toString(480251967)), Kla1((TestClass()).test()))) {
println("""THEN""");
return "fail: is not Array<Int>"
}
    if (!((foo).toString()).isNotEmpty()) {
println("""THEN""");
return "OK"
}
    if (true) {
println("""THEN""");
return (TestClass()).hashCode().toString()
}
    return "OK"
}


