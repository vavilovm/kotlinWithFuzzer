// Different compile happens on:JVM ,JVM -Xnew-inference

fun greater1(a: Any
, b: Any
) = if (a is Double && b is Double) a > b!! else null
