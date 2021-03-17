// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  =
        "" + try {
val x:Any = TODO()
when (x) {
 true -> {{}}
}
}
catch (e: Exception) {}
