// Different compile happens on:JVM ,JVM -Xnew-inference

class Result<
 T> {
companion object {
fun <T> success(): Result<T> =
            TODO()
fun <T> failure(): Result<T> =
            TODO()
    }
}
fun <R> runCatching(): Result<R> {
    return try {
        Result.success()
    } catch (e: Throwable) {
        Result.failure()
    }!!
}
