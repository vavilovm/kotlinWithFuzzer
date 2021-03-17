// Different compile happens on:JVM ,JVM -Xnew-inference

fun lt(x: Any, y: Any) = x is Double && y is Float && x!! < y
