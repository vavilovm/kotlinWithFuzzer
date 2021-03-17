// Different compile happens on:JVM ,JVM -Xnew-inference

fun less1( b: Double
) = true && b == null && 1.1 <= b!!
