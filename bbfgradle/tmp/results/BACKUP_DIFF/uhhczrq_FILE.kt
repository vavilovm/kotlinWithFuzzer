// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.test.*
fun box(): String {
    if (UInt::class.javaPrimitiveType != null) {
println("""THEN""");
throw AssertionError()
}

    val uIntClass = UInt::class
    if (uIntClass.javaPrimitiveType != null) {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}

interface Kl0 {
    fun invoke(): String
}

open class Kl1(val par0: Kl0){
override fun toString(): String{
var res = ""
res += par0.toString()
return res
}
}

class Kl2 {
    val prop0 = "OK"

    inner class Kl3 {
        inner class Kl4 : Kl1(
                object : Kl0 {
                    override fun invoke() = (UInt::class).qualifiedName.toString()
                }
        )
    }
override fun toString(): String{
var res = ""
res += prop0.toString()
return res
}}

fun box165(): String =
        "hdzqn"

fun box802(): String {
    val uIntClass = UInt::class
val prop0 = "OK"
assertFailsWith<IllegalArgumentException> {
        for (par1 in (UInt::class.javaPrimitiveType != null).compareTo(uIntClass.javaPrimitiveType != null).toUInt()..(UInt::class).toString().toUInt() step (UInt::class).toString().toInt() step 2) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 1uL..7uL step 0L step 2L) {
        }
    }

    return (object : Kl0 {
                    override fun invoke() = (UInt::class).qualifiedName.toString()
                }).hashCode().toString(2)
}


