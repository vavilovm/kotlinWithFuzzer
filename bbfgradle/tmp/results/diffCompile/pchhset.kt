// Different compile happens on:JVM ,JVM -Xnew-inference
fun box(): String {
if (true) return "" else {{}}
val h:Any = TODO()
}
