// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// WITH_COROUTINES
// WITH_RUNTIME
// FILE: tmp0.kt

import helpers.*
import kotlin.coroutines.*

fun interface SuspendRunnable {
    suspend fun invoke()
}

fun run(r: SuspendRunnable) {
    r::invoke.startCoroutine(EmptyContinuation)
}

var result = "initial"

var resumingCallback: () -> Unit = {}

suspend fun bar(x: String = "def_x", y: Int = 1) {
    // Generate proper state machine
    suspendCoroutine<Unit> { "OK" }

    result = "OK"
}

fun box(): (String)? {
    run(::bar)

    if (result != "O") return "fail"

    resumingCallback()

    return result
}
