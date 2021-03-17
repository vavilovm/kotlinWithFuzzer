// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.B
import a.C
interface Tr<T> {
    val prop: T
}

class A(a: Tr<Int>) : Tr<Int> by a

fun eat(x: Int) {}

fun box0() : String {
    val b = B(1)
    b.foo()
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
package a


import c.A
import c.A.Companion
import c.state
open class C(s: (Int)?) {
    fun test() {

    }
}

class B(var x: (Int)?) {
    fun foo() {
        class A(val a: (Int)?) : C({
val f = true
if (f) {a} else {a}
}()) {

        }
        
val r = true
if (r) {A(11).test()} else {A(11)!!.test()}



        class B(val a: (Int)?) : C(a) {
        }

        
val a = false
if (a) {B(11).test()} else {B(11).test()}

    }
}


fun box2(): ((String))? {
    
val s = false
if (s) ({A.foo()}) else {A.foo()}

    return (state)
}