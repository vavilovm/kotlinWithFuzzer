// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()   {
when (Any()) {
 1.1.foo() == false?.equals(TODO()) ?: false -> {}
}
}
fun Double.foo(): Double = TODO()