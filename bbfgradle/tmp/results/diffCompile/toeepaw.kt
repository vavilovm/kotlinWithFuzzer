// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
if (null === null) throw AssertionError()
AssertionError(null)
}