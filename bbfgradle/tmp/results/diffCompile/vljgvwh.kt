// Different compile happens on:JVM ,JVM -Xnew-inference
fun <T: Comparable<T>> id(x: T) = x
fun box()  {
    id(TODO())
}
