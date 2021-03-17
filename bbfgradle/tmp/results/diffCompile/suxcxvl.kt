// Different compile happens on:JVM ,JVM -Xnew-inference

fun less1(a: Any
, b: Any
) = if (a is Double && b is Double) a!!.compareTo(b) == 
1 else null
