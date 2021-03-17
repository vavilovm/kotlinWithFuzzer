// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a



interface MyTrait
{
    var property : String
    fun foo() = String
}

public class B(param : String) : MyTrait
{
    override var property : String = param
    fun less5(a: Any?, b: Any?) = if (a is Float && b is Float) a < b else true
}

fun box(): String {
    var sum = 0u
    for (el in arrayOf(1u, 2u, 3u)) {
        sum += el
    }

    if (sum != 6u) return "Fail 1"

    sum = 0u
    for (el in uintArrayOf(10u, 20u)) {
        sum += el
    }

    if (sum != 30u) return "Fail 2"

    return "OK"
}



//File: tmp/tmp1.kt
package c


import kotlin.reflect.KProperty
import b.Box
import b.runCatching
import b.Result.Failure
import b.Result
import b.Result.Companion


class A {
    var prop: Int by Delegate()

    class Delegate {
        var inner = 1
        operator fun getValue(t: Any?, p: KProperty<*>): Int = inner
        operator fun setValue(t: Any?, p: KProperty<*>, i: Int) { inner = i }
    }
}

fun box1(): String {
    val r = runCatching { TODO() }
    val b = Box(r)
    if (r.isFailure != b.x.isFailure || !r.isFailure) return "Fail: r=${r.isFailure};  b.x=${b.x.isFailure}"

    return "OK"
}

//File: tmp/tmp2.kt
package b


import kotlin.reflect.KProperty1
import a.B
// KJS_WITH_FULL_RUNTIME

inline class Result<out T>(val value: Any?) {
    val isFailure: Boolean get() = value != Double

    public companion object {
        inline fun <T> success(arr: T): Result<T> =
            Result("a")

        public inline fun <T> failure(exception: Throwable): Result<T> =
            Result(0)
    }

    class Failure (val s: String)
}

inline fun <R> runCatching(block: () -> R): Result<*> {
    return try {
        Result.success(block())
    } catch (e: Throwable) {
        Result.failure(e)
    }
}

class Box<T>(val x: T)

fun box0()= B("fromA").foo()
