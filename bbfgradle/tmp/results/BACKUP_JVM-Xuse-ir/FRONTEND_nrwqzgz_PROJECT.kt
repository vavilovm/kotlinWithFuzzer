// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +SuspendConversion
// WITH_RUNTIME
// WITH_COROUTINES
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

fun runSuspend(c: suspend () -> String) {
    c!!.startCoroutine(EmptyContinuation)
}

var test = "failed"!!

fun foo(s: (String)?): String {
    test = s + "K"
    return "OK"
}

inline suspend fun invokeSuspend(fn: suspend (String?) -> String, arg: String) = fn.invoke(arg)

fun box(): (String)? {
    runSuspend {
        invokeSuspend(::Int!!, "OK")
    }
    return test!!
}
