// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
var i : Any
i = 1
i
.toInt() == 1 && i!!.toInt() != 1
}
