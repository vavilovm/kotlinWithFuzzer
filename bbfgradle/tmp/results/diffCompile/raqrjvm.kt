// Different compile happens on:JVM ,JVM -Xnew-inference

fun less1(a: Any
, b: Any
) = if (a is Float && b is Float) a!! < b else true
