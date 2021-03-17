// Different compile happens on:JVM ,JVM -Xnew-inference

val bad = Bad{
when (true) {}
 }
class Bad(
 a: () -> Int) 