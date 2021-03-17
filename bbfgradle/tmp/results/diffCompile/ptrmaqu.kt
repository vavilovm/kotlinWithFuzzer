// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir

fun <T> foo(vararg ts: T): T? = TODO()
val v = foo(foo())
