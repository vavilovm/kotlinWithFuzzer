// Bug happens on JVM 
// !LANGUAGE: -ReleaseCoroutines
// WITH_REFLECT
// WITH_COROUTINES
// IGNORE_BACKEND: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*
class A<T : Int> {
    suspend fun foo():Int = TODO()
suspend fun bar(): Int {
        TODO()
        return suspendCoroutineUninterceptedOrReturn {  x->
            x.resume(TODO())
            COROUTINE_SUSPENDED
        }
    }
}

