// Different compile happens on:JVM ,JVM -Xnew-inference

class Result<
 T>
 {
companion object {
fun <T> success(value: T): Result<T> =
            TODO()
fun <T> failure(): Result<T> =
            TODO()
    }
}
fun 
 runCatching()  {
try {
        Result.success(TODO())
    } catch (e: Throwable) {
        Result
.failure()
    }
}
