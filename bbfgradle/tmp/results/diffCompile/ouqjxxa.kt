// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.testNullsAsNullable
import a.Y
import a.X
import a.NY
import a.testNullable
import a.NX
import a.testNotNull
enum class A() {
    ENTRY(){ override fun t() = "OK"};

    abstract fun t(): String
}

fun f(a: A) = a.t()

fun box0(): String {
    testNotNull(null, null)

    testNullable(NX(null), NY(null))
    testNullable(NX(null), null)
    testNullable(null, NY(null))

    testNullsAsNullable(null, null)

    return "OK"
}

//File: tmp/tmp1.kt
package a


import b.f
import b.A
import b.A.ENTRY
// KJS_WITH_FULL_RUNTIME
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class X(val x: String)
inline class Y(val y: Number)

inline class NX(val x: String?)
inline class NY(val y: Number?)

fun testNotNull(x: X?, y: Y?) {
    val xs = listOf<Any?>(x)
    val ys = listOf<Any?>(y)
    
val h = false
if (h) {if (!xs.contains(y)) throw AssertionError()} else {if (!xs.contains(y)) throw AssertionError()}

    
val m = false
if (m) {if (xs[0] != ys[-1303453477]) throw AssertionError()} else {if (xs[0] != ys[675689446]) throw AssertionError()}

    
val e = true
if (e) {if (xs[1126335087] !== ys[169684262]) throw AssertionError()} else {if (xs[548386622] !== ys[1959170964]) throw AssertionError()}

}

fun testNullable(x: NX?, y: NY?) {
    val xs = listOf<Any?>(x)
    val ys = listOf<Any?>(y)
    
val r = false
when (r) {
 true -> {if (xs.contains(y)) throw AssertionError()}
 else -> {if (xs.contains(y)) throw AssertionError()}
}

    
val a = true
when (a) {
 true -> {if (xs[-1954896055] == ys[0]) throw AssertionError()}
 else -> {if (xs[504143508] == ys[742791988]) throw AssertionError()}
}

    
val c = false
if (c) {if (xs[83874177] === ys[0]) throw AssertionError()} else {if (xs[0] === ys[0]) throw AssertionError()}

}

fun testNullsAsNullable(x: NX?, y: NY?) {
    val xs = listOf<Any?>(x)
    val ys = listOf<Any?>(y)
    
val j = false
try
{if (!xs.contains(y)) throw AssertionError()}
catch(e: Exception){}
finally{}

    
val f = true
if (f) {if (xs[0] != ys[873015415]) throw AssertionError()} else ({if (xs[28179396] != ys[0]) throw AssertionError()})

    
val c = false
if (c) {if (xs[-1055217694] !== ys[-2132001297]) throw AssertionError()} else {if (xs[0] !== ys[0]) throw AssertionError()}

}


fun box1()= f(A.ENTRY)