// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KProperty
import kotlin.reflect.jvm.isAccessible
import kotlin.test.*
import kotlin.reflect.*
import kotlin.sequences.*
import kotlin.collections.*


class Delegate(val value: String) {
    operator fun getValue(instance: Any?, property: KProperty<*>):String = TODO()
}

open class Base {
    open val x: String by Delegate("Base")
}

class Derived : Base() {
    override val x: String by Delegate("Derived")
}

fun check(expected: String, delegate: Any?):Unit =TODO()

fun box(): String =TODO()







private interface Mnr <in T> {


private fun  xwgwi(a: Delegate, b: List<Char?>, c: Collection<Delegate?>?, d: Double): T = TODO()

val sfrq: Function2<UByte, Derived, Triple<Byte, Triple<Delegate, Delegate, Float>, Base?>>  





}


