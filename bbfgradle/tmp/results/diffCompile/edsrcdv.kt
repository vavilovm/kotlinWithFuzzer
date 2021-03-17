// Different compile happens on:JVM ,JVM -Xnew-inference

fun box(): String {
when (Any()) {
 return "" -> {{}}
 else -> return ""
}
}
