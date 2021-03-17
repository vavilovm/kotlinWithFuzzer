// Bug happens on JVM 
//File: tmp/tmp0.kt
package a


//KT-1249 IllegalStateException invoking function property
class TestClass(val body : () -> Unit) : Any() {
    fun run() {
        body()
    }
}

fun box0() : String {
    TestClass({}).run()
    return "OK"
}


//File: tmp/tmp1.kt
package b


@Suppress("UNRESOLVED_REFERENCE")
class A {
    val a: ABC = null
}
//File: tmp/tmp2.kt
package c


// IGNORE_BACKEND_FIR: JVM_IR
interface A {
    fun foo(x: Int, y: Int = x + 20, z: Int = y * 2) = z
}

class B : A {}

fun box2() = if (B().foo(1) == 42) "OK" else "Fail"
