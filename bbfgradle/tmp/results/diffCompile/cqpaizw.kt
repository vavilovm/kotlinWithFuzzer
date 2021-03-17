// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir

fun foo()  {
val g:Any = TODO()
when (g) {
 true -> {class Local }
 else -> {class Local }
}
}
