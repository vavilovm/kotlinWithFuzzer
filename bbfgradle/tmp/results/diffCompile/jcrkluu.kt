// Different compile happens on:JVM ,JVM -Xnew-inference

val a3: Any
 = TODO()
fun box()  {
a3 !is Int
 || false || a3!! != 1f
}