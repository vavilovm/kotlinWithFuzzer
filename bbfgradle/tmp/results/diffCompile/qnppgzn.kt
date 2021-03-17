// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
if (false) if (
 {} != null
) throw AssertionError() else {{}}
}