// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.*
import kotlin.test.assertEquals

object Delegate {
    lateinit var property: KProperty<*>

    operator fun getValue(instance: Any?, kProperty: KProperty<*>) {
        property = kProperty
    }
}

class Foo {
    inline fun foo() {
        val x by Delegate
        x
    }
}

fun box(): String {
    Foo().foo()
    assertEquals("val x: kotlin.Unit", Delegate.property.toString())
    return "OK"
}
