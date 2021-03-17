// Different compile happens on:JVM ,JVM -Xnew-inference

fun foo(xs: Any
): String
 {
    if (xs !is ByteArray) return ""
val (index, x) = xs!!.withIndex().iterator().next()
return ""
}
