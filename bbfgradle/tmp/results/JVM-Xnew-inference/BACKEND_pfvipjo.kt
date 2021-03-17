// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt
package a



open class C(val a: Int = 0, val b: String = "a") {
    fun test() {

    }
}

class B(var String: (Int)?) {
    fun foo() {
        class A(x: Any?) : C() {

        }
        
val r = true
if (r) {A("X").test()} else "Fail"



        class block(val v: Any?) : Iterable<String> by ArrayList<String>() {
        }

        
val xs = listOf<Any>()
if (!false) "OK" else {
        }

    }
}


fun box(): String {
    for (i in (4 .. 1).reversed()) {
        throw AssertionError("Loop should not be executed")
    }
    for (i in (4L .. 1L).reversed()) {
        throw AssertionError("Loop should not be executed")
    }
    for (i in ('D' .. 'A').reversed()) {
        throw AssertionError("Loop should not be executed")
    }
    return "OK"
}
//File: tmp/tmp1.kt
package c


import b.Tr
import b.A
import b.eat
var state: String = "Fail"

class A {
    private constructor(x: String = "OK") {
        state = x
    }

    companion object {
        fun foo() = A()
    }
}

fun box1(): String {
    eat(A(object : Tr<Int> {
        override val prop = 42
    }).prop)
    return "OK"
}

//File: tmp/tmp2.kt
package b


import a.B
import kotlin.reflect.KProperty
interface Tr<T> {
    val prop: T
}

class A(a: Tr<Int>) : A by super<AFabric>@AWrapperFabric.createA(z)

fun eat(x: (Int)?) {}

fun box0() : String {
    val a = B(5)
    
val z = false
when (z) {
 0 in intArrayOf(1, 2, 3) -> {Char.MIN_VALUE}
 else -> return "fail 2"
}

    return "OK"
}
