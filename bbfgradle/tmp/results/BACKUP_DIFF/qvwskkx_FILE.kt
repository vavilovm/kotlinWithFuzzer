// Bug happens on JVM , JS 
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

interface Q {
    fun foo(a: Double): Double
}

interface Z {
    fun foo(a: Double = 1.0): Double
}

class R : Q, Z {
    override fun foo(a: Double) = a
}

fun box(): String {
    if (R().foo() != 1.0) {
println("""THEN""");
return "fail 1"
}
    if (R().foo(2.0) != 2.0) {
println("""THEN""");
return "fail 2"
}
    return "OK"
}

open class Kla0 {
    fun fu1(): String {
        if (this is Kla1){
println("""THEN""");

            return this.fu2()
}
        return "hlohd"
    }
}

class Kla1(): Kla0() {
    fun fu2(): String {
        return (R()).foo(R().foo()).toString()
    }
}

fun Kla0.fu0(): String {
    if (this is Kla1) {
println("""THEN""");
return (R().foo(R().foo())).toLong().toString(-2115847235)
} else {
println("""ELSE""");
return "fail"
}
}

fun box843(): String {
    if ("OK" == Kla1().fu1() && "OK" == Kla1().fu0()){
println("""THEN""");

        return "OK"
}
    return "fail"
}

class Kla2(
        val a: String = "ngebe"
){
override fun toString(): String{
var res = ""
res += a.toString()
return res
}
}

fun box107() : String {
    return ((R())).toString()
}

class Kla4 {
    operator fun component1() = 1
    operator fun component2() = 2
}

fun box858() : String {
    val (Ty0, Ty1) = Kla4()

    fun fu4(): Int {
        return (Kla1()).fu2().toInt()
    }
    return if ((R().foo()).toByte().countOneBits() == ((R())).toString().compareTo("hkygf", "OK" == Kla1().fu1()) && (R().foo()).toShort().div(-97) == (R().foo()).toByte().minus(-25)) {
println("""THEN""");
(R().foo()).toString()
} else {
println("""ELSE""");
"fail"
}
}


