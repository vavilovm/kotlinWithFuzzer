// Bug happens on JVM , JS 
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KProperty
import kotlin.test.assertEquals

object Delegate {
    operator fun getValue(z: Any?, p: KProperty<*>): String? {
        assertEquals("val x: kotlin.String?", p.toString())
        return "OK"
    }
}

interface Foo {
    fun bar(): String {
        val x by Delegate
        return x!!
    }
}

object O : Foo

fun box(): String = O.bar()

enum class Kla3 {
    Kla4,
    Kla5,
    Kla6,
    Kla7
}

fun fu10(x : Kla3, block : (Kla3) -> String) = block(x)

fun box306() : String {
    return fu10(Kla3.Kla5) {
        x -> when (x) {
            Kla3.Kla5 -> {
println("""WHEN Kla3.Kla5""");
"OK"
}
            else -> {
println("""WHEN """);
"fail"
}
        }
    }
}


