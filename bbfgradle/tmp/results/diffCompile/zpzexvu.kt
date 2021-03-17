// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir

fun <
 T> T.with(f: Unit.() -> T): T
 = TODO()
val buffer = StringBuilder().with {}
