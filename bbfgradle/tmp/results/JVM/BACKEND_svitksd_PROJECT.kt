// Bug happens on JVM 
// !LANGUAGE: -ReleaseCoroutines, -ExperimentalBuilderInference
// WITH_RUNTIME
// WITH_COROUTINES
// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND: JS
// FILE: tmp0.kt

import helpers.*
import kotlin.coroutines.intrinsics.*
interface AsyncGenerator<in T> {
    suspend fun yield(value: T)
}
interface AsyncSequence<out T> {
    operator fun iterator() 
}
interface AsyncIterator<out T> {
    operator suspend fun hasNext(): Boolean
    operator suspend fun next() 
}
fun <T> asyncGenerate(): Int = TODO()
class AsyncGeneratorIterator<T>: AsyncIterator<Int>, AsyncGenerator<T>, ContinuationAdapter<Unit>() {
suspend fun computeNext(): Int = suspendCoroutineUninterceptedOrReturn {  c->
        TODO()
    }
@Suppress()
    fun resumeIterator():Int = TODO()
override suspend fun hasNext()  = TODO()
override suspend fun next()  = TODO()
// Completion continuation implementation
    override fun resume(value: Unit) = TODO()
override fun resumeWithException(exception: Throwable) = TODO()
// Generator implementation
    override suspend fun yield(value: T)  = TODO()
}

