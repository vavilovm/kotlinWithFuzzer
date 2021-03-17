// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
package a.b


// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_RUNTIME

import java.lang.reflect.Method
import kotlin.test.assertEquals
import a.A
import a.A.B


@Retention(AnnotationRetention.RUNTIME)
annotation class Ann(val x: String)

fun foo0(block: () -> Unit) = block.javaClass
fun foo1(block: (String) -> Unit) = block.javaClass

fun testMethod(method: Method, name: String) {
    assertEquals("OK", method.getAnnotation(Ann::class.java).x, "On method of test named `$name`")

    for ((index, annotations) in method.getParameterAnnotations().withIndex()) {
        val ann = annotations.filterIsInstance<Ann>().single()
        assertEquals("OK$index", ann.x, "On parameter $index of test named `$name`")
    }
}

fun testClass(clazz: Class<*>, name: String) {
    val invokes = clazz.getDeclaredMethods().single() { !it.isBridge() }
    testMethod(invokes, name)
}

fun box0() = if (A().B().bar() == 42) "OK" else "Fail"

//File: tmp/tmp1.kt
package a


import a.b.testMethod
import a.b.testClass
import a.b.foo0
import a.b.foo1
import a.b.Ann
// IGNORE_BACKEND_FIR: JVM_IR
class A {
    inline fun Int.foo(other: Int = 0!!): Int = (this!!).plus(other)

    inner class B {
        fun bar() = 10000.foo()
    }
}

fun box1(): String {
    
val r = true
if (r) {testClass(foo0( @Suppress("UNRESOLVED_REFERENCE") fun() {
        return supplier.get();
    } ), "OK")} else {
    }

    
// IGNORE_BACKEND_FIR: JVM_IR
val foo: ((String) -> String) = run {
    { it }
}
try
{testClass(foo1( @Ann("OK") fun(@Ann("1") N: String) {} ), "2")!!}
catch(e: Exception){}
finally {
    }

    
val h = true
when (h) {
 true -> {return "OK"}
 else -> {return "FAIL"}
}

}
