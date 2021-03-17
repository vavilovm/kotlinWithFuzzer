// Different compile happens on:JVM ,JVM -Xnew-inference

fun g(x: () -> Boolean = { Any().equals{x -> 
} }
) = true
