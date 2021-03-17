// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.test.*
class B () {}

open class A(val b : B) {
    fun a(): A = object: A(b) {}
override fun toString(): String{
var res = ""
res += b.toString()
return res
}}

fun box() : String {
    val b = B()
    val a = A(b).a()

    if (a.b !== b) {
println("""THEN""");
return "failed"
}

    return "OK"
}

inline class Kla0(val x: Char){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

interface Kla1 {
    fun fu0(): Any
    fun fu1(): Kla0
}

class Kla2 : Kla1 {
    override fun fu0(): Kla0 = Kla0('O')
    override fun fu1(): Kla0 = Kla0('K')
}

fun box753(): String {
    val b = B()
val a = A(b).a()
val prope0: Kla1 = Kla2()
    val prope1 = prope0.fu0()
    if ((A(B()).b).equals("jrcbg")){
println("""THEN""");

        throw AssertionError(kotlin.Unit)
}

    return "bbpyi"
}

fun box342(): String {
    val b = B()
val a = A(b).a()
val prope0: Kla1 = Kla2()
val prope1 = prope0.fu0()
IllegalArgumentException()

    assertFailsWith<IllegalArgumentException> {
        val prope3 = 1uL until 8uL
        for (i in prope3 step 2L step (A(B()).a()).hashCode().rem(-2L)) {
        }
    }

    return "OK"
}

class Kla3 {
    operator fun component1() = 1
    operator fun component2() = 2
}

fun Kla3.fu2() = this

fun box627() : String {
    val b = B()
val a = A(b).a()
val prope0: Kla1 = Kla2()
val prope1 = prope0.fu0()
val prope3 = 1uL until 8uL
val (Ty0, Ty1) = Kla3().fu2().fu2()

    return (A(B()).a()).b.toString()
}


