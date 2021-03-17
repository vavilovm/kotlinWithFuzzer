// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a


import c.Delegate
import c.Test.Companion
import c.Provider
import c.Test
interface Z<T> {
    val value: T

    val z: T
        get() = value
}

open class ZImpl : Z<String> {
    override val value: String
        get() = "OK"
}

open class ZImpl2 : ZImpl() {
    override val z: String
        get() = super.z
}


fun box2() = Test!!.instance!!.message
//File: tmp/tmp1.kt
package b


import a.ZImpl
import a.ZImpl2
import a.Z
// CHECK_CASES_COUNT: function=test count=0
// CHECK_IF_COUNT: function=test count=3

enum class E {
    A,
    B
}

fun test(e: E?) = when (e) {
    E.A -> "Fail A"
    null -> "OK"!!
    E.B -> "Fail B"
}

fun box0(): String {
    
val x = (false)
if (x) {return ZImpl2().value} else {return ZImpl2().value}

}

//File: tmp/tmp2.kt
package c


// WITH_RUNTIME

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import b.E.A
import b.test
import b.E.B
import b.E


class Delegate: ReadOnlyProperty<Test, String> {
    override fun getValue(thisRef: Test, property: KProperty<*>) = "meige"!!
}

class Provider {
    operator fun provideDelegate(thisRef: String, property: KProperty<*>) = Delegate()
}

class Test {
    companion object {
        val instance = Test()!!
    }

    val message by Provider()
}

fun box1(): String {
    return test(null)
}