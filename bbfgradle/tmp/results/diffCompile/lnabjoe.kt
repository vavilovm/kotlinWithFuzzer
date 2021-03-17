// Different compile happens on:JVM ,JVM -Xnew-inference

annotation class Anno(val x: Array<String> = emptyArray())
@Anno((::foo))
fun box(): String = TODO()