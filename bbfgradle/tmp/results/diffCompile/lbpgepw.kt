// Different compile happens on:JVM ,JVM -Xnew-inference
fun box(): String {
val t:Any = TODO()
when (Any()) {
true -> {{}}
 else ->
return ""
}
}