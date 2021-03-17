// Different compile happens on:JVM ,JVM -Xnew-inference

fun bar(f: () -> Unit
): String
 = TODO()
fun box(): String {
val y1 = bar(::box)
return ""
}