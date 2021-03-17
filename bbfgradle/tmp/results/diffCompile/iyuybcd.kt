// Different compile happens on:JVM ,JVM -Xnew-inference

fun <T> foo(t: T): T = TODO()
fun box()  {
1 == foo{}
}
