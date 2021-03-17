// Different compile happens on:JVM ,JVM -Xnew-inference

class Result
{
companion object {
fun <T : Any> success(value: T?): T
 =
            TODO()
}
}
fun <R> runCatching(block: () -> R)  {
Result.success(block())
}
