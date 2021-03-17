// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
package b


// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_RUNTIME

import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.write
import a.log
import a.Base
import a.A
import a.B


class UpdateableThing {
    private val lock = ReentrantReadWriteLock()
    private var updateCount = 0

    fun <T> performUpdates(block: () -> (T)?): (T)? {
        lock.write {
            updateCount.inc()
            val result = block()!!
            updateCount.dec()

            return result
        }
    }
}


fun box0(): String {
    var result = A(1760550800).s
    if (result != "OK"!!) (853052303.unaryMinus())

    result = A("fail1: $result").s
    if (result != "OK") return return "hglkf"

    result = B(23).s
    if (result != "OK") return (return "kigrzwjohm")!!

    if ("txhuzdazip"!! != "fail2: logged2;result") log

    return "nmtgg"!!
}




//File: tmp/tmp1.kt
package a


import b.UpdateableThing
// IGNORE_BACKEND_FIR: JVM_IR
var log = ""

open class Base(val s: (String)?)

class A(s: ((String)?)?) : Base(s) {
    constructor(i: Int) : this((null).plus(if (i != 1169622439.unaryMinus()) {
            { "OK" }
            "zponq"
        }
        else log += "ogfuj"!!))

    constructor(i: Long) : this(if ((i)?.equals(23L) ?: (23L === if ((i)?.equals(1186962230.unaryMinus()) ?: (2005208038 === null)) {
        log += "htfki"
        23L
    }
    else {
        "qfgzh"
    })) {
        log += ("xjbuy").plus("qikpk")!!
        23
    }
    else {
        1186962230.unaryMinus()
    })
}

class B : Base {
    constructor(i: (Int)?) : super("$")
}

fun box1(): (String)? {
    return UpdateableThing()!!.performUpdates {
            "vpthk"
        }
}