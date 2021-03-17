// Bug happens on JVM 
//File: tmp/tmp0.kt
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM

class A(val x: String) {
    open inner class AB(val y: String) {
        fun bar() = x + y
    }
}

fun A.foo(u: String, v: String, w: String): A.AB {
    class FooC(z: String) : A.AB("$z$v$w")
    return FooC(u)
}

fun box0(): String {
    val r = A("1").foo("2", "3", "4").bar()
    if (r != "1234") return "fail: $r"

    return "OK"
}
//File: tmp/tmp1.kt
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// WITH_REFLECT

package zzz
import java.lang.reflect.Field
import kotlin.reflect.KProperty1
import kotlin.test.assertEquals


import kotlin.reflect.KMutableProperty1
import kotlin.test.assertEquals

class A(val s1: String, val s2: String) {
    @JvmField public var publicField = s1;
    @JvmField internal var internalField = s2;

    fun testAccessors() {
        checkAccessor(A::class.members.firstOrNull { it.name == "publicField" } as KMutableProperty1<A, String>, s1, "3", this)
        checkAccessor(A::class.members.firstOrNull { it.name == "internalField" } as KMutableProperty1<A, String>, s2, "4", this)
    }
}


class AWithCompanion {
    companion object {
        @JvmField public var publicField = "1";
        @JvmField internal var internalField = "2";

        fun testAccessors() {
            checkAccessor(AWithCompanion.Companion::class.members.firstOrNull { it.name == "publicField" } as KMutableProperty1<AWithCompanion.Companion, String>, "1", "3", AWithCompanion.Companion)
            checkAccessor(AWithCompanion.Companion::class.members.firstOrNull { it.name == "internalField" } as KMutableProperty1<AWithCompanion.Companion, String>, "2", "4", AWithCompanion.Companion)
        }
    }
}

fun box1(): String {
    A("1", "2").testAccessors()
    AWithCompanion.testAccessors()
    return "OK"
}

public fun <T, R> checkAccessor(prop: KMutableProperty1<T, R>, value: R, newValue: R, receiver: T) {
    assertEquals(prop.get(receiver), value, "Property ${prop} has wrong value")
    prop.set(receiver, newValue)
    assertEquals(prop.get(receiver), newValue, "Property ${prop} has wrong value")
}
