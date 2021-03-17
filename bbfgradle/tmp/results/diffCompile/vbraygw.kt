// Different compile happens on:JVM ,JVM -Xnew-inference

fun eqFL(x: Any
, y: Any
) = x is Float
    && y is Long
       && x!! == y!!
