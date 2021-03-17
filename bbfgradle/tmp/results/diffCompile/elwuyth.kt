// Different compile happens on:JVM ,JVM -Xnew-inference

inline fun <reified T: Comparable<Double>> lessReified(a: T ): Boolean = TODO()
fun box()  {
lessReified(TODO() )
}