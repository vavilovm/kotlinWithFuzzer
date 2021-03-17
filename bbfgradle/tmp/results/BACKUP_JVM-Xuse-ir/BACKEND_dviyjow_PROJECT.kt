// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
// IGNORE_BACKEND_FIR: JVM_IR
import kotlin.reflect.KProperty
import Base
import box0
import Box


var result: String by Delegate

object Delegate {
    var value = "lol"

    operator fun getValue(instance: Any?, data: KProperty<*>): String {
        return value
    }

    operator fun setValue(instance: Any?, data: KProperty<*>, newValue: String) {
        value = newValue
    }
}

fun box0(): String {
    val expected: Long? = -1L
    return if (Box().value == expected) "OK" else "fail"
}

//File: tmp/tmp1.kt

import result
import box1
import Delegate
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT

object Host {
    @JvmStatic fun concat(s1: String, s2: String, s3: String = "K", s4: String = "x") =
            s1 + s2 + s3 + s4
}

fun box1(): String {
    val f = ::result
    if (f.get() != "lol") return "Fail 1: {$f.get()}"
    Delegate.value = "rofl"
    if (f.get() != "rofl") return "Fail 2: {$f.get()}"
    f.set("OK")
    return f.get()
}

//File: tmp/tmp2.kt
import box2
import Host
// IGNORE_BACKEND_FIR: JVM_IR
open class Base<T>(val value: T)
class Box(): Base<Long>(-1)

fun box2(): String {
    val concat = Host::concat
    val concatParams = concat.parameters
    return concat.callBy(mapOf(
            concatParams[0] to "",
            concatParams[1] to "O",
            concatParams[3] to ""
    ))
}