// Different compile happens on:JVM ,JVM -Xnew-inference

fun ltDI(x: Any
, y: Any
) =
    x is Double && y is Int && x < y!!
