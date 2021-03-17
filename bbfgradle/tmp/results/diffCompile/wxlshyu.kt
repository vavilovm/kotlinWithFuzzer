// Different compile happens on:JVM ,JVM -Xnew-inference
fun box(): String {
    val n: Any
TODO()
if (n !is Int
) return ""
    n!! !is Float
}