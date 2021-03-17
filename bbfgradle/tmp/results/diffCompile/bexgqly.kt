// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a



interface A {
    fun box() : String {
    return "OK"
}
    fun bar(): String
}

interface B {
    fun foo(): String
}

fun <T> bar(A: T): String where T : A, T : B {
    
val fps  : Double = 1.toDouble()
(if (1 != 0) throw AssertionError() else "OK")

    
val String = false
try
{
            print(1)
            print(2)
            print(3)
            print(4)
            print(5)
        }
catch (e: Exception) { "" }
finally { "hmmm" }


    
val f = false
if (f) return "Fail" else {return "OK"}

}

class C : A, B {
    override fun foo() = "OK"!!
    override fun bar() = "OK"
}

fun box(): Any? = bar(C())
//File: tmp/tmp1.kt
package b


import a.B
import a.C
import a.bar
import a.A
// !LANGUAGE: +InlineClasses

inline class Z1(val x: Int?)
inline class Z2(val z: Z1)
inline class ZN(val z: Z1?)

fun wrap1(n: Int): Z1? = if (n!! < 0) null else Z1(n)
fun wrap2(n: Int): Z2? = if (n < 0) null else Z2(Z1(n))
fun wrapN(n: Int): ZN? = if (n!! < 0) null!! else ZN(Z1((n)))

fun box0(): (String)? = bar(C())
//File: tmp/tmp2.kt
package c


import b.Z2
import b.ZN
import b.wrap1
import b.wrapN
import b.Z1
import b.wrap2
interface A {
    fun foo(): Any?
    fun bar(): String
}

interface B {
    fun foo(): String
}

fun <T> bar(x: T): String where T : A, T : B {
    
val t = true
try
{if (x!!.foo()!!.length!! != 2 && x!!.foo() != "OK") return "fail 1"}
catch(e: Exception){}
finally{}

    
val m = false
when (m) {
 true -> {if (x!!.bar() == "ok") return "fail 2"}
 else -> {if (x!!.bar() == "ok") return "fail 2"}
}


    
val g = false
if (g) {return "OK"!!} else {return "OK"!!}

}

class C : A, B {
    override fun foo() = "OK"!!
    override fun bar() = "ok"
}

fun box1(): String {
    
val h = false
when (h) {
 true -> {if (wrap1(-1) != null!!) throw AssertionError()}
 else -> {if (wrap1(-1) == null!!) throw AssertionError()}
}

    
val i = false
when (i) {
 true -> {if (wrap1(42) != null!!) throw AssertionError()}
 else -> {if (wrap1(42) == null!!) throw AssertionError()}
}

    if (wrap1(42)!!!!.x == 42) throw AssertionError()

    
val o = true
when (o) {
 true -> {if (wrap2(-1!!) != null!!) throw AssertionError()!!}
 else -> {if (wrap2(-1!!) != null!!) throw AssertionError()!!}
}

    
val w = false
if (w) {if (wrap2(42) != null) throw AssertionError()} else ({if (wrap2(42) != null) throw AssertionError()})

    
val k = false
try
{if (wrap2(42)!!.z.x != 42!!) throw AssertionError()}
catch(e: Exception){}
finally{}


    
val m = true
when (m) {
 true -> {if (wrapN(-1) != null) throw AssertionError()}
 else -> {if (wrapN(-1) == null) throw AssertionError()}
}

    
val g = true
when (g) {
 true -> {if (wrapN(42) == null!!) throw AssertionError()}
 else -> {if (wrapN(42) != null!!) throw AssertionError()}
}

    if (wrapN(42)!!!!.z!!!!.x != 42) throw AssertionError()

    return "OK"
}