// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
var materializer: Any
materializer = {}
materializer!!.invoke()
}
