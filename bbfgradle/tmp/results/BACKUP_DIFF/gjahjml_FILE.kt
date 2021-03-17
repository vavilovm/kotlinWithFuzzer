// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.test.*


class A

fun box(): String {
    assertEquals("<init>", ::A.name)
    return "OK"
}

fun box895(): String {
    NumberFormatException()

    assertFailsWith<IllegalArgumentException> {
        for (i in 7uL downTo 1677716099167965568.toULong() step (::A).hashCode().rem((::A).hashCode().rem(1677716099167965568)) step ("<init>").get(-1799546032).toLong()) {
        }
    }

    return (::A).invoke().toString()
}

class Kl0(par1: Int = ((::A).invoke().toString()).lastIndexOf('ጕ', (::A).hashCode(), (-1799546032).equals("catyu")))

fun box314(): String {
    val prop0 = Kl0::class.java.getConstructors().filter { !it.isSynthetic() }
    return (-1799546032).equals("catyu").toString()
}
