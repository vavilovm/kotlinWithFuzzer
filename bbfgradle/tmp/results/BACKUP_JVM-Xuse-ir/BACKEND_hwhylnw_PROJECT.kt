// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// WITH_RUNTIME

import kotlin.reflect.KClass
import kotlin.test.*import AFabric
import A
import AImpl
import AWrapperFabric
import box2


class M

fun check(x: KClass<*>) {
    assertEquals(x, x.java.kotlin)
    assertEquals(x.hashCode(), x.java.kotlin.hashCode())
    assertEquals(x.java.toString() + " (Kotlin reflection is not available)", x.toString())
}

fun box2(): String {
    return AWrapperFabric().createMyA().foo()
}

//File: tmp/tmp1.kt
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.*
import M
import check
import box0


object Host {
    @JvmStatic fun foo(x: String) = x
}

class CompanionOwner {
    companion object {
        @JvmStatic fun bar(x: String) = x
    }
}

fun box0(): String {
    check(M::class)
    check(String::class)
    check(Error::class)
    check(Int::class)
    check(java.lang.Integer::class)
    check(MutableList::class)
    check(Array<String>::class)

    return "OK"
}

//File: tmp/tmp2.kt

import Host
import CompanionOwner.Companion
import CompanionOwner
import box1
// IGNORE_BACKEND_FIR: JVM_IR
interface A {
    fun foo(): String
}

class AImpl(val z: String) : A {
    override fun foo(): String = z
}

open class AFabric {
    open fun createA(z: String): A = AImpl(z)
}

class AWrapperFabric : AFabric() {

    override fun createA(z: String): A {
        return AImpl("fail: $z")
    }

    fun createMyA(): A {
        val z = "OK"
        return object : A by super<AFabric>@AWrapperFabric.createA(z) {}
    }
}

fun box1(): String =
        (Host::foo).call("O") + (CompanionOwner.Companion::bar).call("K")