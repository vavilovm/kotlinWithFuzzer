// Different compile happens on:JVM ,JVM -Xnew-inference

fun Double.foo(): Double = TODO()
fun test()  {
when (1.1?.foo() ?: t) {
 1 -> true
}
}
val t = true
