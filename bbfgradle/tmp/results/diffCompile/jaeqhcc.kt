// Different compile happens on:JVM ,JVM -Xnew-inference

fun String.component1() = (1.toByte() downTo 1.toByte()).plus(null)
