// Different compile happens on:JVM ,JVM -Xnew-inference

fun foo(
        ee: Int = 1,ff: Int = 1): String = TODO()
var result = 1.rangeTo(TODO()).map(::foo).joinToString()
