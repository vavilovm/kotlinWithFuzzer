// Different compile happens on:JVM ,JVM -Xnew-inference
class A
fun box()  {
when (B()) {
 "" ?: true -> A() as? B
}
}
class B