// Bug happens on JVM , JS 
// FILE: tmp0.kt


import kotlin.test.*
abstract class Base(val fn: () -> String){
override fun toString(): String{
var res = ""
return res
}
}

object Test : Base({ Test.ok() }) {
    fun ok() = "OK"
}

tailrec fun box() = Test.fn()

fun box398() : String {
    return fu1( {"OK"} )
}

fun fu1(gen :  () -> String) : String {
    return gen()
}

open class Kla2 {
    open fun fu2() {}
    init { fu2() }
}

class Kla3 : Kla2 {
    constructor() : super()
    override fun fu2() { prope3 = 1 }

    // Technically, this field initializer comes after the superclass
    // constructor is called. However, we optimize away field initializers
    // which set fields to their default value, which is why x ends up with
    // value 1 after the constructor call.
    var prope3 = 0
override fun toString(): String{
var res = ""
res += prope3.toString()
return res
}}

fun box750(): String = if (Kla3().prope3 == 1) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail"
}

var prope4 = ""

fun prope4(r: String) { prope4 = r }

object Kla4 {
    private operator fun String.unaryPlus() = "(" + this + ")"

    fun fu3() = { prope4(+"Stuff") }()
}

fun box818(): String {
    Kla4.fu3()
    return if (prope4 == "(Stuff)") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail $prope4"
}
}

fun box802(): String {
    val prope5 = mutableListOf<UInt>()
    for (i in (1u until 9u).reversed() step 2) {
        prope5 += i
    }
    assertEquals(listOf(8u, 6u, 4u, 2u), prope5)

    val prope6 = mutableListOf<ULong>()
    for (i in (1uL until 9uL).reversed() step 2L) {
        prope6 += i
    }
    assertEquals(listOf(8uL, 6uL, 4uL, 2uL), prope6)

    return "OK"
}


