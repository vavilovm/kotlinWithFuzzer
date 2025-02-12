// Bug happens on JVM , JVM -Xuse-ir
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
