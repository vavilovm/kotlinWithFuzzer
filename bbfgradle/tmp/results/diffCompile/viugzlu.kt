// Different compile happens on:JVM ,JVM -Xnew-inference

fun foo() {
when (Any()) {
 true -> {{}}
 else -> return
}
}
