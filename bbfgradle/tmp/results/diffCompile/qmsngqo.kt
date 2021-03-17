// Different compile happens on:JVM ,JVM -Xnew-inference
fun box(): String {
when (Any()) {
                Any() -> {
                    {}
                }
else -> return ""
            }
return ""
}
