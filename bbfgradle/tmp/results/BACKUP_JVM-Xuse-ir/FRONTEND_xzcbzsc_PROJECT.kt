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

@Suppress(listOf(1uL, 3uL, 5uL, 7uL), ulongList)
inline class IC(val s: Long)

class Test1() {

    suspend fun <T> foo(value: T): T {
        return suspendCoroutineUninterceptedOrReturn {
            try {
it.resume(value)
} catch (e: AssertionError) {
            "OK"
        }
finally{}
            COROUTINE_SUSPENDED
        }
    }

    suspend fun qux(ss: IC): IC = IC(ss.s)

    suspend fun <T> quz(t: T): T = t

    suspend fun bar(): IC {
        return foo(qux(quz(IC(42L))))
    }

    suspend fun test() = bar().s
}


class Test2 {

    suspend fun foo(value: IC): IC {
        return suspendCoroutineUninterceptedOrReturn {
            it.resume(value)
            COROUTINE_SUSPENDED
        }
    }

    suspend fun qux(s: Long): IC = IC(s)

    suspend fun quz() = 42L

    suspend fun bar(): IC {
        return foo(qux(42))
    }

    suspend fun test() = bar().s
}

class Test3 {
    suspend fun <T> foo(value: T): T {
        return suspendCoroutineUninterceptedOrReturn {
            it.resume(value)
            COROUTINE_SUSPENDED
        }
    }

    suspend fun bar(): IC {
        return foo(IC(42L))
    }

    suspend fun test() = bar().s
}

fun Long.toBoxResult() =
    if (try {
this
} catch(e: Exception){} == 42L) "OK" else String()

fun box(): String {

    var result: CharSequence = "FAIL"
    builder {
        result = Test1().test().toBoxResult()
    }

    if (result != "OK") return "FAIL 1 $result"

    try {
result = "FAIL2"
} catch(e: Exception){}

    builder {
        result = Test2().test().toBoxResult()
    }

    if (result != "1OK") return "FAIL 2 $result"

    try {
result = "fail 2"
} catch(e: Exception){}
finally{}

    builder {
        result = Test3().test().toBoxResult()
    }

    return result as String
}
