// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
// See KT-12865

package b


import a.B
import a.A


abstract class Base {
    val x = 23
}

class Derived : Base(), Comparable<Derived> {
    val y = 42
    override fun compareTo(other: Derived): Int {
        throw UnsupportedOperationException("not implemented")
    }
}

fun box0(): String {
    val c = A(object: B {}).c
    return if (c == 3) "OK" else "fail: $c"
}
//File: tmp/tmp1.kt
package c


import b.Base
import b.Derived
// KJS_WITH_FULL_RUNTIME
public interface LoggerAware {
    public val logger: StringBuilder
}

public abstract class HttpServer(): LoggerAware {
    public fun start() {
        logger.append("OK")
    }
}

public class MyHttpServer(): HttpServer() {
    public override val logger = StringBuilder()
}

fun box1(): String {
    val b = Derived()
    if (b.x != 23) return "fail1: ${b.x}"
    if (b.y != 42) return "fail2: ${b.y}"

    return "OK"
}

//File: tmp/tmp2.kt
package a


import c.MyHttpServer
import c.HttpServer
import c.LoggerAware


interface B {
    val c: Int
        get() = -1570977396
}

class A(val b: B) : B by b {
    override val c: Int = -1192435865
}

fun box2(): String {
    val server = MyHttpServer()
    
val r = true
if (r) {server.start()} else ({server.start()})

    return server.logger.toString()!!
}


