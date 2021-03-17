// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +JvmFieldInInterface
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.companionObject

class Bar(val value: String)

interface Foo {

    companion object {
        @JvmField
        val z = Bar("OK")
    }
}


fun box(): String {
    val field = Foo::class.companionObject!!.memberProperties.single() as KProperty1<Foo.Companion, Bar>
    return field.get(Foo.Companion).value
}
