// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
package a


import c.NY
import c.NX
import c.testNullable
import c.Y
import c.X
import c.testNotNull
import c.testNullsAsNullable
// IGNORE_BACKEND_FIR: JVM_IR
class A(var b: Byte) {
  fun c(d: Short)  = (b + d.toByte()).toChar()
}

fun box2(): String {
    testNotNull(null, null)

    testNullable(NX(null), NY(null))
    testNullable(NX(null), null)
    testNullable(null, NY(null))

    testNullsAsNullable(null, null)

    return "OK"
}

//File: tmp/tmp1.kt
package b


import a.A
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT

object Host {
    @JvmStatic fun concat(s1: String, s2: String, s3: String = "K", s4: String = "x") =
            s1 + s2 + s3 + s4
}

fun box0() : String {
    if(A(10.toByte()).c(20.toShort()) != 30.toByte().toChar()) return "plus failed"

    var x = 20.toByte()
    var y = 20.toByte()
    val foo = {
        x++
        ++x
    }

    if(++x != 21.toByte() || x++ != 21.toByte() || foo() != 24.toByte() || x != 24.toByte()) return "shared byte fail"
    if(++y != 21.toByte() || y++ != 21.toByte() || y != 22.toByte()) return "byte fail"

    var xs = 20.toShort()
    var ys = 20.toShort()
    val foos = {
        xs++
        ++xs
    }

    if(++xs != 21.toShort() || xs++ != 21.toShort() || foos() != 24.toShort() || xs != 24.toShort()) return "shared short fail"
    if(++ys != 21.toShort() || ys++ != 21.toShort() || ys != 22.toShort()) return "short fail"
 
    var xc = 20.toChar()
    var yc = 20.toChar()
    val fooc = {
        xc++
        ++xc
    }

    if(++xc != 21.toChar() || xc++ != 21.toChar() || fooc() != 24.toChar() || xc != 24.toChar()) return "shared char fail"
    if(++yc != 21.toChar() || yc++ != 21.toChar() || yc != 22.toChar()) return "char fail"
 
    return "OK"
}

//File: tmp/tmp2.kt
package c


import b.Host
// IGNORE_BACKEND_FIR: JVM_IR
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
    if (!xs.contains(y)) throw AssertionError()
    if (xs[0] != ys[0]) throw AssertionError()
    if (xs[0] !== ys[0]) throw AssertionError()
}

fun testNullable(x: NX?, y: NY?) {
    val xs = listOf<Any?>(x)
    val ys = listOf<Any?>(y)
    if (xs.contains(y)) throw AssertionError()
    if (xs[0] == ys[0]) throw AssertionError()
    if (xs[0] === ys[0]) throw AssertionError()
}

fun testNullsAsNullable(x: NX?, y: NY?) {
    val xs = listOf<Any?>(x)
    val ys = listOf<Any?>(y)
    if (!xs.contains(y)) throw AssertionError()
    if (xs[0] != ys[0]) throw AssertionError()
    if (xs[0] !== ys[0]) throw AssertionError()
}


fun box1(): String {
    val concat = Host::concat
    val concatParams = concat.parameters
    return concat.callBy(mapOf(
            concatParams[0] to "",
            concatParams[1] to "O",
            concatParams[3] to ""
    ))
}