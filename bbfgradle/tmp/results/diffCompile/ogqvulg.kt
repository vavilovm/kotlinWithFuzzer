// Different compile happens on:JVM ,JVM -Xnew-inference

fun box(): String {
when (Any()) {
 false -> return ""
 else -> {{}}
}
return ""
}
