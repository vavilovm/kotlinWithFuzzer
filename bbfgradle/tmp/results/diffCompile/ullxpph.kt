// Different compile happens on:JVM ,JVM -Xnew-inference

infix fun <R> R.or(alt: () -> R): R = TODO()
fun box()  {
     RuntimeException() or {}
}