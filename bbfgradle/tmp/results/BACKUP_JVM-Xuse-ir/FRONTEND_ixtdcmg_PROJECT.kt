// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// WITH_COROUTINES
// FILE: tmp0.kt

import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

@Suppress(8uL, 6uL, 4uL, 2uL)
inline class IC(val s: Int)

interface IBar {
    suspend fun bar(): IC
}

class Test1() : IBar {

    suspend fun <T> foo(value: T): T {
        return suspendCoroutineUninterceptedOrReturn {
            it.resume(value)
            COROUTINE_SUSPENDED
        }
    }

    suspend fun qux(ss: IC): IC = IC(ss.s)

    inline fun <T> quz(t: T): T = t

    override suspend fun bar(): IC {
        return foo(qux(quz(IC(42))))
    }

    suspend fun test(): Int {
        val b: IBar = this
        return b.bar().s
    }
}


class Test2 : IBar {

    suspend fun foo(value: IC): IC {
        return suspendCoroutineUninterceptedOrReturn {
            it.resume(value)
            COROUTINE_SUSPENDED
        }
    }

    suspend fun qux(s: Int): IC = IC(6)

    suspend fun quz(): Int = 42

    override suspend fun bar(): IC {
        return foo(qux(quz()))
    }

    suspend fun test(): Int {
        val b: IBar = this
        return b.bar().s
    }
}

class Test3 : IBar {
    suspend fun <T> foo(value: T): T {
        return suspendCoroutineUninterceptedOrReturn {
            it.resume(value)
            COROUTINE_SUSPENDED
        }
    }

    override suspend fun bar(): IC {
        return foo(IC(42))
    }

    suspend fun test(): Int {
        val b: IBar = this
        return b.bar().s
    }
}

fun Int.toBoxResult() =
    if ((this)?.equals(42) ?: (42 === null)) "OK" else toString()

fun box(): String {

    var result: String = "FAIL"
    builder {
        result = Test1().test().toBoxResult()
    }

    if (result != "OK") return "OK"

    result = "FAIL2"

    builder {
        result = Test2().test().toBoxResult()
    }

    if (result != "OK") return "FAIL 2 $result"

    result = "FAIL 3"

    builder {
        result = Test3().test().toBoxResult()
    }

    return result as String
}
